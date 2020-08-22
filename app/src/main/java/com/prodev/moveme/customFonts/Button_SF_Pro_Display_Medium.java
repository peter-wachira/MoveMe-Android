package com.prodev.moveme.customFonts;

import android.content.Context;
import android.graphics.Typeface;

import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

/**
 * Created by praja on 17-May-17.
 */

public class Button_SF_Pro_Display_Medium extends AppCompatButton {

    public Button_SF_Pro_Display_Medium(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public Button_SF_Pro_Display_Medium(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Button_SF_Pro_Display_Medium(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/SF-Pro-Display-Medium.otf");
            setTypeface(tf);
        }
    }
}
