package com.example.databasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText email,password,cPassword;
    Button btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        findViewById(R.id.registerBtn).setOnClickListener(view -> {
            Intent I = new Intent(this, login.class);
            startActivity(I);
            finish();
        });

        email=findViewById(R.id.editTextRegisterEmailAddress);
        String _email =email.getText().toString();
        password =findViewById(R.id.editTextRegisterPassword);
        String _password = password.getText().toString();
        cPassword =findViewById(R.id.editTextConfirmPassword);
        String _cPassword = cPassword.getText().toString();

        findViewById(R.id.registerBtn).setOnClickListener(view -> {
           /* if(!_email.isEmpty()){
                Toast.makeText(this, "email cannot be empty", Toast.LENGTH_LONG).show();

            }
            else if(!_password.isEmpty()){
                Toast.makeText(this, "Password cannot be empty", Toast.LENGTH_LONG).show();
            }
            else if(!_cPassword.isEmpty()){
                Toast.makeText(this, "Confirm Password cannot be empty", Toast.LENGTH_LONG).show();
            }
            else if (_password.equals(_cPassword)){
                Toast.makeText(this, "Passwords does NOT match", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Your data is saved", Toast.LENGTH_SHORT).show();
            }*/

            if(_email.isEmpty()){
                Toast.makeText(this, "EMAIL cannot be empty", Toast.LENGTH_SHORT).show();

            }
            else {
                Toast.makeText(this, "Email comfirmed", Toast.LENGTH_SHORT).show();
            }


            if(_password.isEmpty()){
                Toast.makeText(this, "Password cannot be empty", Toast.LENGTH_SHORT).show();
            }
            if(_cPassword.isEmpty()){
                Toast.makeText(this, "Comfirm password cannot be empty", Toast.LENGTH_SHORT).show();
            if (!_password.equals(_cPassword)){

            }
            }

        });
    }

    public void logintext(View view) {
        Intent I = new Intent(this, login.class);
        startActivity(I);
        finish();
    }

}