package com.leemartinez.joaquin.chat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.leemartinez.joaquin.chat.Communication.Communication;

public class Configuration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);
    }

    public void nextPage(View view) {
        Intent intent = new Intent(this, Communication.class);
        startActivity(intent);
    }
}
