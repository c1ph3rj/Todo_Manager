package com.c1ph3r.todomanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.firebase.ui.auth.data.model.User;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseAuth auth = FirebaseAuth.getInstance();

//        if(auth.getCurrentUser() != null){
//            startActivity(new Intent(MainActivity.this, DashboardPage.class));
//        }
//        else {
//            startActivity(new Intent(MainActivity.this, UserLoginPage.class));
//        }

        startActivity(new Intent(MainActivity.this, UserLoginPage.class));
    }
}