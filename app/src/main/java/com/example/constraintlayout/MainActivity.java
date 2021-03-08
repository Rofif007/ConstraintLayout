package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

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

                Toast t = Toast.makeText(getApplicationContext(),
                         " dan Email " + Email + " dan Password anda: " + Password + " ", Toast.LENGTH_LONG);
                t.show();
            }
            public boolean validasiData(){
                String emailActive = "rofif@gmail.com";
                String passActive = "Wek";

                if(emailActive.equals(edEmail.getText().toString()) && passActive.equals(edPassword.getText().toString())){
                    return true;
                }
                return false;
            }
        });
    }
}