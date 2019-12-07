package org.ohmstheresistance.aboutomar.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.ohmstheresistance.aboutomar.R;

public class Resume extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        overridePendingTransition(0, R.anim.scaledown);

    }
}
