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

import org.ohmstheresistance.aboutomar.R;

public class EssentialFactsFragment extends Fragment implements View.OnClickListener {

    private View rootView;
    private Button essentialFactsLinkButton;

    private ImageView essentialFactsMainPageImageView;
    private ImageView essentialFactsAboutImageView;
    private ImageView essentialFactsRulesImageView;
    private ImageView essentialFactsStudyImageView;
    private ImageView essentialFactsStudyWithAudioImageView;
    private ImageView essentialFactsTriviaImageView;

    private AlertDialog.Builder zoomedImageAlertDialog;
    private View viewTemplateLayout;
    private ImageView zoomedSelectedImage;
    private ViewGroup parent;

    public EssentialFactsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_essential_facts, container, false);

        essentialFactsLinkButton = rootView.findViewById(R.id.ef_link_button);
        essentialFactsMainPageImageView = rootView.findViewById(R.id.ef_main_page_imageview);
        essentialFactsAboutImageView = rootView.findViewById(R.id.ef_about_imageview);
        essentialFactsRulesImageView = rootView.findViewById(R.id.ef_rules_imageview);
        essentialFactsStudyImageView = rootView.findViewById(R.id.ef_study_imageview);
        essentialFactsStudyWithAudioImageView = rootView.findViewById(R.id.ef_study_with_audio_imageview);
        essentialFactsTriviaImageView = rootView.findViewById(R.id.ef_trivia_imageview);

        zoomedImageAlertDialog = new AlertDialog.Builder(getActivity(), R.style.DialogCustom);
        viewTemplateLayout = inflater.inflate(R.layout.fragment_display_zoomed_image, container, false);
        zoomedSelectedImage = viewTemplateLayout.findViewById(R.id.zoomed_in_image_imageview);
        parent = (ViewGroup) viewTemplateLayout.getParent();

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        essentialFactsLinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String linkedInURL = "https://github.com/InquisitiveMindHasToKnow/EssentialFacts";

                Intent viewLinkIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(linkedInURL));
                startActivity(viewLinkIntent);
            }
        });


        essentialFactsMainPageImageView.setOnClickListener(this);
        essentialFactsAboutImageView.setOnClickListener(this);
        essentialFactsRulesImageView.setOnClickListener(this);
        essentialFactsStudyImageView.setOnClickListener(this);
        essentialFactsStudyWithAudioImageView.setOnClickListener(this);
        essentialFactsTriviaImageView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        switch (id) {
            case R.id.ef_main_page_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.essential_facts_main_page);
                zoomedImageAlertDialog.show();

                break;

            case R.id.ef_about_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.essential_facts_about);
                zoomedImageAlertDialog.show();

                break;

            case R.id.ef_rules_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.essential_facts_rules);
                zoomedImageAlertDialog.show();
                break;


            case R.id.ef_study_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.essential_facts_study);
                zoomedImageAlertDialog.show();
                break;

            case R.id.ef_study_with_audio_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.essential_facts_study_with_audio);
                zoomedImageAlertDialog.show();
                break;

            case R.id.ef_trivia_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.essential_facts_trivia);
                zoomedImageAlertDialog.show();
                break;
        }

    }
}
