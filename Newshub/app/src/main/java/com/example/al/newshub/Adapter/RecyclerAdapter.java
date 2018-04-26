package com.example.al.newshub.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.al.newshub.News;
import com.example.al.newshub.R;

import java.util.List;

/**
 * Created by Al on 2018/4/26.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private List<News> mNewsList;
    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title;
        TextView info;

        public ViewHolder(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.image);
            title = (TextView)view.findViewById(R.id.title);
            info = (TextView)view.findViewById(R.id.view);
        }
    }
    public RecyclerAdapter() {
        super();
    }
    public RecyclerAdapter(List<News> mNewsList) {
        this.mNewsList=mNewsList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.listview,parent
                ,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder,int position) {
        News news=mNewsList.get(position);
        holder.title.setText(news.gettitle());
        holder.info.setText(news.getinfo());
        holder.imageView.setImageResource(news.getImageId());
    }
    @Override
    public int getItemCount() {
        return mNewsList.size();
    }
}
