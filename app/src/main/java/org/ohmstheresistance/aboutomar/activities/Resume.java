package org.ohmstheresistance.aboutomar.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import org.ohmstheresistance.aboutomar.R;

public class Resume extends AppCompatActivity {

    private TextView pursuitExperienceTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        pursuitExperienceTextview = findViewById(R.id.pursuit_experience_textview);
       // pursuitExperienceTextview.startAnimation(AnimationUtils.loadAnimation(Resume.this, R.anim.slide_in_left));


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        overridePendingTransition(0, R.anim.exit_bottom);

    }
}
