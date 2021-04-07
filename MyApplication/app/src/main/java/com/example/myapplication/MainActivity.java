package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    private GestureDetector mGestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGestureDetector = new GestureDetector(this, new GestureDetector.OnGestureListener() {
            @Override
            public boolean onDown(MotionEvent motionEvent) {
                Log.e("###ken###-input", "MainActivity::onDown " + motionEvent.getAction());
                return false;
            }

            @Override
            public void onShowPress(MotionEvent motionEvent) {
                Log.e("###ken###-input", "MainActivity::onShowPress " + motionEvent.getAction());
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                Log.e("###ken###-input", "MainActivity::onSingleTapUp " + motionEvent.getAction());
                return false;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
                Log.e("###ken###-input", "MainActivity::onScroll-1 " + motionEvent.getAction());
                Log.e("###ken###-input", "MainActivity::onScroll-2 " + motionEvent1.getAction());
                Log.e("###ken###-input", "MainActivity::onScroll-3 " + v);
                Log.e("###ken###-input", "MainActivity::onScroll-4 " + v1);
                return false;
            }

            @Override
            public void onLongPress(MotionEvent motionEvent) {
                Log.e("###ken###-input", "MainActivity::onLongPress " + motionEvent.getAction());
            }

            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
                Log.e("###ken###-input", "MainActivity::onFling-1 " + motionEvent.getAction());
                Log.e("###ken###-input", "MainActivity::onFling-2 " + motionEvent1.getAction());
                Log.e("###ken###-input", "MainActivity::onFling-3 " + v);
                Log.e("###ken###-input", "MainActivity::onFling-4 " + v1);
                return false;
            }
        });
    }


    public boolean onTouchEvent(MotionEvent event) {
        Log.e("###ken###-input", "MainActivity::onTouchEvent "+ event.getAction());
        return mGestureDetector.onTouchEvent(event);
    }


}
