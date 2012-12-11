package com.fightfleet.fightfleetclient.Activity;

import com.fightfleet.fightfleetclient.R;
import com.fightfleet.fightfleetclient.R.layout;
import com.fightfleet.fightfleetclient.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class ChangePassword extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_change_password, menu);
        return true;
    }
    
    public void ifSuccessful(View view){
    	Intent intent = new Intent (this, Reset_Password.class);
    	startActivity(intent);
    }
}
