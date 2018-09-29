package com.example.administrator.homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private EditText editText5;
    private EditText editText6;
    private EditText editText7;
    private EditText editText8;
   public String password1;
    public String password2;
    private List<EditText> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button1);
        editText1 =(EditText) findViewById (R.id.edit1);
         editText2 =(EditText) findViewById (R.id.edit2);
         editText3 =(EditText) findViewById (R.id.edit3);
         editText4 =(EditText) findViewById (R.id.edit4);
        editText5 =(EditText) findViewById (R.id.edit5);
         editText6 =(EditText) findViewById (R.id.edit6);
         editText7 =(EditText) findViewById (R.id.edit7);
        editText8 =(EditText) findViewById (R.id.edit8);
         password1=editText5.getText().toString();
         password2=editText6.getText().toString();

        list.add(editText1);
        list.add(editText2);
        list.add(editText3);
        list.add(editText4);
        list.add(editText5);
        list.add(editText6);
        list.add(editText7);
        list.add(editText7);



        button.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                if(password1.equals(password2))
                {

                    if(!notnull(list))
                    {
                        Toast.makeText(MainActivity.this,"你有必要信息未输入",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Intent intent = new Intent(MainActivity.this, SDActivity.class);
                        intent.putExtra("loginName", editText1.getText().toString());
                        intent.putExtra("stuNum", editText2.getText().toString());
                        intent.putExtra("userName", editText3.getText().toString());
                        intent.putExtra("email", editText4.getText().toString());
                        intent.putExtra("password", editText5.getText().toString());
                        intent.putExtra("school", editText7.getText().toString());
                        intent.putExtra("tel", editText8.getText().toString());
                        startActivity(intent);
                    }

                }
                else {
                    Toast.makeText(MainActivity.this,"两次输入密码不一致，请重新输入",Toast.LENGTH_SHORT).show();
                }




            }
            private boolean notnull(List<EditText> list)
            {
                boolean flag=true;
                for (int i = 0; i < list.size()-1; i++) {
                    if (list.get(i).getText().toString().equals("") ) {
                        Toast.makeText(MainActivity.this,"有必填信息尚未输入",Toast.LENGTH_SHORT).show();
                        String a= null;
                        Log.v("MainActivity",a);
                        flag=false;
                        break;
                    }
                }
                return flag;

            }
        }
        );
    }
}
