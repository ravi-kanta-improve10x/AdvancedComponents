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

public class AddMembersActivity extends AppCompatActivity {
    public ArrayList<String> selectTeams;
    public Spinner addMembersSp;
    public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmembers);
        getSupportActionBar().setTitle("Add Members");
        handleAddButton();
        setData();
        setUpAddMembers();
    }

    public void handleAddButton() {
        Button addMembersBtn = findViewById(R.id.add_members_btn);
        addMembersBtn.setOnClickListener(view -> {
            EditText enterNameTxt = findViewById(R.id.add_members_txt);
            String enterName = enterNameTxt.getText().toString();
            arrayAdapter.add(enterName);
            arrayAdapter.notifyDataSetChanged();
            enterNameTxt.setText("");
        });
    }

    public void setData() {
        selectTeams = new ArrayList<>();
        selectTeams.add("Team A");
        selectTeams.add("Team B");

    }

    public void setUpAddMembers() {
        addMembersSp = findViewById(R.id.select_team_sp);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, selectTeams);
        addMembersSp.setAdapter(arrayAdapter);
        addMembersSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(AddMembersActivity.this, "selectTeams: " + selectTeams.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}