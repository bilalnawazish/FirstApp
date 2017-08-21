package com.example.bilal.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by bilal on 8/18/17.
 */

public class Layout extends Activity {

    private ListView lvFood;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        String[] foods= {"Pizza","Burger","Paratha","Sandwitch","Candy","Potato","Chocolate Nan","Karahi","Tuna"};
        ListAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,foods);
        lvFood = (ListView) findViewById(R.id.lvfood);
        lvFood.setAdapter(listAdapter);
        
    }
}
