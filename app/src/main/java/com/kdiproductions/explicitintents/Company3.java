package com.kdiproductions.explicitintents;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Company3 extends AppCompatActivity {

    Button btnAbout, btnWebsite, btnJobListings, btnminimize;
    TextView tvListing1, tvListing2, tvListing3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company3);

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
                        "Motion Industries, Inc., headquartered in Birmingham, Alabama," + "\n"
                                + " is a distributor of industrial parts and has 300,000 customers" + "\n"
                                + " and annual sales of $6.3 billion. ";

                tvListing1.setText(listing1);
                tvListing1.setMovementMethod(new ScrollingMovementMethod());
                btnminimize.setVisibility(View.VISIBLE);
                tvListing1.setVisibility(View.VISIBLE);

            }
        });

        btnWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String listing2 = "https://www.motionindustries.com/";
                tvListing2.setText(listing2);
                tvListing2.setMovementMethod(new ScrollingMovementMethod());
                btnminimize.setVisibility(View.VISIBLE);
                tvListing2.setVisibility(View.VISIBLE);

            }
        });

        btnJobListings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String listing3 = "Internship - Customer Service Rep" + "\n\n"
                        + "Motion Industries' salespeople provide the highest levels of " + "\n"
                        + "technical support in the industry. Our Customer Service Representatives " + "\n"
                        + "(Inside Sales) professionally represent the Company to our customers " + "\n"
                        + "with the knowledge and skills to provide them the product or service" + "\n"
                        + " they need. Motion Industries offers an excellent benefits package " + "\n"
                        + "that includes options for healthcare coverage, 401(k), tuition " + "\n"
                        + "reimbursement, vacation, sick and holiday pay."

                        + "\n\n\n\n" +

                        "Internship - Bilingual Inside Sales Trainee" + "\n\n"
                        + "The Bilingual Inside Sales Trainee position allows the employee to" + "\n"
                        + " prepare for a role as a Customer Service (Sales) Representative." + "\n"
                        + " The training period is no more than 15 months. During this period, " + "\n"
                        + "the Sales Trainee shadows customer service representatives " + "\n"
                        + "to gain experience in sales, company product lines, as well " + "\n"
                        + "as customer base. The Trainee also participates in various online " + "\n"
                        + "and satellite class settings that are conducted by the " + "\n"
                        + "company's Training Department.";


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

