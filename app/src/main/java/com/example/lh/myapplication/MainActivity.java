package com.example.lh.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ColorSelector colorSelector = (ColorSelector) findViewById(R.id.lsq_color_selector);
        final TextView textView = (TextView) findViewById(R.id.lsq_tv);
        colorSelector.setColorChangeListener(new ColorSelector.OnColorChangeListener()
        {
            @Override
            public void onColorChangeListener(int color)
            {
                textView.setTextColor(color);
                textView.postInvalidate();
            }
        });
    }
}
