package com.laxmisoft.datadudu;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by abc on 30-04-2016.
 */
public class HomeActivity extends Activity {

    Button btnDeviceman, btnAddDevice;
    TextView txtWelcome, txtDataDudu, txtdata1, txtdata2, txtdata3, txtdata4;
    Typeface bold, regular, black;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtdata1 = (TextView) findViewById(R.id.txtdata1);
        txtdata2 = (TextView) findViewById(R.id.txtdata2);
        txtdata3 = (TextView) findViewById(R.id.txtdata3);
        txtdata4 = (TextView) findViewById(R.id.txtdata4);
        txtWelcome = (TextView) findViewById(R.id.txtWelcome);
        txtDataDudu = (TextView) findViewById(R.id.txtDataDudu);

        btnAddDevice = (Button) findViewById(R.id.btnAddDevice);
        btnDeviceman = (Button) findViewById(R.id.btnDeviceman);

        bold = Typeface.createFromAsset(HomeActivity.this.getAssets(), "Roboto-Bold.ttf");
        regular = Typeface.createFromAsset(HomeActivity.this.getAssets(), "Roboto-Regular.ttf");
        black = Typeface.createFromAsset(HomeActivity.this.getAssets(), "Roboto-Black.ttf");

        txtWelcome.setTypeface(regular);
        txtDataDudu.setTypeface(bold);
        txtdata1.setTypeface(regular);
        txtdata2.setTypeface(regular);
        txtdata3.setTypeface(regular);
        txtdata4.setTypeface(regular);

        btnAddDevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ScrollingActivity.class);
                startActivity(intent);
            }
        });

        btnDeviceman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DeviceListActivity.class);
                startActivity(intent);

            }
        });

    }
}
