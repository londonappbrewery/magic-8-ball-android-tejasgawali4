package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int [] ArrayBoll = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        final ImageView Ball= (ImageView) findViewById(R.id.imgBoll);

        Button btnAsk = (Button) findViewById(R.id.btnAsk);

        btnAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Random RandomGenerator =  new Random();

                final int boll = RandomGenerator.nextInt(5);

                Log.d("Boll :" ,"no" +  boll);

                Ball.setImageResource(ArrayBoll[boll]);

            }
        });

    }
}
