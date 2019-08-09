package com.sematecjavaproject.massiveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserData extends AppCompatActivity {

    private EditText edtText_UserData;
    private Button btn_UserData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data);

        Button btnNext = (Button) findViewById(R.id.btnNext);
        final EditText edtFirstName = (EditText) findViewById(R.id.edtFirstName);
        final EditText edtSurName = (EditText) findViewById(R.id.edtSurname);
        final EditText edtAge = (EditText) findViewById(R.id.edtAge);
        final EditText edtTextPhoneNumber = (EditText) findViewById(R.id.edtTextPhoneNumber);
        final EditText edtAddress = (EditText) findViewById(R.id.edtAddress);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName = edtFirstName.getText().toString();
                String surName = edtSurName.getText().toString();
                String age = edtAge.getText().toString();
                String textPhoneNumber = edtTextPhoneNumber.getText().toString();
                String address = edtAddress.getText().toString();

                Intent intent = new Intent(UserData.this, UserProfile.class);
                startActivityForResult(intent, 1001);
            }
        });

    }
    }