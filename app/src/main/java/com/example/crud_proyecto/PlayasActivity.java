package com.example.crud_proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PlayasActivity extends AppCompatActivity {
    private String nameIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playas);
        nameIntent = getIntent().getStringExtra("nameIntent");
        this.setTitle(nameIntent);
    }
}
