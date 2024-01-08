package com.example.savo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import com.example.savo.pages.expensetracking;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        long delayMillis = 3000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Intent intent = new Intent(MainActivity.this, home.class);
                Intent intent = new Intent(MainActivity.this, expensetracking.class);
                startActivity(intent);
            }
        }, delayMillis);


    }
}