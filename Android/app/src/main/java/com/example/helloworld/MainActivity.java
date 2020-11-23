package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

//        Lion myLion = new Lion();

//        myLion.age = 10;
//        myLion.weight = 50.5f;
//        myLion.isWild = true;

        Person jack = new Person("Jack", 4, 6.4f);
        Person John = new Person();

    }
}