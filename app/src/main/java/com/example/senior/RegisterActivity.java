package com.example.senior;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class RegisterActivity extends AppCompatActivity {
    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


    }

    public void registerpress(View view) {
        Intent intent = new Intent();
        email = findViewById(R.id.email1);
        password = findViewById(R.id.login_et_password);
        intent.putExtra("email", email.getText().toString());
        intent.putExtra("password", password.getText().toString());
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

    public void showSnackBar(View view) {
        Snackbar.make(view, "Hello snack bar", Snackbar.LENGTH_LONG)
                .setAction("Undo", new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Toast.makeText(RegisterActivity.this, "Toast from snack bar", Toast.LENGTH_SHORT).show();
                    }

                }).show();

    }
}