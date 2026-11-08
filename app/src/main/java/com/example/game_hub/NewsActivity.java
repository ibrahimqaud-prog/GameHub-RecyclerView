package com.example.game_hub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends AppCompatActivity {

    ImageView imgBack, imgHome, imgMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        imgBack = findViewById(R.id.imgBack);
        imgHome = findViewById(R.id.imgHome);
        imgMenu = findViewById(R.id.imgMenu);

        List<NewsItem> newsList = new ArrayList<>();
        newsList.add(new NewsItem("New Season Launches Next Week", "Sep 1, 2026",
                "A major content update is arriving with new maps, characters, and challenges."));
        newsList.add(new NewsItem("Studio Announces Sequel", "Aug 28, 2026",
                "A long-awaited sequel to a popular franchise has been officially revealed."));
        newsList.add(new NewsItem("Esports Tournament Results", "Aug 25, 2026",
                "The regional finals wrapped up this weekend with a surprise underdog victory."));
        newsList.add(new NewsItem("Hardware Update Rolls Out", "Aug 20, 2026",
                "A performance patch has improved load times and frame rates across devices."));
        newsList.add(new NewsItem("Community Event This Weekend", "Aug 18, 2026",
                "Players can join a limited-time in-game event featuring exclusive rewards."));

        RecyclerView recyclerNews = findViewById(R.id.recyclerNews);
        recyclerNews.setLayoutManager(new LinearLayoutManager(this));
        recyclerNews.setAdapter(new NewsAdapter(newsList));

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewsActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imgMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewsActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
