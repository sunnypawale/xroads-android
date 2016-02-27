package com.li.xroads.activity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.li.xroads.R;

public class LoginActivity extends Activity implements View.OnClickListener {

    ActionBar actionBar;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        loginButton = (Button) findViewById(R.id.loginActLoginButton);
        loginButton.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.loginActLoginButton:
                intent = new Intent(this, TrackingMapsActivity.class);
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
