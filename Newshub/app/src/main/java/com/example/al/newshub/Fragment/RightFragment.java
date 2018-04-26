package com.example.al.newshub.Fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.al.newshub.Adapter.FragAdapter;
import com.example.al.newshub.JudgeNestedScrollView;
import com.example.al.newshub.R;
import com.example.al.newshub.WrapContentHeightViewPager;


/**
 * A simple {@link Fragment} subclass.
 */
public class RightFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private FragAdapter fragAdapter;
    private View view;
    public RightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_right,container,false);

        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        viewPager = (WrapContentHeightViewPager) view.findViewById(R.id.viewPager);
        fragAdapter = new FragAdapter(getActivity().getSupportFragmentManager());
        viewPager.setAdapter(fragAdapter);
        tabLayout.setupWithViewPager(viewPager);

        initViewPager();
        initTabLayout();

        return view;
    }

    private void initViewPager() {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                ((JudgeNestedScrollView)view.findViewById(R.id.nestedScrollView)).scrollTo(0,0);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private  void initTabLayout(){
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.i("tag","点击的第"+tab.getPosition()+"个卡片");
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                Log.i("tag","取消了第"+tab.getPosition()+"个卡片的显示");
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Log.i("tag","第"+tab.getPosition()+"个卡片重新被点击");
            }
        });
    }

}
