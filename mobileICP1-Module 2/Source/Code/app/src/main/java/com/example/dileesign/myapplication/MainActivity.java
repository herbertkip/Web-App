package com.example.dileesign.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private EditText LoginID;
    private EditText Password;
    private TextView LoginInfo;
    private Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginID = (EditText)findViewById(R.id.loginID);
        Password = (EditText)findViewById(R.id.password);
       LoginInfo = (TextView)findViewById(R.id.tv_info);
        LoginButton =(Button)findViewById(R.id.login_button);
        LoginInfo.setText("");

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(LoginID.getText().toString(),Password.getText().toString());
            }
        });
    }

    private void validate(String userLogin, String userPassword){
        if((userLogin.equals("Admin")) && (userPassword.equals("Password"))){
            Intent intent = new Intent(MainActivity.this, WelcomePage.class);
            startActivity(intent);
        }
        else{
            LoginInfo.setText("Wrong Password, Please try again");

        }
    }
}