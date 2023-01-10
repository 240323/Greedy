package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class SubActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState ){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        //ボタンクリック時に呼び出されるイベントリスナー
        Button returnButtun = findViewById(R.id.return_button);
        //SubActivityを終了
        returnButtun.setOnClickListener(v -> finish());
    }
}