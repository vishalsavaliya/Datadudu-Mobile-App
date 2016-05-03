package com.laxmisoft.datadudu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by abc on 30-04-2016.
 */
public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Thread splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    while (waited < 2000) {
                        sleep(100);
                        waited += 100;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent i = new Intent(getApplicationContext(),LoginActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        splashThread.start();
    }
}
