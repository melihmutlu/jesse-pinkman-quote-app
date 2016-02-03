package com.example.melih.btch;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

/**
 * Created by Melih on 8.8.2015.
 */
public class MainCollectionActivity extends FragmentActivity implements  FragmentInterface{

    PagerAdapter adapter ;
    ViewPager pager;
    RandomFragment randomFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager_layout);
        pager = (ViewPager) findViewById(R.id.pager);
        adapter = new PagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);


    }

    @Override
    public void playSelectedItem(String quote) {
        Log.d(MainCollectionActivity.class.getSimpleName(), quote);
        pager.setCurrentItem(0, true);
        randomFragment.playSelectedItemOnList(quote);

    }

    public class PagerAdapter extends FragmentStatePagerAdapter {

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int i) {
            switch (i){
                case 0: {
                    randomFragment = new RandomFragment();
                    return  randomFragment;
                }
                case 1: return ListItemFragment.newInstance();
                default: break;
            }

            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if(position == 0){
                return "";
            }
            else
                return "Swipe Right To See All   ";
        }
    }
}