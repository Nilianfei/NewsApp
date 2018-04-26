package com.example.al.newshub;

import android.content.pm.PackageManager;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import com.example.al.newshub.Adapter.FragAdapter;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private SlidingPaneLayout slidingPaneLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slidingPaneLayout = (PageEnabledSlidingPaneLayout) findViewById(R.id.slidingPanelayout);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        initToolbar();
    }
    private void initToolbar() {
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slidingPaneLayout.openPane();
            }
        });
    }
}
