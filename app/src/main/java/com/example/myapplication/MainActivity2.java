package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t,t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i=getIntent();
        t=findViewById(R.id.textView4);
        t1=findViewById(R.id.textView7);
        t.setText(i.getStringExtra("msg1"));
        t1.setText(i.getStringExtra("msg2"));
    }
}