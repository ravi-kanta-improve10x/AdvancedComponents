package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TeamListActivity extends AppCompatActivity {
    public ArrayList<String> namesList;
    public ListView teamNamesLv;
    public ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);
        getSupportActionBar().setTitle("Team List");
        handleAddButton();
        handleDeleteButton();
        setData();
        setNames();
    }

    public void handleDeleteButton() {
        Button deleteBtn = findViewById(R.id.memebers_names_delete_btn);
        deleteBtn.setOnClickListener(view -> {
            EditText enterNameTxt = findViewById(R.id.members_name_txt);
            String enterName = enterNameTxt.getText().toString();
            arrayAdapter.remove(enterName);
            arrayAdapter.notifyDataSetChanged();
            enterNameTxt.setText("");
        });
    }

    public void handleAddButton() {
        Button teamBtn = findViewById(R.id.members_name_add_btn);
        teamBtn.setOnClickListener(view -> {
            EditText enterNameTxt = findViewById(R.id.members_name_txt);
            String enterName = enterNameTxt.getText().toString();
            if(enterName.equals("") == false){
                arrayAdapter.add(enterName);
                arrayAdapter.notifyDataSetChanged();
            }
            enterNameTxt.setText("");
        });
    }

    public void setData() {
        namesList = new ArrayList<>();
        namesList.add("Viswanath");
        namesList.add("Renuka");
    }

    public void setNames() {
        teamNamesLv = findViewById(R.id.names_lv);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, namesList);
        teamNamesLv.setAdapter(arrayAdapter);
        teamNamesLv.setOnItemClickListener((adapterView, view, position, id) -> {
            Toast.makeText(this, "clicked : " + namesList.get(position), Toast.LENGTH_SHORT).show();
            String enterName = namesList.get(position);
            EditText enterNameTxt = findViewById(R.id.members_name_txt);
            enterNameTxt.setText(enterName);
        });
    }
}
