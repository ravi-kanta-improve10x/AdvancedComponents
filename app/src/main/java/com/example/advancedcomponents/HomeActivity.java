package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");
        handleLuckyNumberBtn();
        handleLocationBtn();
        handleDobBtn();
        handleTeamBtn();
        handleAddMembers();
        handleAddListBtn();
    }

    public void handleLuckyNumberBtn() {
        Button luckyNumberBtn = findViewById(R.id.lucky_numbers_btn);
        luckyNumberBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, LuckyNumbersActivity.class);
            startActivity(intent);
        });
    }
    public void handleLocationBtn() {
        Button locationBtn = findViewById(R.id.location_btn);
        locationBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,LocationActivity.class);
            startActivity(intent);
        });
    }
    public void handleDobBtn() {
        Button dobBtn = findViewById(R.id.dob_btn);
        dobBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,DateOfBirthActivity.class);
            startActivity(intent);
        });

    }
    public void handleTeamBtn() {
        Button teamBtn = findViewById(R.id.team_btn);
        teamBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,TeamActivity.class);
            startActivity(intent);
        });
    }
    public void handleAddMembers() {
        Button addMembersBtn = findViewById(R.id.addmembers_btn);
        addMembersBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,AddMembersActivity.class);
            startActivity(intent);
        });

    }
    public void handleAddListBtn() {
        Button addListBtn = findViewById(R.id.teamlist_btn);
        addListBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,TeamListActivity.class);
            startActivity(intent);
        });

    }
}