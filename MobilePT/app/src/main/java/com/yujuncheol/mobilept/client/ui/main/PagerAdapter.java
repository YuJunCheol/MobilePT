package com.yujuncheol.mobilept.client.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.yujuncheol.mobilept.client.R;

public class PagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3};
    private final Context mContext;
    private int mCount;

    public PagerAdapter(Context context, FragmentManager fm, int pageCount) {
        super(fm);
        mContext = context;
        this.mCount = pageCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:
                CalenderFragment tab1 = new CalenderFragment();
                return tab1;
            case 1:
                FoodFragment tab2 = new FoodFragment();
                return tab2;
            case 2:
                WeightFragment tab3 = new WeightFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return mCount;
    }
}