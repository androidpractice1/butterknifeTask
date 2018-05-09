package com.manu.butterknifetask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.email) EditText mEmail;
    @BindView(R.id.pwd) EditText mPwd;
    @BindView(R.id.login)
    Button mLogin;
    @BindView(R.id.register)
    TextView mRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.login)
    public void login() {

        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
        String userEmail = mEmail.getText().toString();
        String userPwd = mPwd.getText().toString();

        if (!userEmail.isEmpty() && !userPwd.isEmpty()){
            Intent main = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(main);
        }


    }

    @OnClick(R.id.register)
    public void register(){
        Toast.makeText(this, "Register is Clicked", Toast.LENGTH_LONG).show();
        Intent register = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(register);
    }


}
