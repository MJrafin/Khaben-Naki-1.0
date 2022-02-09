package com.premiernoobs.khabennakiuser.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.premiernoobs.khabennakiuser.Fragment.WelcomeFragment;
import com.premiernoobs.khabennakiuser.R;

public class PageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        String activity = getIntent().getExtras().getString("Fragment"); // get fragment direction

        if(activity == null){
            Log.d("Verify", getIntent().getStringExtra("Fragment")+"");
        }

        if(activity.equals(String.valueOf(R.string.WELCOME_FRAGMENT))){

            WelcomeFragment inviteDoctorFragment = new WelcomeFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout_id, inviteDoctorFragment).commit();

        }

    }
}