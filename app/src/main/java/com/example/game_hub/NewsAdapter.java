package com.example.game_hub;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    private final List<NewsItem> newsList;

    public NewsAdapter(List<NewsItem> newsList) {
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_news, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        NewsItem item = newsList.get(position);
        holder.txtNewsTitle.setText(item.getTitle());
        holder.txtNewsDate.setText(item.getDate());
        holder.txtNewsSummary.setText(item.getSummary());
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    static class NewsViewHolder extends RecyclerView.ViewHolder {
        final TextView txtNewsTitle;
        final TextView txtNewsDate;
        final TextView txtNewsSummary;

        NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNewsTitle = itemView.findViewById(R.id.txtNewsTitle);
            txtNewsDate = itemView.findViewById(R.id.txtNewsDate);
            txtNewsSummary = itemView.findViewById(R.id.txtNewsSummary);
        }
    }
}
