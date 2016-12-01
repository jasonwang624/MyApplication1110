package com.example.user.myapplication1110;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.WrapperListAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.layout4);
        setContentView(R.layout.activity_main);

//        LinearLayout ll = new LinearLayout(MainActivity.this);
//        //ll.setOrientation(LinearLayout.VERTICAL);
//        ll.setOrientation(LinearLayout.HORIZONTAL);
//
//        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT,1);
//
//        Button btn = new Button(MainActivity.this);
//        btn.setText("Button!!");
//        btn.setLayoutParams(params);
//        ll.addView(btn);
//        Button btn2 = new Button(MainActivity.this);
//        btn2.setText("Button  22!!");
//        btn2.setLayoutParams(params);
//        ll.addView(btn2);
//        setContentView(ll);
//        Button btn = new Button(MainActivity.this);
//        btn.setText("Click me!");
//        setContentView(btn);

    }
    public void click1(View v)
    {
        v.setVisibility(View.INVISIBLE);
    }
    public void click5(View v)
    {
        Intent it = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(it);

    }

}

