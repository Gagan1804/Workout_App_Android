package com.gstar.workout;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class splash extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        //       splash screen running code

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  // isse full screen layout aayega
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //              We have to create a new class which we have named splash..... and we have to create this class in res--->Layout folder.
//              Right click on Layout and chose create new Activity and select empty activity


        Thread mythread = new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    sleep(3000);
                    Intent i = new Intent(splash.this, FindWorkoutActivity.class);
                    startActivity(i);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        mythread.start();

//        splash code ends here

    }


        //  For adding an image in the background first add the image in res-->drawabale folder
//      then go to xml i.e. design file and chose image view from

    }

