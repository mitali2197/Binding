package com.example.bindingex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentOne fragmentOne=new FragmentOne();
        getSupportFragmentManager().beginTransaction().add(R.id.Container,fragmentOne).commit();
    }
}
