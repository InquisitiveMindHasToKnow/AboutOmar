package org.ohmstheresistance.aboutomar.activities;

import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;

import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import org.ohmstheresistance.aboutomar.R;

public class AboutMe extends AppCompatActivity {


    private ViewFlipper descriptiveWordsViewFlipper;

    private TextView descriptiveWordsTextView;
    private ScrollView aboutMeScrollView;
    private String[] descriptiveList = {"Analytical","Goal-Oriented", "Innovative", "Motivated", "Hardworking", "Team-Oriented", "Charismatic", "Professional", "Driven", "Forward-Thinking"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        overridePendingTransition(0, R.anim.slide_out_left);


        ActionBar bar = getSupportActionBar();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            bar.setBackgroundDrawable(new ColorDrawable(getColor(R.color.actionBarColorTest)));

        }

        descriptiveWordsViewFlipper = findViewById(R.id.descriptive_words_view_flipper);
        aboutMeScrollView = findViewById(R.id.about_me_scrollview);


        for (String descriptiveWord : descriptiveList) {

            descriptiveWordsTextView = new TextView(this);
            descriptiveWordsTextView.setText(descriptiveWord);
            descriptiveWordsTextView.setGravity(Gravity.CENTER);
            descriptiveWordsTextView.setTextSize(40);
            descriptiveWordsTextView.setTextColor(getResources().getColor(R.color.textColor));
            descriptiveWordsTextView.setTypeface(descriptiveWordsTextView.getTypeface(), Typeface.BOLD_ITALIC);
            descriptiveWordsViewFlipper.addView(descriptiveWordsTextView);

        }

        descriptiveWordsViewFlipper.setInAnimation(AboutMe.this, R.anim.scaleup);
        descriptiveWordsViewFlipper.setOutAnimation(AboutMe.this,  R.anim.slide_out_right);
        descriptiveWordsViewFlipper.setFlipInterval(4000);
        descriptiveWordsViewFlipper.startFlipping();


    }

}

