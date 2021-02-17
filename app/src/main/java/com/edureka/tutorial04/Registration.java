package com.edureka.tutorial04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
    Button btnSubmit;
    EditText edtName,edtLastname,edtEmail,edtPassword;
    Switch switchBranch;
    Spinner spinner;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        btnSubmit = findViewById(R.id.btnSubmit);
        edtName = findViewById(R.id.edtName);
        edtLastname = findViewById(R.id.edtLastname);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        switchBranch = findViewById(R.id.switchBranch);
        spinner = findViewById(R.id.spinner);
        checkBox = findViewById(R.id.checkBox);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String lname = edtLastname.getText().toString();
                String email = edtEmail.getText().toString();
                String password = edtPassword.getText().toString();
                String country = spinner.getSelectedItem().toString();
                String status ="";
                        if(checkBox.isChecked())
                        {
                            status="Active";
                        }
                        else {
                            status="Inactive";
                        }
                 Intent i = new Intent(Registration.this,Welcome.class);
                        i.putExtra("name",name);
                        i.putExtra("country",country);
                        i.putExtra("status",status);
                        startActivity(i);


              //  Toast.makeText(Registration.this,name, Toast.LENGTH_SHORT).show();
                //Toast.makeText(Registration.this,country, Toast.LENGTH_SHORT).show();
               // Toast.makeText(Registration.this,status, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){

            case R.id.logout:
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "Default", Toast.LENGTH_SHORT).show();
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}