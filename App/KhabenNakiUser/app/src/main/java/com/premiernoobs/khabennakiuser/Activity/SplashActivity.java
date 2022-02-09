package com.premiernoobs.khabennakiuser.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.premiernoobs.khabennakiuser.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // go to the main activity after splash screen
        Intent intent = new Intent(getApplicationContext(), PageActivity.class);
        intent.putExtra("Fragment", String.valueOf(R.string.WELCOME_FRAGMENT));
        startActivity(intent);
        overridePendingTransition(0, 0); //intent soft animation
        finish();

    }
}