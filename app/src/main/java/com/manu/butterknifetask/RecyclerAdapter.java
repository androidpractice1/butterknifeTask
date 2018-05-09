package com.manu.butterknifetask;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.manu.butterknifetask.model.Movie;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Movie> movieList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.recycler_title)
        TextView mTitle;
        @BindView(R.id.recycler_genre) TextView mGenre;
        @BindView(R.id.recycler_year) TextView mYear;
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }



    public RecyclerAdapter(List<Movie> movieList){
        this.movieList = movieList;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Movie movie = movieList.get(position);
        holder.mTitle.setText(movie.getTitle());
        holder.mGenre.setText(movie.getGenre());
        holder.mYear.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

}
