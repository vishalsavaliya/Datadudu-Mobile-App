package com.laxmisoft.datadudu;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by abc on 30-04-2016.
 */
public class DeviceListActivity extends Activity {

    ImageView imgBack;
    TextView txtUnmount, txtUnmount1, txtUnmount2, txtInfo_details, txtInfo;
    TextView txtsensor, txtsensor1, txtsensor2, txtsensor3;

    Typeface bold, regular, black;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devicelist);

        imgBack = (ImageView) findViewById(R.id.imgBack);

        txtUnmount = (TextView) findViewById(R.id.txtUnmount);
        txtUnmount1 = (TextView) findViewById(R.id.txtUnmount1);
        txtUnmount2 = (TextView) findViewById(R.id.txtUnmount2);

        txtInfo = (TextView) findViewById(R.id.txtInfo);
        txtInfo_details = (TextView) findViewById(R.id.txtInfo_details);

        txtsensor = (TextView) findViewById(R.id.txtSensor);
        txtsensor1 = (TextView) findViewById(R.id.txtsensor1);
        txtsensor2 = (TextView) findViewById(R.id.txtsensor2);
        txtsensor3 = (TextView) findViewById(R.id.txtsensor3);
        txtUnmount2 = (TextView) findViewById(R.id.txtUnmount2);
        txtUnmount2 = (TextView) findViewById(R.id.txtUnmount2);
        txtUnmount2 = (TextView) findViewById(R.id.txtUnmount2);

        bold = Typeface.createFromAsset(DeviceListActivity.this.getAssets(), "Roboto-Bold.ttf");
        regular = Typeface.createFromAsset(DeviceListActivity.this.getAssets(), "Roboto-Regular.ttf");
        black = Typeface.createFromAsset(DeviceListActivity.this.getAssets(), "Roboto-Black.ttf");

        txtInfo.setTypeface(bold);
        txtInfo_details.setTypeface(regular);

        txtsensor.setTypeface(bold);
        txtsensor1.setTypeface(regular);
        txtsensor2.setTypeface(regular);
        txtsensor3.setTypeface(regular);
        txtUnmount.setTypeface(regular);
        txtUnmount1.setTypeface(regular);
        txtUnmount2.setTypeface(regular);


        txtUnmount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(DeviceListActivity.this);
                alertDialogBuilder.setMessage("Are You Sure You Want unmount device xxx ?");

                alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                });

                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        txtUnmount1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(DeviceListActivity.this);
                alertDialogBuilder.setMessage("Are You Sure You Want unmount device xxx ?");

                alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                });

                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        txtUnmount2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(DeviceListActivity.this);
                alertDialogBuilder.setMessage("Are You Sure You Want unmount device xxx ?");

                alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                });

                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }


}
