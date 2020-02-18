package com.kdiproductions.explicitintents;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Company5 extends AppCompatActivity {

    Button btnAbout, btnWebsite, btnJobListings, btnminimize;
    TextView tvListing1, tvListing2, tvListing3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company5);

        btnAbout = findViewById(R.id.btnAbout);
        btnWebsite = findViewById(R.id.btnWebsite);
        btnJobListings = findViewById(R.id.btnJobListings);
        btnminimize = findViewById(R.id.btnMinimize);

        tvListing1 = findViewById(R.id.tvListing1);
        tvListing2 = findViewById(R.id.tvListing2);
        tvListing3 = findViewById(R.id.tvListing3);


        tvListing1.setVisibility(TextView.GONE);

        btnminimize.setVisibility(View.GONE);

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String listing1 =
                        "SiteOne Landscape Supply, also known as SiteOne, is a wholesale " + "\n"
                                + "distributor of landscape supplies in the United States and Canada. ";

                tvListing1.setText(listing1);
                tvListing1.setMovementMethod(new ScrollingMovementMethod());
                btnminimize.setVisibility(View.VISIBLE);
                tvListing1.setVisibility(View.VISIBLE);

            }
        });

        btnWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String listing2 = "https://www.siteone.com/en/";


                tvListing2.setText(listing2);
                tvListing2.setMovementMethod(new ScrollingMovementMethod());
                btnminimize.setVisibility(View.VISIBLE);
                tvListing2.setVisibility(View.VISIBLE);


            }
        });

        btnJobListings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String listing3 = "Internship - Summer Program\n\n"
                        + "This position will be exposed to the different areas (irrigation, nursery," + "\n"
                        + " agronomics, etc.) as well as the different functions of a store." + "\n"
                        + "The SiteOne program is a progressive internship. Our interns will be " + "\n"
                        + "responsible for spending time in each department of the wholesale " + "\n"
                        + "distribution operation. You will spend time in the field, warehouse, " + "\n"
                        + "shipping and receiving, counter sales, as well as shadow an Outside " + "\n"
                        + "Sales Representative.";



                tvListing3.setText(listing3);
                tvListing3.setMovementMethod(new ScrollingMovementMethod());
                btnminimize.setVisibility(View.VISIBLE);
                tvListing3.setVisibility(View.VISIBLE);

            }
        });

        btnminimize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvListing1.setVisibility(View.GONE);
                tvListing2.setVisibility(View.GONE);
                tvListing3.setVisibility(View.GONE);
                btnminimize.setVisibility(View.GONE);
            }
        });
    }
}



