package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = 0;
        textView = findViewById(R.id.textView);
        Button button123 = findViewById(R.id.button123);
        Button button124 = findViewById(R.id.button124);

    }

    public void nextCount(View view) {
        count++;
        textView.setText(String.valueOf(count + ""));
    }

    public void clickMinus(View view) {
        count--;
        textView.setText(String.valueOf(count + ""));
    }
}