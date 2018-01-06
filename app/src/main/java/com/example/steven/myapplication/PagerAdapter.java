package com.example.steven.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                tab_icgt tab1 = new tab_icgt();
                return tab1;
            case 1:
                tab_abt tab2 = new tab_abt();
                return tab2;
            case 2:
                tab_feesttent tab3 = new tab_feesttent();
                return tab3;
            case 3:
                tab_teams tab4 = new tab_teams();
                return tab4;
            case 4:
                tab_media tab5 = new tab_media();
                return tab5;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}