package com.example.user.myapplication1110;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"周杰倫");
        menu.add(0,1,1,"劉德華");
        menu.add(0,2,2,"next");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == 0)
        {
            Toast.makeText(Main3Activity.this, "周杰倫-范特西", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId() == 1)
        {
            Toast.makeText(Main3Activity.this, "劉的華-忘情水", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId() == 2)
        {
            Intent it = new Intent(Main3Activity.this,Main5Activity.class);
            startActivity(it);
        }
        return super.onOptionsItemSelected(item);
    }
    public void click1(View v)
    {
        Intent it = new Intent(Main3Activity.this,Main5Activity.class);
        startActivity(it);
    }

}
