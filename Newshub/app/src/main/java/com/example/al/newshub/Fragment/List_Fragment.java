package com.example.al.newshub.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.al.newshub.Adapter.RecyclerAdapter;
import com.example.al.newshub.News;
import com.example.al.newshub.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class List_Fragment extends Fragment {

    private List<News> newsList =new ArrayList<>();
    public List_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_list, container, false);
        initNews();
        RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(layoutManager);
        RecyclerAdapter adapter = new RecyclerAdapter(newsList);
        recyclerView.setAdapter(adapter);
        return view;
    }
    private void initNews() {
        for(int i=0;i<100;i++) {
            News news = new News("title"+i,"info"+i,R.mipmap.ic_launcher);
            newsList.add(news);
        }
    }

}
