package com.kdiproductions.explicitintents;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CompanyEditedVersion extends AppCompatActivity {

    Button OpenListings, OpenWebsite;
    TextView DescInput, NameInput;
    final int ACT3 = 3;
    String value4, value3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.companyedited);

        OpenListings = findViewById(R.id.btnOpenListings);
        OpenWebsite = findViewById(R.id.btnOpenWebsite);
        DescInput = findViewById(R.id.tvDescInput);
        NameInput = findViewById(R.id.tvNameInput);
        final WebView web = new WebView(this);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String value = extras.getString("name");
            NameInput.setText(value);
            String value2 = extras.getString("desc");
            DescInput.setText(value2);
            value3 = extras.getString("jobs");
            OpenListings.setText(value3);
            value4 = extras.getString("website");
            OpenWebsite.setText(value4);

        }

        OpenWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(web);
                String website = value4;
                if (!website.contains("https://")){
                    web.loadUrl("https://" + website);
                }
                web.loadUrl(website);

            }
        });

        OpenListings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(web);
                String website = "https://www.jbhunt.com/jobs/office/professionals/it/";
                //if (!website.contains("https://")){
                  //  web.loadUrl("https://" + website);
                //}
                web.loadUrl(website);

            }
        });
    }
}
