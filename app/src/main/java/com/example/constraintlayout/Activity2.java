package com.example.constraintlayout;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    TextView txEmail, txPassword;
    String Email, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman2);

        txEmail = (TextView) findViewById(R.id.tvEmail);
        txPassword = (TextView) findViewById(R.id.tvPassword);
        Bundle b2 = this.getIntent().getExtras();
        Email = b2.getString("parameter");
        Password = b2.getString("parameter2");


        txEmail.setText(Email);
        txPassword.setText(Password);
    }
}
