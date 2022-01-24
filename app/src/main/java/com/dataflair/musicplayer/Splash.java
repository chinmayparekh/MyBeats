package com.dataflair.musicplayer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

import maes.tech.intentanim.CustomIntent;

public class Splash extends AwesomeSplash {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);
//    }

    @Override
    public void initSplash(ConfigSplash configSplash) {
        ActionBar actionBar = getSupportActionBar();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        configSplash.setBackgroundColor(R.color.best_blue);
        configSplash.setAnimCircularRevealDuration(800);
        configSplash.setRevealFlagX(Flags.REVEAL_LEFT);
        configSplash.setRevealFlagX(Flags.REVEAL_BOTTOM);

        configSplash.setTitleSplash("My Beats");
        configSplash.setTitleTextColor(R.color.black);
        configSplash.setTitleTextSize(30f);
        configSplash.setAnimTitleDuration(1000);
        configSplash.setAnimTitleTechnique(Techniques.FlipInX);


        configSplash.setLogoSplash(R.drawable.my_beats); //or any other drawable
        configSplash.setAnimLogoSplashDuration(1000); //int ms
        configSplash.setAnimLogoSplashTechnique(Techniques.Wobble); //

    }

    @Override
    public void animationsFinished() {
        startActivity(new Intent(Splash.this, MainActivity.class));
        CustomIntent.customType(Splash.this, "fadein-to-fadeout");

    }
}