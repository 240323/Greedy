package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ボタンクリック時に呼び出されるイベントリスナー
        Button sendButton = findViewById(R.id.send_button);
        sendButton.setOnClickListener(v -> {
            //SubActivityへのインテントを作成
            Intent intent = new Intent(getApplication(), SubActivity.class);
            //アクティビティを起動
            startActivity(intent);
        });
    }
}
