package com.example.gitpracticeproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //textView.findViewById(R.id.tv);
        this.sum();
    }

    public void sum(){
        int n1 = 225, n2 = 115, sum;
        sum = n1 + n2;
        Log.d("Sooraj","The sum of numbers is: "+sum);
        Toast.makeText(MainActivity.this, "This is sum number is: "+sum, Toast.LENGTH_SHORT).show();
    }
}