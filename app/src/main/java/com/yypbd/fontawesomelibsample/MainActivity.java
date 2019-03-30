package com.yypbd.fontawesomelibsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.yypbd.fontawesomelib.FontawesomeLib;

public class MainActivity extends AppCompatActivity {
    private Button buttonShowSolid;
    private Button buttonShowRegular;
    private Button buttonShowBrand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FontawesomeLib.getInstance().init(getAssets(), "fonts/fa-solid-900.ttf", "fonts/fa-regular-400.ttf", "fonts/fa-brands-400.ttf");

        initUI();
        initListener();

        // FontawesomeLib.getInstance().setIcon(FontawesomeLib.FontType.TYPE_SOLID, "ad", textViewTest);
    }

    private void initListener() {
        buttonShowSolid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), IconListActivity.class);
                intent.putExtra("font_type", 0);
                startActivity(intent);
            }
        });

        buttonShowRegular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), IconListActivity.class);
                intent.putExtra("font_type", 1);
                startActivity(intent);
            }
        });

        buttonShowBrand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), IconListActivity.class);
                intent.putExtra("font_type", 2);
                startActivity(intent);
            }
        });
    }

    private void initUI() {
        buttonShowSolid = findViewById(R.id.buttonShowSolid);
        buttonShowRegular = findViewById(R.id.buttonShowRegular);
        buttonShowBrand = findViewById(R.id.buttonShowBrand);
    }
}
