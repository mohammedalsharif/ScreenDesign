package com.example.screendesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private static final int NUM_PAGES=5;
private ViewPager viewPager;
private ScreenSlideAdapter pagerAsapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.pager);
        pagerAsapter=new ScreenSlideAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAsapter);
    }
    private class ScreenSlideAdapter extends FragmentStatePagerAdapter{

        public ScreenSlideAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    OnBoardingFragment1 tab1=new OnBoardingFragment1();
                    return tab1;
                    case 1:
                    OnBoardingFragment2 tab2=new OnBoardingFragment2();
                    return tab2;
                    case 2:
                    OnBoardingFragment3 tab3=new OnBoardingFragment3();
                    return tab3;
                    case 3:
                    OnBoardingFragment4 tab4=new OnBoardingFragment4();
                    return tab4;
                    case 4:
                    OnBoardingFragment5 tab5=new OnBoardingFragment5();
                    return tab5;
            }
            return null;

        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}