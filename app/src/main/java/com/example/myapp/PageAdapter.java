package com.example.myapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.HashMap;

public class PageAdapter extends FragmentPagerAdapter {

    private static final String TAG = "PageAdapter";
    private int num;
    private HashMap<Integer, Fragment> mFragmentHashMap = new HashMap<>();

    public PageAdapter(FragmentManager fm, int num){
        super(fm);
        this.num = num;
    }

    @Override
    public Fragment getItem(int position) {
        return createFragment(position);
    }

    @Override
    public int getCount() {
        return num;
    }

    private Fragment createFragment(int x){
        Fragment fragment = mFragmentHashMap.get(x);

        if (fragment == null){
            switch (x){
                case 0:
                    fragment = new Fragment1();
                    Log.i(TAG, "fragment1");
                    break;
                case 1:
                    fragment = new Fragment2();
                    Log.i(TAG, "fragment2");
                    break;
                case 2:
                    fragment = new Fragment3();
                    Log.i(TAG, "fragment3");
                    break;
                case 3:
                    fragment = new Fragment4();
                    Log.i(TAG, "fragment4");
                    break;
            }
            mFragmentHashMap.put(x, fragment);
        }
        return fragment;
    }
}
