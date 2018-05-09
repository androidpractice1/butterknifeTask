package com.manu.butterknifetask;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.manu.butterknifetask.model.User;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity {


    @BindView(R.id.first_name)
    EditText mFirstName;

    @BindView(R.id.last_name) EditText mLastName;

    @BindView(R.id.email_register) EditText mRegisterEmail;

    @BindView(R.id.pwd_register) EditText mRegisterPwd;

    @BindView(R.id.btn_register)
    Button register;

    private UserViewModel mUserViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mUserViewModel = ViewModelProviders.of(this).get(UserViewModel.class);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.btn_register)
    public void register(){
        Toast.makeText(this, "Register Button Clicked", Toast.LENGTH_LONG).show();
        String firstName = mFirstName.getText().toString();
        String lastName = mLastName.getText().toString();
        String email = mRegisterEmail.getText().toString();
        String pwd = mRegisterPwd.getText().toString();

        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPassword(pwd);
        mUserViewModel.insert(user);
        Toast.makeText(this, "User Added", Toast.LENGTH_LONG).show();
        Intent register = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(register);

    }


}
