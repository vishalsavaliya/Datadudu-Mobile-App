package com.laxmisoft.datadudu;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by abc on 30-04-2016.
 */
public class SignUpActivity extends Activity {


    TextView txtLogin, txtAlready;
    Button btnSignUp;
    String[] TimeZone = {"TimeZone 1 ", "TimeZone 2", "TimeZone 3", "TimeZone"};
    Typeface bold, regular, black;
    Spinner mySpinner;
    EditText edtUsername, edtEmail, edtPassword, edtConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        edtUsername = (EditText) findViewById(R.id.edtUsername);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        edtConfirmPassword = (EditText) findViewById(R.id.edtConfirmPassword);

        mySpinner = (Spinner) findViewById(R.id.spTimeZoon);

        txtAlready = (TextView) findViewById(R.id.txtAlready);
        txtLogin = (TextView) findViewById(R.id.txtLogin);

        btnSignUp = (Button) findViewById(R.id.btnSignUp);

        bold = Typeface.createFromAsset(SignUpActivity.this.getAssets(), "Roboto-Bold.ttf");
        regular = Typeface.createFromAsset(SignUpActivity.this.getAssets(), "Roboto-Regular.ttf");
        black = Typeface.createFromAsset(SignUpActivity.this.getAssets(), "Roboto-Black.ttf");

        edtUsername.setTypeface(regular);
        edtEmail.setTypeface(regular);
        edtPassword.setTypeface(regular);
        edtConfirmPassword.setTypeface(regular);
        txtAlready.setTypeface(regular);
        btnSignUp.setTypeface(regular);
        txtLogin.setTypeface(bold);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.textview, TimeZone);
        mySpinner.setAdapter(adapter);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
