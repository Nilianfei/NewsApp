package com.example.al.newshub.Fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.al.newshub.Adapter.MyViewPagerAdapter;
import com.example.al.newshub.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class RightFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private MyViewPagerAdapter mViewPagerAdapter;
    private View view;
    private static int[] scrollY={0,0};
    public RightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_right,container,false);

        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        viewPager = (ViewPager) view.findViewById(R.id.viewPager);

        mViewPagerAdapter =new MyViewPagerAdapter(getActivity().getSupportFragmentManager());
        mViewPagerAdapter.addFragment(List_Fragment_1.newInstance(),"tab1");
        mViewPagerAdapter.addFragment(List_Fragment_2.newInstance(),"tab2");
        viewPager.setAdapter(mViewPagerAdapter);
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
