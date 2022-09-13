package com.example.fragment_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPagerAdapter pagerAdapter;
    private ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),getLifecycle());
        viewPager = (ViewPager2) findViewById(R.id.viewPager_id);
        viewPager.setAdapter(pagerAdapter);

    }
}