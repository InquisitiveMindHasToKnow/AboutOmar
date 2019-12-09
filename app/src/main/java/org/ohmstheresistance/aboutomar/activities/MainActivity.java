package org.ohmstheresistance.aboutomar.activities;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import org.ohmstheresistance.aboutomar.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button profileAboutMeButton;
    private Button profileContactMeButton;
    private Button profileProjectsButton;
    private Button profileResumeButton;
    private Intent navigationIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        profileAboutMeButton = findViewById(R.id.profile_about_me_button);
        profileContactMeButton = findViewById(R.id.profile_contact_me_button);
        profileProjectsButton = findViewById(R.id.profile_projects_button);
        profileResumeButton = findViewById(R.id.profile_resume_button);

        profileAboutMeButton.setOnClickListener(this);
        profileContactMeButton.setOnClickListener(this);
        profileProjectsButton.setOnClickListener(this);
        profileResumeButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();


        switch (id) {
            case R.id.profile_about_me_button:

                navigationIntent = new Intent(MainActivity.this, AboutMe.class);
                startActivity(navigationIntent);
                overridePendingTransition(R.anim.bounce, R.anim.fade);
                break;

            case R.id.profile_contact_me_button:

                navigationIntent = new Intent(MainActivity.this, ContactMe.class);
                startActivity(navigationIntent);
                overridePendingTransition(R.anim.zoom_enter, R.anim.zoom_exit);

                break;

            case R.id.profile_projects_button:

                navigationIntent = new Intent(MainActivity.this, Projects.class);
                startActivity(navigationIntent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                break;


            case R.id.profile_resume_button:

                navigationIntent = new Intent(MainActivity.this, Resume.class);
                startActivity(navigationIntent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                break;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

            overridePendingTransition(R.anim.zoom_enter, 0);
    }
}
