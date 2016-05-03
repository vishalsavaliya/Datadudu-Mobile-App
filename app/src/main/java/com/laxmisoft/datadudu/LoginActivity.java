package com.laxmisoft.datadudu;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button btnSignUp, btnLogin;
    Typeface bold, regular, black;
    EditText edtUsername, edtPassword;
    TextView txtForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnSignUp = (Button) findViewById(R.id.btnSignUp);

        edtUsername = (EditText) findViewById(R.id.edtUsername);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        txtForgotPassword = (TextView) findViewById(R.id.txtForgotPassword);


        bold = Typeface.createFromAsset(LoginActivity.this.getAssets(), "Roboto-Bold.ttf");
        regular = Typeface.createFromAsset(LoginActivity.this.getAssets(), "Roboto-Regular.ttf");
        black = Typeface.createFromAsset(LoginActivity.this.getAssets(), "Roboto-Black.ttf");

        edtUsername.setTypeface(regular);
        edtPassword.setTypeface(regular);
        txtForgotPassword.setTypeface(regular);
        btnLogin.setTypeface(regular);
        btnSignUp.setTypeface(regular);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}
