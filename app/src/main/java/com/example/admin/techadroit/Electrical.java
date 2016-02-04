package com.example.admin.techadroit;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Electrical extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crossroads);
        getActionBar().setHomeButtonEnabled(true);
       getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setTitle("Light it Up");
        getActionBar().setIcon(new ColorDrawable(Color.TRANSPARENT));
        getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#403c85")));
        TextView descrp = (TextView) findViewById(R.id.descrp);
        descrp.setText("Light It Up is based on the use of basic electrical and electronic components to obtain a certain desired output. The event will take place in a team of two. The material kit will be provided on the spot.");
        TextView date = (TextView) findViewById(R.id.date);
        date.setText("Date: 5th March 2016 and 6th March 2016");
        TextView time = (TextView) findViewById(R.id.time);
        time.setText("Time:  10:00 AM – 2:00 PM");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_robotics, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        else if (id == android.R.id.home) { // app icon in action bar clicked; goto parent activity.
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
