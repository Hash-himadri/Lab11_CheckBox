package com.example.lab9_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbRead, cbSing, cbTravel, cbCycling;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbRead = findViewById(R.id.cbReading);
        cbSing = findViewById(R.id.cbSinging);
        cbCycling = findViewById(R.id.cbCycling);
        cbTravel = findViewById(R.id.cbTravelling);
        btnShow = findViewById(R.id.btnShow);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder res = new StringBuilder();
                res.append("Selected Values: ");
                if(cbRead.isChecked()){
                    res.append("\nReading");
                }
                if(cbCycling.isChecked()){
                    res.append("\nCycling");
                }
                if(cbSing.isChecked()){
                    res.append("\nSinging");
                }
                if(cbTravel.isChecked()){
                    res.append("\nTravelling");
                }

                Toast.makeText(MainActivity.this, res, Toast.LENGTH_SHORT).show();
            }
        });

    }
}