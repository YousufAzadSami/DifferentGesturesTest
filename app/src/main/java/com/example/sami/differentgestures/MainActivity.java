package com.example.sami.differentgestures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity
        implements  GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private TextView mInformerButton;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInformerButton = (TextView) findViewById(R.id.informerButton);
        this.gestureDetector = new GestureDetectorCompat(this, this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    ///////// GESTURE METHODS //////////
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        mInformerButton.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        mInformerButton.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        mInformerButton.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        mInformerButton.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        mInformerButton.setText("onShowPress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        mInformerButton.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        mInformerButton.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        mInformerButton.setText("onLongPress");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        mInformerButton.setText("onFling");
        return true;
    }

    ///////// GESTURE METHODS //////////


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
