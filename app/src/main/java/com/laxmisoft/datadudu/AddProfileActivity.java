package com.laxmisoft.datadudu;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by abc on 30-04-2016.
 */
public class AddProfileActivity extends Activity {

    Button btnSave;
    ImageView imgBack;
    TextView txtChoosewifi, txtEncryptType, txtPassword;
    EditText edtPassword;
    Typeface bold, regular, black;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addprofile);

        txtChoosewifi = (TextView) findViewById(R.id.txtChoosewifi);
        txtEncryptType = (TextView) findViewById(R.id.txtEncryptType);
        txtPassword = (TextView) findViewById(R.id.txtPassword);
        edtPassword = (EditText) findViewById(R.id.edtPassword);

        btnSave = (Button) findViewById(R.id.btnSave);
        imgBack = (ImageView) findViewById(R.id.imgBack);

        bold = Typeface.createFromAsset(AddProfileActivity.this.getAssets(), "Roboto-Bold.ttf");
        regular = Typeface.createFromAsset(AddProfileActivity.this.getAssets(), "Roboto-Regular.ttf");
        black = Typeface.createFromAsset(AddProfileActivity.this.getAssets(), "Roboto-Black.ttf");

        txtChoosewifi.setTypeface(regular);
        txtEncryptType.setTypeface(regular);
        edtPassword.setTypeface(regular);
        txtPassword.setTypeface(regular);
        btnSave.setTypeface(regular);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                ScrollingActivity.viewPager.setCurrentItem(2);
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
