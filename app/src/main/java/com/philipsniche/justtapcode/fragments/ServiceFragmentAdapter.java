package com.philipsniche.justtapcode.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FILIT TECHNOLOGIES on 4/6/2017.
 */

public class ServiceFragmentAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mfragmentListList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();


    public ServiceFragmentAdapter(FragmentManager fm) {
        super(fm);
    }
    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {

        return mfragmentListList.get(position);
    }

    public void addFragment(Fragment fragment, String title)
    {
        mfragmentListList.add(fragment);
        mFragmentTitleList.add(title);
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return mfragmentListList.size();
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }
}
