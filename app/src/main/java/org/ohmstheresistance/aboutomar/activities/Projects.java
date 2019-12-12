package org.ohmstheresistance.aboutomar.activities;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import org.ohmstheresistance.aboutomar.R;
import org.ohmstheresistance.aboutomar.adapters.ProjectsViewPagerAdapter;
import org.ohmstheresistance.aboutomar.fragments.CupidShuffleFragment;
import org.ohmstheresistance.aboutomar.fragments.KnowYourWorldFragment;
import org.ohmstheresistance.aboutomar.fragments.TributeFragment;

public class Projects extends AppCompatActivity {

    private ViewPager projectsViewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);


        projectsViewPager = findViewById(R.id.projects_viewPager);
        setUpViewPager(projectsViewPager);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(projectsViewPager);

        ActionBar bar = getSupportActionBar();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            bar.setBackgroundDrawable(new ColorDrawable(getColor(R.color.actionBarColorTest)));
        }

    }


    private void setUpViewPager(ViewPager viewPager) {

        ProjectsViewPagerAdapter projectsViewPagerAdapter = new ProjectsViewPagerAdapter(getSupportFragmentManager());
        projectsViewPagerAdapter.addFragments(new KnowYourWorldFragment(), "Know Your World");
        projectsViewPagerAdapter.addFragments(new CupidShuffleFragment(), "Cupid Shuffle");
        projectsViewPagerAdapter.addFragments(new TributeFragment(), "Tribute");

        viewPager.setAdapter(projectsViewPagerAdapter);

        viewPager.setPageTransformer(false, new ViewPager.PageTransformer() {
            @Override
            public void transformPage(View page, float position) {

                overridePendingTransition(0, R.anim.fade);

            }
        });

    }

}
