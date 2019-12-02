package org.ohmstheresistance.aboutomar.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import org.ohmstheresistance.aboutomar.R;

public class MainActivity extends AppCompatActivity {

    private Button profileAboutMeButton;
    private Button profileContactMeButton;
    private Button profileProjectsButton;
    private Button profileResumeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        profileAboutMeButton = findViewById(R.id.profile_about_me_button);
        profileContactMeButton = findViewById(R.id.profile_contact_me_button);
        profileProjectsButton = findViewById(R.id.profile_projects_button);
        profileResumeButton = findViewById(R.id.profile_resume_button);
    }
}
