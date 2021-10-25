package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText login;
    private EditText pass;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.ed_gmail);
        pass = findViewById(R.id.ed_password);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String log = login.getText().toString();
                String password = pass.getText().toString();
                if (log.equals("admin@gmail.com") && password.equals("admin")) {
                    Toast.makeText(getBaseContext(), "Welcome", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getBaseContext(), "Error", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }


}