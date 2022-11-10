package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class TeamActivity extends AppCompatActivity {
    public ArrayList<String> TeamsList;
    public Spinner teamNamesSp;
    public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        getSupportActionBar().setTitle("Team");
        handleAddButton();
        setData();
        setNames();

    }


    public void handleAddButton() {
        Button teamBtn = findViewById(R.id.teams_btn);
        teamBtn.setOnClickListener(view -> {
            EditText enterNameTxt = findViewById(R.id.enter_name_txt);
            String enterName = enterNameTxt.getText().toString();
            if (enterName.equals("") == false) {
                arrayAdapter.add(enterName);
                arrayAdapter.notifyDataSetChanged();
            }
            enterNameTxt.setText("");
        });
    }

    public void setData() {
        TeamsList = new ArrayList<>();
        TeamsList.add("Ravi");

    }

    public void setNames() {
        teamNamesSp = findViewById(R.id.team_names_sp);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, TeamsList);
        teamNamesSp.setAdapter(arrayAdapter);

    }
}