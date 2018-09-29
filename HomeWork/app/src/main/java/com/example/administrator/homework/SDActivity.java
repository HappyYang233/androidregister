package com.example.administrator.homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SDActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private EditText editText5;
    private EditText editText6;
    private EditText editText7;
    private EditText editText8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd);
        Intent intent = getIntent();
        String loginName=intent.getStringExtra("loginName");
        String stuNum = intent.getStringExtra("stuNum");
        String userName=intent.getStringExtra("userName");
        String email= intent.getStringExtra("email");
        String password= intent.getStringExtra("password");
        String school = intent.getStringExtra("school");
        String tel=intent.getStringExtra("tel");
        editText1 =(EditText) findViewById (R.id.edit1);
        editText2 =(EditText) findViewById (R.id.edit2);
        editText3 =(EditText) findViewById (R.id.edit3);
        editText4 =(EditText) findViewById (R.id.edit4);
        editText5 =(EditText) findViewById (R.id.edit5);
        editText6 =(EditText) findViewById (R.id.edit6);
        editText7 =(EditText) findViewById (R.id.edit7);
        editText8 =(EditText) findViewById (R.id.edit8);
        editText1.setText(loginName);
        editText2.setText(stuNum);
        editText3.setText(userName);
        editText4.setText(email);
        editText5.setText(password);
        editText7.setText(school);
        editText8.setText(tel);

    }
}
