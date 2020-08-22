package com.prodev.moveme.customFonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;

public class EditText__SF_Pro_Display_Regular extends AppCompatEditText {

    public EditText__SF_Pro_Display_Regular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public EditText__SF_Pro_Display_Regular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EditText__SF_Pro_Display_Regular(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/SF-Pro-Display-Regular.otf");
            setTypeface(tf);
        }
    }

}