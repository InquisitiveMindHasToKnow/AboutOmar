package org.ohmstheresistance.aboutomar.fragments;


import android.app.AlertDialog;
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
import android.widget.ImageView;
import android.widget.TextView;

import org.ohmstheresistance.aboutomar.R;

public class KnowYourWorldFragment extends Fragment implements View.OnClickListener{


    private View rootView;
    private TextView knowYourWorldDescriptionTextView;
    private Button knowYourWorldLinkButton;
    private ImageView knowYourWorldMainPageImageView;
    private ImageView knowYourWorldStudyImageView;
    private ImageView knowYourWorldSelectedCountryImageView;
    private ImageView knowYourWorldQuizMainPageImageView;
    private ImageView knowYourWorldQuizImageView;
    private ImageView knowYourWorldFavoriteCountriesImageView;

    private AlertDialog.Builder zoomedImageAlertDialog;
    private View viewTemplateLayout;
    private ImageView zoomedSelectedImage;
    private ViewGroup parent;

    public KnowYourWorldFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_know_your_world, container, false);

        knowYourWorldDescriptionTextView = rootView.findViewById(R.id.know_your_world_description_textview);
        knowYourWorldLinkButton = rootView.findViewById(R.id.know_your_world_link_button);
        knowYourWorldMainPageImageView = rootView.findViewById(R.id.kyw_main_page_imageview);
        knowYourWorldStudyImageView = rootView.findViewById(R.id.kyw_study_imageview);
        knowYourWorldSelectedCountryImageView = rootView.findViewById(R.id.kyw_selected_country_imageview);
        knowYourWorldQuizMainPageImageView = rootView.findViewById(R.id.kyw_quiz_mainpage_imageview);
        knowYourWorldQuizImageView = rootView.findViewById(R.id.kyw_quiz_imageview);
        knowYourWorldFavoriteCountriesImageView = rootView.findViewById(R.id.kyw_favorite_countries_imageview);

        zoomedImageAlertDialog = new AlertDialog.Builder(getActivity(), R.style.DialogCustom);
        viewTemplateLayout = inflater.inflate(R.layout.fragment_display_zoomed_image, container, false);
        zoomedSelectedImage = viewTemplateLayout.findViewById(R.id.zoomed_in_image_imageview);
        parent = (ViewGroup) viewTemplateLayout.getParent();

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

        knowYourWorldMainPageImageView.setOnClickListener(this);
        knowYourWorldStudyImageView.setOnClickListener(this);
        knowYourWorldSelectedCountryImageView.setOnClickListener(this);
        knowYourWorldQuizMainPageImageView.setOnClickListener(this);
        knowYourWorldQuizImageView.setOnClickListener(this);
        knowYourWorldFavoriteCountriesImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        switch (id) {
            case R.id.kyw_main_page_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.kyw_main_page_image);
                zoomedImageAlertDialog.show();

                break;

            case R.id.kyw_study_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.kyw_study_image);
                zoomedImageAlertDialog.show();

                break;

            case R.id.kyw_selected_country_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.kyw_selected_country_image);
                zoomedImageAlertDialog.show();
                break;


            case R.id.kyw_quiz_mainpage_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.kyw_quiz_main_page);
                zoomedImageAlertDialog.show();
                break;

            case R.id.kyw_quiz_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.kyw_quiz_image);
                zoomedImageAlertDialog.show();
                break;

            case R.id.kyw_favorite_countries_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.kyw_favorite_image);
                zoomedImageAlertDialog.show();
                break;
        }

    }
}
