package com.unliable.a8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] ballArray = {
                       R.drawable.ball1,
                       R.drawable.ball2,
                       R.drawable.ball3,
                       R.drawable.ball4,
                       R.drawable.ball5
                      };

        final ImageView imageBall = (ImageView) findViewById(R.id.imageBall);

        final Button askButton;
        askButton = (Button) findViewById(R.id.askButton);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Dicee", "The Button Has Been Pressed");

                Random randomNumberGenerator = new Random();

                int number = (int) randomNumberGenerator.nextInt(5);

                imageBall.setImageResource(ballArray[number]);
            }
        });




    }
}
