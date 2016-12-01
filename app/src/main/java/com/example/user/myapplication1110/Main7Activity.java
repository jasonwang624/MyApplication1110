package com.example.user.myapplication1110;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main7Activity extends AppCompatActivity {

//    String[] fruits = {"蘋果", "鳳梨", "芭樂", "香蕉"};
    String[] cities = {"台北", "台中", "台南", "高雄"};
    String[] codes = {"02", "04", "06", "07"};
    int[] icons = {R.drawable.tp,R.drawable.tc,R.drawable.tn,R.drawable.ks};
    ArrayList<Map<String, Object>> mylist;

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        lv = (ListView) findViewById(R.id.listView);

        mylist = new ArrayList<>();
        for (int i=0;i<cities.length;i++)
        {
            Map m = new HashMap();
            m.put("city", cities[i]);
            m.put("code", codes[i]);
            m.put("img", icons[i]);
            mylist.add(m);
        }

        SimpleAdapter adapter = new SimpleAdapter(Main7Activity.this,
                mylist, R.layout.myitem,
                new String[] {"city", "code","img"},
                new int[] {R.id.textView3, R.id.textView4,R.id.imageView2});

        lv.setAdapter(adapter);
    }
}
