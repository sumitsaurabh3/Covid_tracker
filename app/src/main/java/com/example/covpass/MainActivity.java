package com.example.covpass;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     Button btn_scan;
    private ImageView imageView;
    private TextView textView,TextView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_scan = (Button) findViewById(R.id.btn_scan);
        btn_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity2();

            }
        });
    }

    public void openMainActivity2() {
        Intent intent = new Intent(this,  MainActivity2.class);
        startActivity(intent);
    }

}