package org.ohmstheresistance.aboutomar.adapters;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ProjectsViewPagerAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentTitleList = new ArrayList<>();

    public ProjectsViewPagerAdapter(FragmentManager projectsFragmentManager) {
        super(projectsFragmentManager);
    }

    public void addFragments(Fragment fragment, String fragmentTitle) {

        fragmentList.add(fragment);
        fragmentTitleList.add(fragmentTitle);
    }

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
