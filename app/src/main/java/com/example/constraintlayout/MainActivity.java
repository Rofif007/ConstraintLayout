package com.example.constraintlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

                    Bundle bd = new Bundle();
                    bd.putString("parameter", Email.trim());
                    bd.putString("parameter2", Password.trim());

                    Intent IntBaru = new Intent(MainActivity.this, Activity2.class);
                    IntBaru.putExtras(bd);

                    startActivity(IntBaru);
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
    //menu(actHasil)
    //menu1(actDaftar)

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Method untuk menampilkan menu.
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //membuat kondisi jika yang dipilih adalah id mnDaftar
        if (item.getItemId() == R.id.mnDaftar) {
            Intent i = new Intent(getApplicationContext(), activity_kedua.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}