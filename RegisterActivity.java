package com.example.paresh.myfisrtproject;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    TextInputEditText name_edit_text,address_edit_text,mobno_edit_text,email_edit_text,password_edit_text;

    Button btnRsgd;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        btnRsgd=findViewById(R.id.btnRsgd);
        name_edit_text=findViewById(R.id.name_edit_text);
       address_edit_text=findViewById(R.id.address_edit_text);
        mobno_edit_text=findViewById(R.id.mobno_edit_text);
        email_edit_text=findViewById(R.id.email_edit_text);
       password_edit_text=findViewById(R.id.password_edit_text);

        btnRsgd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                Toast.makeText(getApplicationContext(),"Register successfuly",Toast.LENGTH_SHORT).show();


            }
        });
    }

}
