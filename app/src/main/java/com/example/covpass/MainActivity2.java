package com.example.covpass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
//Initialise variable
 Button btnScanBarcode;
 Button covidCases;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnScanBarcode = findViewById(R.id.btnScanBarcode);
        covidCases=findViewById(R.id.Covid_Cases);


        btnScanBarcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity2.this, ScanBarCodeActivity.class));
            }
        });
        covidCases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,CovidCases.class));
            }



        });

        }}

