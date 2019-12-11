package org.ohmstheresistance.aboutomar.activities;

import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.ohmstheresistance.aboutomar.R;

public class Resume extends AppCompatActivity {

    private TextView resumeSkillsHeader;
    private TextView resumeExperienceHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        overridePendingTransition(0, R.anim.zoom_exit);


        ActionBar bar = getSupportActionBar();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            bar.setBackgroundDrawable(new ColorDrawable(getColor(R.color.actionBarColorTest)));
        }

        resumeSkillsHeader = findViewById(R.id.resume_skills_header_textview);
        resumeExperienceHeader = findViewById(R.id.resume_experience_header_textview);

        resumeSkillsHeader.setPaintFlags(resumeSkillsHeader.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        resumeExperienceHeader.setPaintFlags(resumeExperienceHeader.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);


    }
}
