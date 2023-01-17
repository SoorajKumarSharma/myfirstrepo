package com.example.gitpracticeproject1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Data_File extends AppCompatActivity {


      Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_file);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Data_File");
        Toast.makeText(Data_File.this, "This is Data_file class", Toast.LENGTH_SHORT).show();
        
        button=findViewById(R.id.getLocation);


         button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Data_File.this, "Switch on MainActivity", Toast.LENGTH_SHORT).show();
               
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);   
            }
        });
    }
}
