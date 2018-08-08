package com.example.vivek.tourguide;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // splash screen contents
        EasySplashScreen config = new EasySplashScreen(SplashScreen.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(3000)
                .withBackgroundColor(Color.parseColor(getString(R.string.bluish)))
                .withLogo(R.drawable.mah)
                .withHeaderText(getString(R.string.welcome))
                .withFooterText(getString(R.string.credit))
                .withAfterLogoText(getString(R.string.subtitle));

        //color of splash screen
        config.getHeaderTextView().setTextColor(android.graphics.Color.WHITE);
        config.getFooterTextView().setTextColor(android.graphics.Color.WHITE);
        config.getAfterLogoTextView().setTextColor(android.graphics.Color.WHITE);

        // setting content to current splashscreen
        View view = config.create();
        setContentView(view);
    }
}
