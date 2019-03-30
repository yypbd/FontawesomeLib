package com.yypbd.fontawesomelibsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.yypbd.fontawesomelib.FontawesomeLib;

public class MainActivity extends AppCompatActivity {
    private TextView textViewTest;
    private Button buttonSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTest = findViewById(R.id.textViewTest);
        buttonSample = findViewById(R.id.buttonSample);

        FontawesomeLib.getInstance().init(getAssets(), "fonts/fa-solid-900.ttf", "fonts/fa-regular-400.ttf", "fonts/fa-brands-400.ttf");

        FontawesomeLib.getInstance().setIcon(FontawesomeLib.FontType.TYPE_SOLID, "ad", textViewTest);
    }
}
