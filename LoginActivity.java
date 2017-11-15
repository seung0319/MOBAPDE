package com.example.francis.tradepa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Francis on 15/11/2017.
 */

public class LoginActivity extends AppCompatActivity{

    private EditText userNameText;
    private EditText passwordText;

    private Button signUpButton;
    private Button logInButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        userNameText = findViewById(R.id.userNameLogin);
        passwordText = findViewById(R.id.passwordLogin);

        signUpButton = findViewById(R.id.signUpBtn);
        logInButton = findViewById(R.id.loginBtn);

        signUpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
