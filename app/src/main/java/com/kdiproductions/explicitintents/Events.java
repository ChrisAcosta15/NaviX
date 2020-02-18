package com.kdiproductions.explicitintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class Events extends AppCompatActivity {
    Button btnAct1, filter1, filter2, filter3 , filter4, btnPushFilter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events);

        btnPushFilter = findViewById(R.id.btnPushFilter);
        btnAct1 = findViewById(R.id.btnAct1);
        filter1 = findViewById(R.id.filter1);
        filter2 = findViewById(R.id.filter2);
        filter3 = findViewById(R.id.filter3);
        filter4 = findViewById(R.id.filter4);

        Bundle extras = getIntent().getExtras();
        filter1.setVisibility(View.GONE);
        filter2.setVisibility(View.GONE);
        filter3.setVisibility(View.GONE);
        filter4.setVisibility(View.GONE);

        if (extras != null) {
            String value = extras.getString("filt1");
            filter1.setText(value);
            String value2 = extras.getString("filt2");
            filter2.setText(value2);
            String value3 = extras.getString("filt3");
            filter3.setText(value3);
            String value4 = extras.getString("filt4");
            filter4.setText(value4);

        }

        btnPushFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                filter1.setVisibility(View.VISIBLE);
                filter2.setVisibility(View.VISIBLE);
                filter3.setVisibility(View.VISIBLE);
                filter4.setVisibility(View.VISIBLE);
            }
        });

        btnAct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Events.this,  // this intent moves you from main activity to act3
                        com.kdiproductions.explicitintents.Activity3.class);

                startActivity(intent);

            }
        });
    }
}
