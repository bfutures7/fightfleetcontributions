package com.fightfleet.fightfleetclient.Activity;

import com.fightfleet.fightfleetclient.R;
import com.fightfleet.fightfleetclient.R.layout;
import com.fightfleet.fightfleetclient.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class Reset_Password extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset__password);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_reset__password, menu);
        return true;
    }
    
    public void onReset(){
    	Intent intent = new Intent(this, LoginActivity.class);
    	startActivity(intent);
    }
}
