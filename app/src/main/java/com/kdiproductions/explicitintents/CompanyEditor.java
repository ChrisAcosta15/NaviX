package com.kdiproductions.explicitintents;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CompanyEditor extends AppCompatActivity {


    private static int RESULT_LOAD_IMAGE = 1;
    EditText etLinkWebsite, etLinkJobs, etCompanyName, etDesc, etFilters;
    String linkWeb, linkJobs, compName, compDesc, notfilt, fil1, fil2, fil3, fil4;
    Button submit;
    ImageView imageView;
    String[] values;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.companyeditor);
        etLinkWebsite = findViewById(R.id.etLinkWebsite);
        etLinkJobs = findViewById(R.id.etLinkJobs);
        etCompanyName = findViewById(R.id.etCompanyName);
        etDesc = findViewById(R.id.etDesc);
        submit = findViewById(R.id.btnSubmit);
        etFilters = findViewById(R.id.etFilters);


        Button buttonLoadImage = (Button) findViewById(R.id.buttonLoadPicture);
        buttonLoadImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent i = new Intent(
                        Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

                startActivityForResult(i, RESULT_LOAD_IMAGE);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linkWeb = etLinkWebsite.getText().toString();
                linkJobs = etLinkJobs.getText().toString();
                compName = etCompanyName.getText().toString();
                compDesc = etDesc.getText().toString();
                notfilt = etFilters.getText().toString();

                values = notfilt.split(",");

                fil1 = values[0];
                fil2 = values[1];
                fil3 = values[2];
                fil4 = values[3];


                if(linkWeb.isEmpty() || linkJobs.isEmpty() || compName.isEmpty() || compDesc.isEmpty()){
                    Toast.makeText(CompanyEditor.this, "Please Enter all Fields!", Toast.LENGTH_SHORT).show();
                }
                else {
                    String firstInput = compName;
                    String secondInput = compDesc;
                    String thirdInput = linkJobs;
                    String fourthInput = linkWeb;

                    Intent inte = new Intent (CompanyEditor.this, CompanyEditedVersion.class);
                    inte.putExtra("name", firstInput);
                    inte.putExtra("desc", secondInput);
                    inte.putExtra("jobs", thirdInput);
                    inte.putExtra("website", fourthInput);

                    startActivity(inte);

                    Intent intet = new Intent(CompanyEditor.this, Events.class);
                    intet.putExtra("filt1", fil1);
                    intet.putExtra("filt2", fil2);
                    intet.putExtra("filt3", fil3);
                    intet.putExtra("filt4", fil4);

                    startActivity(intet);



                }
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = { MediaStore.Images.Media.DATA };

            Cursor cursor = getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath = cursor.getString(columnIndex);
            cursor.close();

            imageView = (ImageView) findViewById(R.id.imgView44);
            imageView.setImageBitmap(BitmapFactory.decodeFile(picturePath));

        }


    }
}