package com.example.al.newshub.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.al.newshub.Fragment.List_Fragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Al on 2018/4/26.
 */

public class FragAdapter extends FragmentPagerAdapter {

    List<Fragment> fragmentList=new ArrayList<>();
    public FragAdapter (FragmentManager fm) {
        super(fm);
        fragmentList.add(new List_Fragment());
        fragmentList.add(new List_Fragment());
    }
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }
    @Override
    public int getCount(){
        return 2;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Tab1";
            case 1:
                return "Tab2";
        }
        return null;
    }
}
