package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView infoLikes;
    int like;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickLike = findViewById(R.id.clickLike);
        Button clickUnlike = findViewById(R.id.clickUnlike);
//        Button saveLikes = findViewById(R.id.saveLikes);
        like = 0;
        infoLikes = findViewById(R.id.infoLikes);



    }

    public void clickLike(View view) {
        like++;
        infoLikes.setText(String.valueOf(like + " polubień"));
    }

    public void clickUnlike(View view) {
        if(like>0){
            like--;
            infoLikes.setText(String.valueOf(like + " polubień"));
        }

    }

//    public void saveLikes(View view) {
//    }
}