package com.kdiproductions.explicitintents;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Company4 extends AppCompatActivity {

    Button btnAbout, btnWebsite, btnJobListings, btnminimize;
    TextView tvListing1, tvListing2, tvListing3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company4);

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
                        "McLeod is a supplier of transportation management and " + "\n"
                                + "trucking software for carriers, brokers, 3PL" + "\n"
                                + " providers, and shippers.";

                tvListing1.setText(listing1);
                tvListing1.setMovementMethod(new ScrollingMovementMethod());
                btnminimize.setVisibility(View.VISIBLE);
                tvListing1.setVisibility(View.VISIBLE);

            }
        });

        btnWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String listing2 = "https://www.mcleodsoftware.com/";


                tvListing2.setText(listing2);
                tvListing2.setMovementMethod(new ScrollingMovementMethod());
                btnminimize.setVisibility(View.VISIBLE);
                tvListing2.setVisibility(View.VISIBLE);


            }
        });

        btnJobListings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String listing3 = "Full Time - Primary Support Specialist\n\n"
                        + "The Support Specialist will be responsible for providing solutions " + "\n"
                        + "for McLeod customers related to general instructional or technical" + "\n"
                        + " problems for software or hardware pertaining to McLeod Software's" + "\n"
                        + " various products (McLeod Software's DocumentPower, LoadMaster" + "\n"
                        + " and PowerBroker products as well as third party vendor interfaces.)\n"
                        + "\n\n\n\n" +
                        "Full Time - EDI Coordinator\n\n"
                        + "The EDI Coordinator will support customer installations and upgrades" + "\n"
                        + " of the McLeod LoadMaster EDI Engine product. Tasks will include setting " + "\n"
                        + "up trading partner profiles, EDI transaction templates, and file transfer" + "\n"
                        + " communications. The EDI Coordinator will provide test and production" + "\n"
                        + " support to EDI customers and work with the programmers and project " + "\n"
                        + "managers as necessary for modifications to the products to meet the " + "\n"
                        +  "client's needs.";



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




