package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    Button btnoke;
    EditText edEmail, edPassword;
    String Email, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnoke = findViewById(R.id.btnoke);
        edEmail = findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPassword);

        btnoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Email = edEmail.getText().toString();
                Password = edPassword.getText().toString();

                if (Email.equals("rofifanp@gmail.com") && Password.equals("Bismillah")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Berhasil ", Toast.LENGTH_LONG);
                    t.show();

                }

                else if (!Email.equals("rofifanp@gmail.com") && Password.equals("Bismillah")){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email Salah", Toast.LENGTH_LONG);
                    t.show();

                }

                else if(Email.equals("rofifanp@gmail.com") && !Password.equals("Bismillah")){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Password Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else{
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password salah", Toast.LENGTH_LONG);
                    t.show();
                }

            }
        });
    }
}