package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v)
            {
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
               // intent.putExtra("data","hello fi");//设置返回数据
                //setResult(RESULT_OK,intent);//设置返回校验
              //  finish();
                startActivity(intent);
            }
        });
        // Intent intent= getIntent();
      // String data=intent.getStringExtra("extra");
        //Log.d("SecondActivity",data);
    }
}
