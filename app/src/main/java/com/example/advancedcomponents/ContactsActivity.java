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

public class ContactsActivity extends AppCompatActivity {
    public ArrayList<Contact> contactList;
    public ListView contactNamesLv;
    public ArrayAdapter<Contact> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        getSupportActionBar().setTitle("Contacts");
        setContactData();
        setContactName();
        setContactAddBtn();

    }
    public void setContactAddBtn() {
        Button contactAddBtn = findViewById(R.id.contact_add_btn);
        contactAddBtn.setOnClickListener(view -> {
            EditText contactNameTxt = findViewById(R.id.contact_name_txt);
            String contactName = contactNameTxt.getText().toString();
            EditText contactNumberTxt = findViewById(R.id.contact_number_txt);
            String contactNumber = contactNumberTxt.getText().toString();
            Toast.makeText(this, contactName + contactNumber, Toast.LENGTH_SHORT).show();

        });

    }

    public void setContactData() {
        contactList = new ArrayList<>();
        Contact vissu = new Contact();
        vissu.name = "Viswanath";
        vissu.phoneNumber = "+91 9000540052";
        contactList.add(vissu);
        Contact renu = new Contact();
        renu.name = "Renuka";
        renu.phoneNumber = "+91 9886655979";
        contactList.add(renu);
    }
    public void setContactName() {
        contactNamesLv = findViewById(R.id.contact_lv);
        arrayAdapter = new ArrayAdapter<Contact>(this, android.R.layout.simple_list_item_1,contactList);
        contactNamesLv.setAdapter(arrayAdapter);

    }
}