package com.example.paresh.myfisrtproject;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    TextInputEditText username_edit_text,password_edit_text;
    Button btnLogin;
    TextView txtRegd,txtForgetpass;
    private static final Pattern PASSWORD_PATTERN= Pattern.compile("^" +
            "(?=.*[a-zA-Z])" +      //any letter
            "(?=.*[@#$%^&+=])" +    //at least 1 special character
            "(?=\\S+$)" +           //no white spaces
            ".{4,}" +               //at least 4 characters
            "$");

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username_edit_text=(TextInputEditText)findViewById(R.id.username_edit_text);
        password_edit_text=(TextInputEditText)findViewById(R.id.password_edit_text);
        btnLogin=(Button)findViewById(R.id.btnLogin);
        txtRegd=(TextView)findViewById(R.id.txtRegd);
        txtForgetpass=findViewById(R.id.txtForgetpass);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent=new Intent(getApplicationContext(),NavigationActivity.class);
                startActivity(intent);
            }
        });

        txtRegd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(intent);
            }
        });

        txtForgetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent=new Intent(getApplicationContext(),ForgetPassActivity.class);
                startActivity(intent);
            }
        });



    }

    private boolean validateUsername() {
        String usernameInput =username_edit_text.getText().toString().trim();
        if (usernameInput.isEmpty()){
            username_edit_text.setError("Field can't be empty");
            return false;
        }else {
            username_edit_text.setError(null);
            return true;
        }

    }

    private boolean validatePassword() {
        String passwordInput = password_edit_text.getText().toString().trim();

        if (passwordInput.isEmpty()) {
            password_edit_text.setError("Field can't be empty");
            return false;
        } else if (!PASSWORD_PATTERN.matcher(passwordInput).matches()) {
            password_edit_text.setError("Password too weak");
            return false;
        } else {
            password_edit_text.setError(null);
            return true;
        }
    }

}
