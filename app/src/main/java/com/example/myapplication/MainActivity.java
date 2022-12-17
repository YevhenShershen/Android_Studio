package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView2;
    private EditText photo_show;
    private Button button_next;
    private Button button_prev;
    private Switch switch_fon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        photo_show = findViewById(R.id.photo_show);
        button_next = findViewById(R.id.button_next);
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void clickNext(View view) {
        imageView2 = findViewById(R.id.imageView2);
    }
}