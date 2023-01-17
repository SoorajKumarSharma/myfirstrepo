package com.example.gitpracticeproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.getLocation);
        button1=findViewById(R.id.butn);

        this.sum();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, " This Project only for Git Practice", Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This Project only for Git Practice1", Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void sum(){
        int n1 = 225, n2 = 115, sum;
        sum = n1 + n2;
        Log.d("Sooraj","The sum of numbers is: "+sum);
        Toast.makeText(MainActivity.this, "The total sum number is: "+sum, Toast.LENGTH_SHORT).show();
    }
}