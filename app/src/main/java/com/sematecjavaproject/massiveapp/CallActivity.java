package com.sematecjavaproject.massiveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class CallActivity extends AppCompatActivity {

    private EditText editText_EnterPhone;
    private ImageButton imageButton_Call;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        editText_EnterPhone = (EditText) findViewById(R.id.edtEnterPhone);
        imageButton_Call = (ImageButton) findViewById(R.id.btnCall);
        imageButton_Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + editText_EnterPhone.getText().toString()));
                startActivity(intent);
            }
        });


    }
}