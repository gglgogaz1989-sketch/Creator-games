package com.engine;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    private Button btnCreateGame;
    private Button btnMyGames;
    private Button btnStore;
    private Button btnProfile;
    private Button btnSettings;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnCreateGame = findViewById(R.id.btn_create_game);
        btnCreateGame.setOnClickListener(v -> {
            // Открыть 3D редактор
            startActivity(new Intent(this, Editor3D.class));
        });
        
        btnMyGames = findViewById(R.id.btn_my_games);
        btnMyGames.setOnClickListener(v -> {
            // Список моих игр
            startActivity(new Intent(this, ProjectManager.class));
        });
        
        btnStore = findViewById(R.id.btn_store);
        btnStore.setOnClickListener(v -> {
            // Магазин игр
            startActivity(new Intent(this, GameStoreActivity.class));
        });
        
        btnProfile = findViewById(R.id.btn_profile);
        btnProfile.setOnClickListener(v -> {
            // Профиль и вход
            startActivity(new Intent(this, LoginActivity.class));
        });
    }
}
