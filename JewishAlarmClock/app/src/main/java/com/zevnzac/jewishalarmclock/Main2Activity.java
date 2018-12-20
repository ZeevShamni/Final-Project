package com.zevnzac.jewishalarmclock;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

//    private ListView listViewProperties;
//    private String[] properties = {"Repeat", "Alarm name", "Alarm sound", "Vibration"};
//
//
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//
//        listViewProperties = (ListView)findViewById(R.id.listProperties);
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>
//                (this, android.R.layout.simple_list_item_1, properties);
//
//        listViewProperties.setAdapter(arrayAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater  = getMenuInflater();
        menuInflater.inflate(R.menu.menu_choice, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void repeat_onClick(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.inflate(R.menu.menu_settings);
        popupMenu.show();

    }


}
