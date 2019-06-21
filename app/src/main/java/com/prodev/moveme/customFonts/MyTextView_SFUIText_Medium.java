package com.prodev.moveme.customFonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;


public class MyTextView_SFUIText_Medium extends AppCompatTextView {

    public MyTextView_SFUIText_Medium(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextView_SFUIText_Medium(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextView_SFUIText_Medium(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/SFUIText-Medium.ttf.ttf");
            setTypeface(tf);
        }
    }

}