package com.yypbd.fontawesomelibsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.yypbd.fontawesomelib.FontawesomeLib;

import java.util.ArrayList;

public class IconListActivity extends AppCompatActivity {
    private RecyclerView recyclerViewIcon;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_list);

        recyclerViewIcon = findViewById(R.id.recyclerViewIcon);

        ArrayList<IconItem> iconList = new ArrayList<>();

        Intent intent = getIntent();
        int type = intent.getIntExtra("font_type", 0);
        FontawesomeLib.FontType fontType;
        if (type == 0) {
            fontType = FontawesomeLib.FontType.TYPE_SOLID;
        }
        else if (type == 1) {
            fontType = FontawesomeLib.FontType.TYPE_REGULAR;
        }
        else {
            fontType = FontawesomeLib.FontType.TYPE_BRAND;
        }

        for (String key : FontawesomeLib.getInstance().getCharMap(fontType).keySet()) {
            iconList.add(new IconItem(key));
        }

        layoutManager = new LinearLayoutManager(this);
        recyclerViewIcon.setLayoutManager(layoutManager);
        mAdapter = new IconAdapter(fontType, iconList);
        recyclerViewIcon.setAdapter(mAdapter);
    }
}
