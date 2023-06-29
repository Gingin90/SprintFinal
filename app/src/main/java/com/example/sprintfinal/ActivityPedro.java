package com.example.sprintfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.sprintfinal.databinding.ActivityMainBinding;
import com.example.sprintfinal.databinding.ActivityPedroBinding;

public class ActivityPedro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityPedroBinding binding = ActivityPedroBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

}