package org.ohmstheresistance.aboutomar.fragments;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;

import org.ohmstheresistance.aboutomar.R;

public class KnowYourWorldFragment extends Fragment {


    private View rootView;
    private TextView knowYourWorldDescriptionTextView;
    private Button knowYourWorldLinkButton;
    private PhotoView knowYourWorldMainPageImageView;
    private PhotoView knowYourWorldStudyImageView;
    private PhotoView knowYourWorldSelectedCountryImageView;
    private PhotoView knowYourWorldQuizMainPageImageView;
    private PhotoView knowYourWorldQuizImageView;
    private PhotoView knowYourWorldFavoriteCountriesImageView;


    public KnowYourWorldFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_know_your_world, container, false);

        knowYourWorldDescriptionTextView = rootView.findViewById(R.id.know_your_world_description_textview);
        knowYourWorldLinkButton = rootView.findViewById(R.id.know_your_world_link_button);
        knowYourWorldMainPageImageView = rootView.findViewById(R.id.kyw_main_page_imageview);
        knowYourWorldStudyImageView = rootView.findViewById(R.id.kyw_study_imageview);
        knowYourWorldSelectedCountryImageView = rootView.findViewById(R.id.kyw_selected_country_imageview);
        knowYourWorldQuizMainPageImageView = rootView.findViewById(R.id.kyw_quiz_mainpage_imageview);
        knowYourWorldQuizImageView = rootView.findViewById(R.id.kyw_quiz_imageview);
        knowYourWorldFavoriteCountriesImageView = rootView.findViewById(R.id.kyw_favorite_countries_imageview);

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        knowYourWorldLinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String linkedInURL = "https://github.com/InquisitiveMindHasToKnow/Know-Your-World";

                Intent viewLinkIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(linkedInURL));
                startActivity(viewLinkIntent);
            }
        });

    }
}
