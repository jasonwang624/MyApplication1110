package com.example.user.myapplication1110;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main6Activity extends AppCompatActivity {
    String[] country = {"台灣","美國","日本","北韓","中國","義大利"};
    String[] cities = {"台北", "台中", "台南", "高雄"};
    String[] codes = {"02", "04", "06", "07"};
    ArrayList<Map<String, String>> mylist;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        lv = (ListView)findViewById(R.id.listView);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Main6Activity.this,android.R.layout.simple_list_item_2,country);
        mylist = new ArrayList<>();
        for (int i=0;i<cities.length;i++)
        {
            Map m = new HashMap();
            m.put("city", cities[i]);
            m.put("code", codes[i]);
            mylist.add(m);
        }

        SimpleAdapter adapter = new SimpleAdapter(Main6Activity.this,
                mylist, android.R.layout.simple_list_item_2,
                new String[] {"city", "code"},
                new int[] {android.R.id.text1, android.R.id.text2});


        lv.setAdapter(adapter);
    }
}
