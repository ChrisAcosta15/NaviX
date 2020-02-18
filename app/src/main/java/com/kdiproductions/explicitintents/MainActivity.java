package com.kdiproductions.explicitintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    EditText etName;
    Button btnAct2, btnAct3, btnAct4;
    final int ACT3 = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        btnAct2 = findViewById(R.id.btnAct2);
        btnAct3 = findViewById(R.id.btnAct3);
        btnAct4 = findViewById(R.id.btnAct4);



        btnAct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,  // this intent moves you from main activity to act3
                        com.kdiproductions.explicitintents.Events.class);

                startActivity(intent);

            }
        });


        btnAct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,  // this intent moves you from main activity to act3
                        com.kdiproductions.explicitintents.CompanyEditor.class);

                startActivity(intent);

            }
        });

        btnAct4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,  // this intent moves you from main activity to act3
                        com.kdiproductions.explicitintents.Company2.class);

                startActivity(intent);
            }
        });


    }


}
