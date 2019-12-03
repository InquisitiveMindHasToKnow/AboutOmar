package org.ohmstheresistance.aboutomar.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.ohmstheresistance.aboutomar.R;

public class Projects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        overridePendingTransition(0, R.anim.scaledown);

    }
}
