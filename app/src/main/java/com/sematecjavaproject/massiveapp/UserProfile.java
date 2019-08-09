package com.sematecjavaproject.massiveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserProfile extends AppCompatActivity {

    private Button btnEdit_UserProfile;
    private Button btnConfirm_UserProfile;
    private TextView txtSavedMessage_UserProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);



        Button btnEdit = (Button) findViewById(R.id.btnEdit);
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(UserProfile.this, UserData.class);
                startActivity(i2);
                finish();
            }
        });



        Button btnConfirm = (Button) findViewById(R.id.btnConfirm);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String showMessage = "Your data saved successful...";
                PreferenceManager.getDefaultSharedPreferences(UserProfile.this)
                        .edit()
                        .putString("username", showMessage)
                        .apply();

                Intent intent = new Intent(UserProfile.this, UserData.class);
                startActivityForResult(intent, 1500);

                Intent i3 = new Intent(UserProfile.this, UserData.class);
                startActivity(i3);

            }
        });
    }



}


//    Button btnConfirm = (Button) findViewById(R.id.btnConfirm);
//    final TextView txtSavedMessage = (TextView) findViewById(R.id.txtSavedMessage);
//
//    String showMessage = PreferenceManager.getDefaultSharedPreferences(UserProfile.this)
//            .getString("message","Your data in not saved yet...!");
//        txtSavedMessage.setText(showMessage);
//
//                btnConfirm.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//        String saveMessage = "Your data saved successful...!";
//
//        PreferenceManager.getDefaultSharedPreferences(UserProfile.this)
//        .edit()
//        .putString("message",saveMessage)
//        .apply();
//        Intent i3 = new Intent(UserProfile.this, UserData.class);
//        startActivity(i3);
//        }
//        });