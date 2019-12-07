package org.ohmstheresistance.aboutomar.activities;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;

import android.widget.TextView;
import android.widget.ViewFlipper;

import org.ohmstheresistance.aboutomar.R;

public class AboutMe extends AppCompatActivity {


    private ViewFlipper descriptiveWordsViewFlipper;
    private TextView descriptiveWordsTextView;
    private String[] descriptiveList = {"Dedicated", "Motivated", "Hardworking", "Team-Oriented", "Charismatic", "Professional", "Driven"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);


        descriptiveWordsViewFlipper = findViewById(R.id.descriptive_words_view_flipper);

        for (String descriptiveWord : descriptiveList) {

            descriptiveWordsTextView = new TextView(this);
            descriptiveWordsTextView.setText(descriptiveWord);
            descriptiveWordsTextView.setGravity(Gravity.CENTER);
            descriptiveWordsTextView.setTextSize(40);
            descriptiveWordsTextView.setTypeface(descriptiveWordsTextView.getTypeface(), Typeface.BOLD_ITALIC);
            descriptiveWordsViewFlipper.addView(descriptiveWordsTextView);

        }

        descriptiveWordsViewFlipper.setInAnimation(AboutMe.this, R.anim.bounce);
        descriptiveWordsViewFlipper.setOutAnimation(AboutMe.this,  R.anim.slide_out_right);
        descriptiveWordsViewFlipper.setFlipInterval(4000);
        descriptiveWordsViewFlipper.startFlipping();


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        overridePendingTransition(0, 0);

    }
}

