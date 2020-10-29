package org.ohmstheresistance.aboutomar.activities;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import org.ohmstheresistance.aboutomar.R;

public class ContactMe extends AppCompatActivity implements View.OnClickListener {

    private Button contactMeGmailButton;
    private Button contactMeGithubButton;
    private Button contactMeLinkedInButton;
    private Button contactMeDirectMessageButton;
    private Intent contactIntent;
    private LinearLayout waysToContactLinearLayout;
    private ImageView contactMeAndroidRobot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_me);

        overridePendingTransition(0, R.anim.slide_out_right);


        ActionBar bar = getSupportActionBar();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            bar.setBackgroundDrawable(new ColorDrawable(getColor(R.color.actionBarColorTest)));
        }

        contactMeGmailButton = findViewById(R.id.contact_me_gmail_button);
        contactMeGithubButton = findViewById(R.id.contact_me_github_button);
        contactMeLinkedInButton = findViewById(R.id.contact_me_linked_in_button);
        contactMeDirectMessageButton = findViewById(R.id.contact_me_phone_call_button);
        waysToContactLinearLayout = findViewById(R.id.ways_to_contact_linear);
        contactMeAndroidRobot = findViewById(R.id.contact_me_android_robot);

        contactMeGmailButton.setOnClickListener(this);
        contactMeGithubButton.setOnClickListener(this);
        contactMeLinkedInButton.setOnClickListener(this);
        contactMeDirectMessageButton.setOnClickListener(this);


        waysToContactLinearLayout.startAnimation(AnimationUtils.loadAnimation(ContactMe.this, R.anim.slide_in_bottom));
        contactMeAndroidRobot.startAnimation(AnimationUtils.loadAnimation(ContactMe.this, R.anim.slide_in_bottom));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                contactMeAndroidRobot.startAnimation(AnimationUtils.loadAnimation(ContactMe.this, R.anim.exit_bottom));

            }
        }, 3000);

    }


    @Override
    public void onClick(View v) {

        int id = v.getId();

        switch (id) {

            case R.id.contact_me_phone_call_button:

                String numberToCall = "973-289-2836";

                contactIntent = new Intent(Intent.ACTION_DIAL);
                contactIntent.setData(Uri.parse("tel:" + numberToCall));
                startActivity(contactIntent);

                overridePendingTransition(R.anim.zoom_enter, R.anim.zoom_exit);
                break;

            case R.id.contact_me_gmail_button:

                contactIntent = new Intent(Intent.ACTION_SEND);
                contactIntent.setType("message/rfc822");
                contactIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"raymondomardev@gmail.com"});
                contactIntent.putExtra(Intent.EXTRA_SUBJECT, "Hello, Omar!");

                try {
                    startActivity(Intent.createChooser(contactIntent, "Email me"));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(ContactMe.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
                overridePendingTransition(R.anim.zoom_enter, R.anim.zoom_exit);

                break;

            case R.id.contact_me_github_button:

                String githubURL = "https://github.com/InquisitiveMindHasToKnow";

                contactIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(githubURL));
                startActivity(contactIntent);
                overridePendingTransition(R.anim.zoom_enter, R.anim.zoom_exit);

                break;

            case R.id.contact_me_linked_in_button:

                String linkedInURL = "https://www.linkedin.com/in/omarraymond";

                contactIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(linkedInURL));
                startActivity(contactIntent);
                overridePendingTransition(R.anim.zoom_enter, R.anim.zoom_exit);

                break;

        }

    }
}
