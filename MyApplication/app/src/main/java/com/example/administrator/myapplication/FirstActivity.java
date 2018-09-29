package com.example.administrator.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {
@Override
public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);//getmenuInflater取得menuinflater对象，调用inflate方法给当前活动创建菜单
        // ，第一个参数代表着一个menu，第二个参数用于指定菜单项将添加到哪个menu对象，true表示允许菜单显示出来。
        return true;
        }
@Override
public boolean onOptionsItemSelected(MenuItem item)
        {
        //重写此方法为点击菜单选项定义响应时间，这里用的是switch来判断选项，然后播放广播
        switch (item.getItemId()){
        case R.id.add_item:
        Toast.makeText(this,"you clicked add", Toast.LENGTH_SHORT).show();break;
        case R.id.remove_item :
        Toast.makeText(this,"you clicked remove",Toast.LENGTH_SHORT).show();break;
default:
        }
        return true;

        }

   // @Override
   /* protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        switch (requestCode){
            case 1:
                if(resultCode==RESULT_OK)
                {
                    String returnedData = data.getStringExtra("data");
                    Log.d("FirstActivity",returnedData);
                }break;
            default:
        }

    }*/




@Override
protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.d("FirstActivity", this.toString());//打印此活动的一些信息
        setContentView(R.layout.first_layout);//调用setContentView()方法，参数是一个布局的id值

        Button button1 = (Button) findViewById(R.id.button_1);//通过向fidviewById()传入布局文件中button的id来取得一个view对象再强制类型转换为Button类型
        button1.setOnClickListener(new View.OnClickListener() { //为按钮注册一个监听器，并重写监听器中的oncklick方法
    @Override
                public void onClick(View v) {
        //Toast.makeText(FirstActivity.this,"you clicked button1", Toast.LENGTH_SHORT).show();//通过调用静态方法maketext获取一个toast对象，并show出来
        // FirstActivity.this.finish();//销毁次活动
                //String data="hell sec"; //设置要传递的数据
        //打印此活动的一些信息
                Intent intent= new Intent(this,SecondActivity.class);
               // intent.putExtra("extra",data);//调用putextra 方法将键值对存入intent
              // startActivityForResult(intent,1);



        // Intent intent = new Intent(FirstActivity.this,SecondActivity.class); //显式intent 创建intent对象，传入启动活动的上下文，第二个是要启动的活动

        //Intent intent = new Intent("com.exanple.lab.activity.ACTION_START");
        //intent.addCategory("com.exanple.lab.activity.MY_CATEGORY"); //添加category,程序崩溃，在要相应的活动注册信息中找不到可以相应的category
             //Intent intent = new Intent(Intent.ACTION_VIEW);
            //intent.setData(Uri.parse("http://www.baidu.com"));

            startActivity(intent);//启动活动
        }

        });

        }
}
