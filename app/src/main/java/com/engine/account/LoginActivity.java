package com.engine.account;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    
    private EditText etEmail, etPassword;
    private Button btnLogin, btnRegister;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);
        btnRegister = findViewById(R.id.btn_register);
        
        btnLogin.setOnClickListener(v -> {
            String email = etEmail.getText().toString();
            String pass = etPassword.getText().toString();
            
            // Вход в аккаунт
            loginUser(email, pass);
        });
        
        btnRegister.setOnClickListener(v -> {
            // Регистрация
            startActivity(new Intent(this, RegisterActivity.class));
        });
    }
    
    private void loginUser(String email, String pass) {
        // Тут запрос к серверу
        Toast.makeText(this, "Добро пожаловать!", Toast.LENGTH_SHORT).show();
        finish();
    }
}
