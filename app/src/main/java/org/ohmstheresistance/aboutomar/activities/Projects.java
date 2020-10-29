package org.ohmstheresistance.aboutomar.activities;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;

import org.ohmstheresistance.aboutomar.R;
import org.ohmstheresistance.aboutomar.adapters.ProjectsViewPagerAdapter;
import org.ohmstheresistance.aboutomar.fragments.AndroidTriviaFragment;
import org.ohmstheresistance.aboutomar.fragments.CeeLoFragment;
import org.ohmstheresistance.aboutomar.fragments.CupidShuffleFragment;
import org.ohmstheresistance.aboutomar.fragments.EssentialFactsFragment;
import org.ohmstheresistance.aboutomar.fragments.KnowYourWorldFragment;
import org.ohmstheresistance.aboutomar.fragments.MastermindFragment;
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

    private void setUpViewPager(final ViewPager viewPager) {

        ProjectsViewPagerAdapter projectsViewPagerAdapter = new ProjectsViewPagerAdapter(getSupportFragmentManager());
        projectsViewPagerAdapter.addFragments(new EssentialFactsFragment(), "Essential Facts");
        projectsViewPagerAdapter.addFragments(new MastermindFragment(), "Mastermind");
        projectsViewPagerAdapter.addFragments(new KnowYourWorldFragment(), "Know Your World");
        projectsViewPagerAdapter.addFragments(new AndroidTriviaFragment(), "Android Trivia");
        projectsViewPagerAdapter.addFragments(new CupidShuffleFragment(), "Cupid Shuffle");
        projectsViewPagerAdapter.addFragments(new CeeLoFragment(), "CeeLo");
        projectsViewPagerAdapter.addFragments(new TributeFragment(), "Tribute");

        viewPager.setAdapter(projectsViewPagerAdapter);
       // viewPager.setPageTransformer(true, new CubeOutTransformer());
    }
}
