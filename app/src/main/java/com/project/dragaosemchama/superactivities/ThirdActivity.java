package com.project.dragaosemchama.superactivities;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class ThirdActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        if (new Random().nextBoolean()) {

            Intent intent = getIntent();
            byte[] bytearray = intent.getByteArrayExtra("bytearray");
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setTextSize(23);
            String surprise = "";
            for(byte element: bytearray)
                surprise += Byte.toString(element) + " ";
            textView.setText(surprise);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_third, menu);
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

        return super.onOptionsItemSelected(item);
    }

    public void startMainActivity(View view) {

        Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);
    }
}
