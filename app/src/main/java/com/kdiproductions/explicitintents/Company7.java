package com.kdiproductions.explicitintents;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Company7 extends AppCompatActivity {

    Button btnAbout, btnWebsite, btnJobListings, btnminimize;
    TextView tvListing1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company7);

        btnAbout = findViewById(R.id.btnAbout);
        btnWebsite = findViewById(R.id.btnWebsite);
        btnJobListings = findViewById(R.id.btnJobListings);
        btnminimize = findViewById(R.id.btnMinimize);

        tvListing1 = findViewById(R.id.tvListing1);


        tvListing1.setVisibility(TextView.GONE);

        btnminimize.setVisibility(View.GONE);

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String listing1 =
                        "";

                tvListing1.setText(listing1);
                tvListing1.setMovementMethod(new ScrollingMovementMethod());
                btnminimize.setVisibility(View.VISIBLE);
                tvListing1.setVisibility(View.VISIBLE);

            }
        });

        btnWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String listing2 = "test";


                btnminimize.setVisibility(View.VISIBLE);


            }
        });

        btnJobListings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String listing3 = "test";


                btnminimize.setVisibility(View.VISIBLE);

            }
        });

        btnminimize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvListing1.setVisibility(View.GONE);
                btnminimize.setVisibility(View.GONE);
            }
        });
    }
}



