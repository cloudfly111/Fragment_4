package com.example.fragment_4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private ViewPagerAdapter pagerAdapter;
    private ViewPager2 viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setBackgroundDrawable(getDrawable(R.drawable.background));
        actionbar.setTitle("TabLayout_demo");

//        1. set fragment content : create ViewPagerAdapter(extends FragmentStateAdapter)
        pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),getLifecycle());

//        2. set fragment content on ViewPager2 widget.
        viewPager = (ViewPager2) findViewById(R.id.viewPager_id);
        viewPager.setAdapter(pagerAdapter);

//        3. using TabLayoutMediator().attach() :
//        combine TabLayout widget and ViewPager2 widget.
        tabLayout = (TabLayout) findViewById(R.id.tabLayout_id);
        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Tab 1");
                        break;
                    case 1:
                        tab.setText("Tab 2");
                        break;
                    case 2:
                        tab.setText("Tab 3");
                        break;
                    case 3:
                        tab.setText("Tab 4");
                        break;
                }
            }
        }).attach();

    }
}