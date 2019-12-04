package org.ohmstheresistance.aboutomar.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.ohmstheresistance.aboutomar.R;
import org.ohmstheresistance.aboutomar.adapters.ProjectsViewPagerAdapter;
import org.ohmstheresistance.aboutomar.fragments.CupidShuffleFragment;
import org.ohmstheresistance.aboutomar.fragments.KnowYourWorldFragment;
import org.ohmstheresistance.aboutomar.fragments.TributeFragment;

public class Projects extends AppCompatActivity {

    private ViewPager projectsViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);


        projectsViewPager = findViewById(R.id.projects_viewPager);
        setUpViewPager(projectsViewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(projectsViewPager);
    }


    private void setUpViewPager(ViewPager viewPager) {

        ProjectsViewPagerAdapter projectsViewPagerAdapter = new ProjectsViewPagerAdapter(getSupportFragmentManager());
        projectsViewPagerAdapter.addFragments(new KnowYourWorldFragment(), "Know Your World");
        projectsViewPagerAdapter.addFragments(new CupidShuffleFragment(), "Cupid Shuffle");
        projectsViewPagerAdapter.addFragments(new TributeFragment(), "Tribute");

        viewPager.setAdapter(projectsViewPagerAdapter);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        overridePendingTransition(0, R.anim.scaledown);

    }
}
