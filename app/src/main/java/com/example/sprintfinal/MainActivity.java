package com.example.sprintfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sprintfinal.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initListener();

    }

    private void initListener() {
    binding.buttonNext.setOnClickListener(v -> {

        Intent goTo = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(goTo);
    });

}

}