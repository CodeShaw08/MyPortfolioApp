package com.udacity.android.myportfolioapp;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void displayToastMessage(CharSequence text){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void onClickButton(View v){
        String s=getString(R.string.buttonToastMessage);

        displayToastMessage(s);
    }

    public void onClickButton02(View v){
        String s=getString(R.string.buttonToastMessage02);

        displayToastMessage(s);
    }

    public void onClickButton03(View v){
        String s=getString(R.string.buttonToastMessage03);

        displayToastMessage(s);
    }

    public void onClickButton04(View v){
        String s=getString(R.string.buttonToastMessage04);

        displayToastMessage(s);
    }

    public void onClickButton05(View v){
        String s=getString(R.string.buttonToastMessage05);

        displayToastMessage(s);
    }

    public void onClickButton06(View v){
        String s=getString(R.string.buttonToastMessage06);

        displayToastMessage(s);
    }


}
