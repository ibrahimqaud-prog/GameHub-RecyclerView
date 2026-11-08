package com.example.game_hub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    RecyclerView recyclerGames;
    ArrayList<Game> gameList;
    GameAdapter gameAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerGames = findViewById(R.id.recyclerGames);

        gameList = new ArrayList<>();
        gameList.add(new Game("Elden Ring", R.drawable.placeholder_game_cover));
        gameList.add(new Game("God of War Ragnarok", R.drawable.placeholder_game_cover));
        gameList.add(new Game("Spider-Man 2", R.drawable.placeholder_game_cover));
        gameList.add(new Game("Call of Duty: Warzone", R.drawable.placeholder_game_cover));
        gameList.add(new Game("FIFA 26", R.drawable.placeholder_game_cover));
        gameList.add(new Game("Grand Theft Auto V", R.drawable.placeholder_game_cover));
        gameList.add(new Game("The Last of Us Part II", R.drawable.placeholder_game_cover));
        gameList.add(new Game("Minecraft", R.drawable.placeholder_game_cover));
        gameList.add(new Game("Fortnite", R.drawable.placeholder_game_cover));
        gameList.add(new Game("Cyberpunk 2077", R.drawable.placeholder_game_cover));
        gameList.add(new Game("Red Dead Redemption 2", R.drawable.placeholder_game_cover));
        gameList.add(new Game("Horizon Forbidden West", R.drawable.placeholder_game_cover));
        gameList.add(new Game("Assassin's Creed Mirage", R.drawable.placeholder_game_cover));
        gameList.add(new Game("Street Fighter 6", R.drawable.placeholder_game_cover));
        gameList.add(new Game("Mortal Kombat 1", R.drawable.placeholder_game_cover));

        gameAdapter = new GameAdapter(gameList);
        recyclerGames.setLayoutManager(new GridLayoutManager(this, calculateSpanCount()));
        recyclerGames.setAdapter(gameAdapter);

        ImageView imgSearchIcon = findViewById(R.id.imgSearchIcon);
        imgSearchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        ImageView imgProfile = findViewById(R.id.imgProfile);
        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        ImageView imgNews = findViewById(R.id.imgNews);
        imgNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, NewsActivity.class);
                startActivity(intent);
            }
        });

        ImageView imgMenu = findViewById(R.id.imgMenu);
        imgMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }

    // Roughly one column per 130dp of screen width (like GridView's auto_fit), at least 2.
    private int calculateSpanCount() {
        float widthDp = getResources().getDisplayMetrics().widthPixels
                / getResources().getDisplayMetrics().density;
        return Math.max(2, (int) (widthDp / 130));
    }
}
