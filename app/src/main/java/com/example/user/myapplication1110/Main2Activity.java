package com.example.user.myapplication1110;

import android.app.FragmentBreadCrumbs;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("周杰倫");
        menu.add("劉德華");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getTitle().toString().equals("周杰倫"))
        {
            Toast.makeText(Main2Activity.this,"周杰倫-范特西",Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle().toString().equals("劉德華"))
        {
            Toast.makeText(Main2Activity.this,"劉德華-忘情水",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
    public void click1(View v)
    {
        Intent it = new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(it);
    }
}
