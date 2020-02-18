package com.kdiproductions.explicitintents;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JobPosting1 extends AppCompatActivity {

        Button btnListing1, btnListing2, btnListing3, btnminimize;
        TextView tvListing1, tvListing2, tvListing3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.jobposting1);

            btnListing1 = findViewById(R.id.btnListing1);
            btnListing2 = findViewById(R.id.btnListing2);
            btnListing3 = findViewById(R.id.btnListing3);
            btnminimize = findViewById(R.id.btnMinimize);

            tvListing1 = findViewById(R.id.tvListing1);
            tvListing2 = findViewById(R.id.tvListing2);
            tvListing3 = findViewById(R.id.tvListing3);

            tvListing1.setVisibility(TextView.GONE);
            tvListing2.setVisibility(TextView.GONE);
            tvListing3.setVisibility(TextView.GONE);
            btnminimize.setVisibility(View.GONE);

            btnListing1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String listing1 =
                            "Internship - Operations\n\n"
                                    + "Interns will train within our Dedicated Contract Services division at " + "\n"
                                    + "one of our customer sites, where we provide transportation/logistics" + "\n"
                                    + " services. They will work directly with Operations employees who are " + "\n"
                                    + "utilized in management roles.";

                    tvListing1.setText(listing1);
                    tvListing1.setMovementMethod(new ScrollingMovementMethod());
                    btnminimize.setVisibility(View.VISIBLE);
                    tvListing1.setVisibility(View.VISIBLE);
                    btnListing3.setVisibility(View.GONE);
                    btnListing2.setVisibility(View.GONE);

                }
            });

            btnListing2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String listing2 = "Internship - Transportation/Logistics\n\n" +
                            "Interns will train within our Dedicated Contract Services division at one of" + "\n"
                            + " our customer sites, where we provide transportation/logistics services." + "\n"
                            + " They will work directly with Operations employees who are utilized in" + "\n"
                            + " management roles. ";
                    tvListing2.setText(listing2);
                    btnminimize.setVisibility(View.VISIBLE);
                    tvListing2.setVisibility(View.VISIBLE);
                    btnListing1.setVisibility(View.GONE);
                    btnListing3.setVisibility(View.GONE);

                }
            });

            btnListing3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String listing3 = "Internship - Application Development\n\n"
                            + "At J.B. Hunt, our IT Internship Program is designed to give students" + "\n"
                            + " the opportunity to extend their classroom learning and get real world" + "\n"
                            + " industry experience, while still completing their degree." + "\n"
                            + "The IT Internship at J.B. Hunt is different than most internships, in" + "\n"
                            + " that it is a “year-round” internship. Our IT interns work 20 hours a week" + "\n"
                            + " during the semester and up to 35 hours a week when classes are not in session." + "\n"
                            + " This allows the student to maximize the opportunity of gaining practical" + "\n"
                            + " work experience. Our interns have the opportunity to rotate between the " + "\n"
                            + "departments, as open positions become available.";

                    tvListing3.setText(listing3);
                    btnminimize.setVisibility(View.VISIBLE);
                    tvListing3.setVisibility(View.VISIBLE);
                    btnListing1.setVisibility(View.GONE);
                    btnListing2.setVisibility(View.GONE);

                }
            });

            btnminimize.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tvListing1.setVisibility(View.GONE);
                    tvListing2.setVisibility(View.GONE);
                    tvListing3.setVisibility(View.GONE);
                    btnListing3.setVisibility(View.VISIBLE);
                    btnListing2.setVisibility(View.VISIBLE);
                    btnListing1.setVisibility(View.VISIBLE);
                    btnminimize.setVisibility(View.GONE);
                }
            });
        }
    }



