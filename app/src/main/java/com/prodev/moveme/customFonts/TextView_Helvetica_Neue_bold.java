package com.prodev.moveme.customFonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class TextView_Helvetica_Neue_bold extends AppCompatTextView {

    public TextView_Helvetica_Neue_bold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TextView_Helvetica_Neue_bold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextView_Helvetica_Neue_bold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/helvetica-neue-bold.ttf");
            setTypeface(tf);
        }
    }

}