package com.example.fragment_4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    private Fragment fragment;

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) { //建立Fragment
        switch (position){
            case 0:
                fragment = new Fragment_1();
                break;
            case 1:
                fragment = new Fragment_2();
                break;
            case 2:
                fragment = new Fragment_3();
                break;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {//傳回 Fragment 數量
        return 3;
    }
}
