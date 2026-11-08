package com.example.game_hub;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameViewHolder> {

    private final List<Game> games;

    public GameAdapter(List<Game> games) {
        this.games = games;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_game, parent, false);
        return new GameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        Game game = games.get(position);
        holder.imgGameCover.setImageResource(game.getCoverImage());
        holder.txtGameName.setText(game.getName());
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    static class GameViewHolder extends RecyclerView.ViewHolder {
        final ImageView imgGameCover;
        final TextView txtGameName;

        GameViewHolder(@NonNull View itemView) {
            super(itemView);
            imgGameCover = itemView.findViewById(R.id.imgGameCover);
            txtGameName = itemView.findViewById(R.id.txtGameName);
        }
    }
}
