package com.example.gitpracticeproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Data_File extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_file);
        
        Toast.makeText(Data_File.this, "This is data file", Toast.LENGTH_SHORT).show();

    }
}
