package com.example.namrata.hellokindle;


        import android.content.Context;
        import android.graphics.Canvas;
        import android.graphics.drawable.BitmapDrawable;
        import java.util.Random;
        import android.app.Activity;
        import android.media.AudioManager;
        import android.media.MediaPlayer;
        import android.os.Handler;
        import android.util.AttributeSet;
        import android.widget.ImageView;

public class AnimatedView extends ImageView {
    private Context mContext;
    int x = -1;
    int y = -1;
    int count = 0;
    private static final String TAG = "your activity name";
    private int peak = 0;

    private int xVelocity = 10;
    private int yVelocity = 10;
    private Handler h;
    private final int FRAME_RATE = 30;
    MediaPlayer mp;

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

        AudioManager audioManager = (AudioManager) mContext.getSystemService(Context.AUDIO_SERVICE);
        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 20, 0);

        if (count == 1) {
            ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball1);
        }
        else if (count == 2) {
            ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball2);
        }
        else if (count == 3) {
            ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball3);
        }
        else if (count == 4) {
            ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball4);
        }
        else if (count == 5) {
            ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball5);
        }
        else if (count == 6) {
            ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball6);
        }
        else if (count == 7) {
            ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball7);
        }
        else if (count == 8) {
            ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball8);
        }
        else if (count == 9) {
            ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball9);
        }
        else if (count == 10) {
            ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball10);
        }

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
                    //yVelocity = yVelocity + 1;
                    //yVelocity = randInt(-20, -10);
                }
                if (peak < this.getHeight() - ball.getBitmap().getHeight()) {
                    peak = peak + 40;
                    if (count == 1) {
                        if (mp != null){
                            if (mp.isPlaying()||mp.isLooping()) {
                                mp.stop();
                            }
                            mp.release();
                            mp = null;
                        }
                        ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball1);
                        mp = MediaPlayer.create(mContext, R.raw.number1);
                        mp.start();
                    }
                    else if (count == 2) {
                        ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball2);
                        if (mp != null){
                            if (mp.isPlaying()||mp.isLooping()) {
                                mp.stop();
                            }
                            mp.release();
                            mp = null;
                        }
                        mp = MediaPlayer.create(mContext, R.raw.number2);
                        mp.start();
                    }
                    else if (count == 3) {
                        ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball3);
                        if (mp != null){
                            if (mp.isPlaying()||mp.isLooping()) {
                                mp.stop();
                            }
                            mp.release();
                            mp = null;
                        }
                        mp = MediaPlayer.create(mContext, R.raw.number3);
                        mp.start();
                    }
                    else if (count == 4) {
                        ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball4);
                        if (mp != null){
                            if (mp.isPlaying()||mp.isLooping()) {
                                mp.stop();
                            }
                            mp.release();
                            mp = null;
                        }
                        mp = MediaPlayer.create(mContext, R.raw.number4);
                        mp.start();
                    }
                    else if (count == 5) {
                        ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball5);
                        if (mp != null){
                            if (mp.isPlaying()||mp.isLooping()) {
                                mp.stop();
                            }
                            mp.release();
                            mp = null;
                        }
                        mp = MediaPlayer.create(mContext, R.raw.number5);
                        mp.start();
                    }
                    else if (count == 6) {
                        ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball6);
                        if (mp != null){
                            if (mp.isPlaying()||mp.isLooping()) {
                                mp.stop();
                            }
                            mp.release();
                            mp = null;
                        }
                        mp = MediaPlayer.create(mContext, R.raw.number6);
                        mp.start();
                    }
                    else if (count == 7) {
                        ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball7);
                        if (mp != null){
                            if (mp.isPlaying()||mp.isLooping()) {
                                mp.stop();
                            }
                            mp.release();
                            mp = null;
                        }
                        mp = MediaPlayer.create(mContext, R.raw.number7);
                        mp.start();
                    }
                    else if (count == 8) {
                        ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball8);
                        if (mp != null){
                            if (mp.isPlaying()||mp.isLooping()) {
                                mp.stop();
                            }
                            mp.release();
                            mp = null;
                        }
                        mp = MediaPlayer.create(mContext, R.raw.number8);
                        mp.start();
                    }
                    else if (count == 9) {
                        ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball9);
                        if (mp != null){
                            if (mp.isPlaying()||mp.isLooping()) {
                                mp.stop();
                            }
                            mp.release();
                            mp = null;
                        }
                        mp = MediaPlayer.create(mContext, R.raw.number9);
                        mp.start();
                    }
                    else if (count == 10) {
                        ball = (BitmapDrawable)mContext.getResources().getDrawable(R.drawable.ball10);
                        if (mp != null){
                            if (mp.isPlaying()||mp.isLooping()) {
                                mp.stop();
                            }
                            mp.release();
                            mp = null;
                        }
                        mp = MediaPlayer.create(mContext, R.raw.number10);
                        mp.start();
                    }
                    count = count + 1;
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