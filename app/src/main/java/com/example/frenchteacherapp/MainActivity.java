package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaExtractor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button blackBtn, yellowBtn, redBtn,greenBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackBtn =findViewById(R.id.Black);
        yellowBtn =findViewById(R.id.Yellow);
        redBtn =findViewById(R.id.red);
        greenBtn= findViewById(R.id.Green);

        redBtn.setOnClickListener(this);
        blackBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int clickedBtnId=v.getId();

        if (clickedBtnId == R.id.red){
            Playsound(R.raw.red);
        } else if (clickedBtnId == R.id.Black) {
            Playsound(R.raw.black);
        } else if (clickedBtnId == R.id.Green) {
            Playsound(R.raw.green);
        }else if (clickedBtnId == R.id.Yellow) {
            Playsound(R.raw.yellow);
        }

    }

    public void Playsound(int id){

        MediaPlayer mediaPlayer = MediaPlayer.create(this,id);

        mediaPlayer.start();

    }
}