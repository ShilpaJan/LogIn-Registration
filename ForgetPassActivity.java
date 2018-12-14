package com.example.paresh.myfisrtproject;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgetPassActivity extends AppCompatActivity {
    TextInputEditText password_edit_text,confirmpass_edit_text;
    Button btnConfirm;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass);

        password_edit_text=findViewById(R.id.password_edit_text);
        confirmpass_edit_text=findViewById(R.id.confirmpass_edit_text);
        btnConfirm=findViewById(R.id.btnConfirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
