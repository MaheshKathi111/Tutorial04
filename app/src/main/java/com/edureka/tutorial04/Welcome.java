package com.edureka.tutorial04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    TextView txtWelcomeMessage,txtname,txtcountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String country = bundle.getString("country");
        String status = bundle.getString("status");

        txtname = findViewById(R.id.txtname);
        txtcountry = findViewById(R.id.txtlname);


      /*  Toast.makeText(Welcome.this,name, Toast.LENGTH_SHORT).show();
       Toast.makeText(Welcome.this,country, Toast.LENGTH_SHORT).show();
        Toast.makeText(Welcome.this,status, Toast.LENGTH_SHORT).show();
*/
      txtname.setText("First Name : "+name);
      txtcountry.setText("Country : "+country);

        txtWelcomeMessage = findViewById(R.id.txtWelcomeMessage);

        Intent intent=getIntent();
        String username = intent.getStringExtra("username");

        txtWelcomeMessage.setText("Welcome " + username);
    }
}