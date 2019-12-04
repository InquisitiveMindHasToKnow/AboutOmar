package org.ohmstheresistance.aboutomar.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ProjectsViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentTitleList = new ArrayList<>();

    public ProjectsViewPagerAdapter(FragmentManager projectsFragmentManager) {
        super(projectsFragmentManager);
    }

    public void addFragments(Fragment fragment, String fragmentTitle) {

        fragmentList.add(fragment);
        fragmentTitleList.add(fragmentTitle);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return fragmentTitleList.get(position);
    }


    @Override
    public Fragment getItem(int i) {

        return fragmentList.get(i);
}

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
