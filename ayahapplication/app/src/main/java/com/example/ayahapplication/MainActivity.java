package com.example.ayahapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView calculator = findViewById(R.id.calculator);
        EditText one = findViewById(R.id.one);
        EditText two = findViewById(R.id.two);
        Button calculate = findViewById(R.id.calculate);
        TextView total = findViewById(R.id.total);

    }
}