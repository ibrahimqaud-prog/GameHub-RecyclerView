package com.example.game_hub;

public class NewsItem {
    private final String title;
    private final String date;
    private final String summary;

    public NewsItem(String title, String date, String summary) {
        this.title = title;
        this.date = date;
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getSummary() {
        return summary;
    }
}
