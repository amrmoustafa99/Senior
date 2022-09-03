package com.example.senior;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText editTextEmail;
    EditText editTextPassword;

    String str1;
    String str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail = findViewById(R.id.login_et_email);
        editTextPassword = findViewById(R.id.login_et_password);



    }

    public void loginpress(View view) {
        /*
        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();
*/

        //   if(email.equals("amralshapony1@gmail.com")   &&  password.equals("123456")){
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
      /*  }
        else
            Toast.makeText(this,"Email and password wrong",Toast.LENGTH_LONG).show();
     */

/*
        if (email.isEmpty()) {
            editTextEmail.setError("Email Requird");
            return;
        }

        if (password.isEmpty()) {
            editTextPassword.setError("Email Requird");
            return;
        }
*/
    }


    public void registerpress(View view) {
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
             str1 = data.getExtras().getString("email");
            str2 = data.getExtras().getString("password");
            editTextEmail.setText(String.valueOf(str1));
            editTextPassword.setText(String.valueOf(str2));


        }
    }
}


