package com.example.kids_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    ImageView plus,minus,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent plus= new Intent(HomeActivity.this,PlusActivity.class);
                startActivity(plus);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent minus= new Intent(HomeActivity.this,MinusActivity.class);
                startActivity(minus);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mul= new Intent(HomeActivity.this,MulActivity.class);
                startActivity(mul);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent div= new Intent(HomeActivity.this,DivActivity.class);
                startActivity(div);
            }
        });

    }
}