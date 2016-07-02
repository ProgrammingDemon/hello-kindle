package com.example.namrata.hellokindle;


        import android.content.Context;
        import android.graphics.Canvas;
        import android.graphics.drawable.BitmapDrawable;
        import java.util.Random;
        import android.os.Handler;
        import android.util.AttributeSet;
        import android.widget.ImageView;

public class AnimatedView extends ImageView {
    private Context mContext;
    int x = -1;
    int y = -1;
    private static final String TAG = "your activity name";
    private int peak = 0;

    private int xVelocity = 10;
    private int yVelocity = 10;
    private Handler h;
    private final int FRAME_RATE = 30;

    public AnimatedView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        h = new Handler();
    }

    private Runnable r = new Runnable() {
        @Override
        public void run() {
            invalidate();
        }
    };

    protected void onDraw(Canvas c) {
        BitmapDrawable ball = (BitmapDrawable) mContext.getResources().getDrawable(R.drawable.androidball);
        //if (peak > ball.getBitmap().getHeight()) {
            //peak = ball.getBitmap().getHeight();
        //}
        if (x < 0 && y < 0) {
            x = this.getWidth() / 2;
            y = this.getHeight() / 2;
        } else {
            x += xVelocity;
            y += yVelocity;
            if (x > this.getWidth() - ball.getBitmap().getWidth()) {
                x = this.getWidth() - ball.getBitmap().getWidth();
                xVelocity = xVelocity * -1;
                if (xVelocity > 0) {
                    xVelocity = randInt(10, 20);
                } else if (xVelocity < 0) {
                    xVelocity = randInt(-20, -10);
                }
            }
            if (x < 0) {
                x = 0;
                xVelocity = xVelocity * -1;
                if (xVelocity > 0) {
                    xVelocity = randInt(10, 20);
                } else if (xVelocity < 0) {
                    xVelocity = randInt(-20, -10);
                }
            }
            if (y > this.getHeight() - ball.getBitmap().getHeight()) {
                y = this.getHeight() - ball.getBitmap().getHeight();
                yVelocity = yVelocity * -1;
                if (yVelocity > 0) {
                    //yVelocity = randInt(10, 20);
                }
                else if (yVelocity < 0) {
                    //yVelocity = randInt(-20, -10);
                }
                if (peak < this.getHeight() - ball.getBitmap().getHeight()) {
                    peak = peak + 100;
                }
                else {
                    peak = this.getHeight() - ball.getBitmap().getHeight();
                    yVelocity = 0;
                    xVelocity = 0;
                }
            }
            if (y < peak) {
                y = peak;
                yVelocity = yVelocity * -1;
                if (yVelocity > 0) {
                    //yVelocity = randInt(10, 20);
                }
                else if (yVelocity < 0) {
                    //yVelocity = randInt(-20, -10);
                }
            }
            c.drawBitmap(ball.getBitmap(), x, y, null);
            h.postDelayed(r, FRAME_RATE);
        }
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();

        return rand.nextInt((max - min) + 1) + min;
    }
}