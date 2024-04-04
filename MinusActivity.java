package com.example.kids_math;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MinusActivity extends AppCompatActivity {
    ImageView one,two,three,four,five,six,seven,eight,nine,equal,clear;

    TextView t1,t2,t3;
    int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minus);

        one=findViewById(R.id.p_one);
        two=findViewById(R.id.p_two);
        three=findViewById(R.id.p_three);
        four=findViewById(R.id.p_four);
        five=findViewById(R.id.p_five);
        six=findViewById(R.id.p_six);
        seven=findViewById(R.id.p_seven);
        eight=findViewById(R.id.p_eight);
        nine=findViewById(R.id.p_nine);
        t1=findViewById(R.id.text_1);
        t2=findViewById(R.id.text_2);
        t3=findViewById(R.id.text_3);
        equal=findViewById(R.id.p_equal);
        clear=findViewById(R.id.p_clear);


        MediaPlayer pone =MediaPlayer.create(this,R.raw.one);
        MediaPlayer ptwo =MediaPlayer.create(this,R.raw.two);
        MediaPlayer pthree =MediaPlayer.create(this,R.raw.three);
        MediaPlayer pfour =MediaPlayer.create(this,R.raw.four);
        MediaPlayer pfive =MediaPlayer.create(this,R.raw.five);
        MediaPlayer psix =MediaPlayer.create(this,R.raw.six);
        MediaPlayer pseven =MediaPlayer.create(this,R.raw.seven);
        MediaPlayer peight =MediaPlayer.create(this,R.raw.eight);
        MediaPlayer pnine =MediaPlayer.create(this,R.raw.nine);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pone.start();
                if(c==0)
                {
                    t1.setText("1");
                    c=1;
                }
                else {
                    t2.setText("1");
                    c=0;
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptwo.start();
                if(c==0)
                {
                    t1.setText("2");
                    c=1;
                }
                else {
                    t2.setText("2");
                    c=0;
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pthree.start();
                if(c==0)
                {
                    t1.setText("3");
                    c=1;
                }
                else {
                    t2.setText("3");
                    c=0;
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pfour.start();
                if(c==0)
                {
                    t1.setText("4");
                    c=1;
                }
                else {
                    t2.setText("4");
                    c=0;
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pfive.start();
                if(c==0)
                {
                    t1.setText("5");
                    c=1;
                }
                else {
                    t2.setText("5");
                    c=0;
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                psix.start();
                if(c==0)
                {
                    t1.setText("6");
                    c=1;
                }
                else {
                    t2.setText("6");
                    c=0;
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pseven.start();
                if(c==0)
                {
                    t1.setText("7");
                    c=1;
                }
                else {
                    t2.setText("7");
                    c=0;
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peight.start();
                if(c==0)
                {
                    t1.setText("8");
                    c=1;
                }
                else {
                    t2.setText("8");
                    c=0;
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pnine.start();
                if(c==0)
                {
                    t1.setText("9");
                    c=1;
                }
                else {
                    t2.setText("9");
                    c=0;
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= Integer.parseInt(t1.getText().toString());
                int b= Integer.parseInt(t2.getText().toString());

                int ans=a-b;

                t3.setText(String.valueOf(ans));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        });


    }
}