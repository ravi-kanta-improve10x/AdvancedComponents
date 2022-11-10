package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class LocationActivity extends AppCompatActivity {

    public ArrayList<String> location;
    public Spinner locationSp;
    public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        getSupportActionBar().setTitle("Location");
        setUpLocationData();
        location();


    }

    public void setUpLocationData() {
        location = new ArrayList<>();
        location.add("Andhra Pradesh");
        location.add("Arunachal Pradesh");
        location.add("Assam");
        location.add("Bihar");
        location.add("Chhattisgarh");
        location.add("Goa");
        location.add("Gujarat");
        location.add("Haryana");
        location.add("Himachal Pradesh");
        location.add("Jharkhand");
        location.add("Karnataka");
        location.add("Kerala");
        location.add("Madhya Pradesh");
        location.add("Maharashtra");
        location.add("Manipur");
        location.add("Meghalaya");
        location.add("Mizoram");
        location.add("Nagaland");
        location.add("Odisha");
        location.add("Punjab");
        location.add("Rajasthan");
        location.add("Sikkim");
        location.add("Tamil Nadu");
        location.add("Telangana");
        location.add("Tripura");
        location.add("Uttar Pradesh");
        location.add("Uttarakhand");
        location.add("West Bengal");
    }

    public void location() {
        locationSp = findViewById(R.id.location_sp);
        arrayAdapter = new ArrayAdapter<>(this, R.layout.uppercase_states_item, location);
        locationSp.setAdapter(arrayAdapter);
        locationSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(LocationActivity.this, "Location:" + location.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


}
