package com.example.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initConfig();
    }
    /**配置方法*/
    private void initConfig() {
        if (1 == 1) {
            int a = 0;
        } else {
            int b = 1;
        }
        // 加了个注释。。。。。
        /** 给二狗子演示下。。。。。。*/
    }


}
         