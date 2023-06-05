package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;


public class AyahActivity extends AppCompatActivity {

    TextView ayah,headingmain;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayah_activity);

        headingmain = findViewById(R.id.headingTextView);
        ayah = findViewById(R.id.ayahTextView);

        String ayattext = getIntent().getStringExtra("name");
        String heading = getIntent().getStringExtra("psp1");
        headingmain.setText(heading);
        ayah.setText(ayattext);

    }
}