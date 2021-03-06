package com.edureka.tutorial04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUsername,edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtpassword);

    }

    public void btnLoginClick(View view) {

        String valUsername = edtUsername.getText().toString();
        String valPassword = edtPassword.getText().toString();
        if(valUsername.equals("")){
            Toast.makeText(this, "UserName can not be empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(valPassword.equals("")){
            Toast.makeText(this, "Password can not be empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(valPassword.length()<6){
            Toast.makeText(this, "Password must  be of minimum 6 character", Toast.LENGTH_SHORT).show();
            return;
        }
        if(Patterns.EMAIL_ADDRESS.matcher(valUsername).matches()){
            Toast.makeText(this, "Username must be proper email address", Toast.LENGTH_SHORT).show();
            return;
        }



        if(valUsername.equals("admin") && valPassword.equals("123456"))
        {

            Intent intent = new Intent(MainActivity.this,Welcome.class);
            intent.putExtra("username" , valUsername);
            Toast.makeText(this, "Login Sucssesfully", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();

        }
        else{
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }
}