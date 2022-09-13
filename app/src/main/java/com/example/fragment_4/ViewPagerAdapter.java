package com.example.fragment_4;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStateAdapter {
    private final List<Fragment> fragList;
    private Fragment fragment;

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        fragList = new ArrayList<Fragment>();
        fragList.add(new Fragment_1());
        fragList.add(new Fragment_2());
        fragList.add(new Fragment_3());
        fragList.add(new Fragment_4());
        Log.d("main","ViewPagerAdapter"); //每次開啟都會建立一次，從背景回來也會進入
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) { //建立Fragment
        fragment = fragList.get(position);
//        switch (position){
//            case 0:
////                fragment = new Fragment_1();
//                break;
//            case 1:
////                fragment = new Fragment_2();
//                break;
//            case 2:
////                fragment = new Fragment_3();
//                break;
//        }
        Log.d("main","createFragment");

        return fragment;//每次開啟都會建立一次，從背景回來也會進入
    }

    @Override
    public int getItemCount() {//傳回 Fragment 數量
        Log.d("main","getItemCount");//每次
        return 4;
    }
}
