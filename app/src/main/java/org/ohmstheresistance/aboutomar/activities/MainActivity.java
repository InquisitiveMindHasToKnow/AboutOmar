package org.ohmstheresistance.aboutomar.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import org.ohmstheresistance.aboutomar.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button profileAboutMeButton;
    private Button profileContactMeButton;
    private Button profileProjectsButton;
    private Button profileResumeButton;
    private ImageView leftAndroidBotImageView;
    private ImageView rightAndroidBotImageView;

    private Intent navigationIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        profileAboutMeButton = findViewById(R.id.profile_about_me_button);
        profileContactMeButton = findViewById(R.id.profile_contact_me_button);
        profileProjectsButton = findViewById(R.id.profile_projects_button);
        profileResumeButton = findViewById(R.id.profile_resume_button);
        leftAndroidBotImageView = findViewById(R.id.profile_left_android_bot_imageview);
        rightAndroidBotImageView = findViewById(R.id.profile_right_android_bot_imageview);

        profileAboutMeButton.setOnClickListener(this);
        profileContactMeButton.setOnClickListener(this);
        profileProjectsButton.setOnClickListener(this);
        profileResumeButton.setOnClickListener(this);

//        leftAndroidBotImageView.startAnimation(AnimationUtils.loadAnimation(this,R.anim.shake));
//        rightAndroidBotImageView.startAnimation(AnimationUtils.loadAnimation(this,R.anim.shake));
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();


        switch (id) {
            case R.id.profile_about_me_button:

                navigationIntent = new Intent(MainActivity.this, AboutMe.class);
                startActivity(navigationIntent);
                break;

            case R.id.profile_contact_me_button:

                navigationIntent = new Intent(MainActivity.this, ContactMe.class);
                startActivity(navigationIntent);

                break;

            case R.id.profile_projects_button:

                navigationIntent = new Intent(MainActivity.this, Projects.class);
                startActivity(navigationIntent);
                break;


            case R.id.profile_resume_button:

                navigationIntent = new Intent(MainActivity.this, Resume.class);
                startActivity(navigationIntent);
                break;
        }
    }

}
