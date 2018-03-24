package com.example.android.coffeeorder;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by liam2 on 08.10.2017.
 */

public class FCViewPager extends ViewPager {

    private boolean enableSwipe;

    public FCViewPager(Context context) {
        super(context);
        init();
    }

    public FCViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        enableSwipe = false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        // Never allow swiping to switch between pages
        return enableSwipe && super.onInterceptTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // Never allow swiping to switch between pages
        return enableSwipe && super.onTouchEvent(event);

    }
}
