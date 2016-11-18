package com.leemartinez.joaquin.chat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.leemartinez.joaquin.chat.Communication.Communication;

public class Configuration extends AppCompatActivity {

    //IP Const
    final String COMTE = "230.0.0.1";
    final String MORDOR = "230.0.0.2";
    final String ISENGARD = "230.0.0.3";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    public void nextPage(View view) {
        Intent intent = new Intent(this, Communication.class);
        startActivity(intent);
    }
}
