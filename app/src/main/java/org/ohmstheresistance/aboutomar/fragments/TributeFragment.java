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

public class TributeFragment extends Fragment implements View.OnClickListener {

    private View rootView;
    private TextView tributeDescriptionTextView;
    private Button tributeLinkButton;
    private ImageView tributeSignInPageImageView;
    private ImageView tributeRegistrationPageImageView;
    private ImageView tributeMainPageImageView;
    private ImageView tributeStockNamesImageView;
    private ImageView tributeSelectedNameImageView;
    private ImageView tributeAddPersonImageView;

    private AlertDialog.Builder zoomedImageAlertDialog;
    private View viewTemplateLayout;
    private ImageView zoomedSelectedImage;
    private ViewGroup parent;


    public TributeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_tribute, container, false);

        tributeDescriptionTextView = rootView.findViewById(R.id.tribute_description_textview);
        tributeLinkButton = rootView.findViewById(R.id.tribute_link_button);
        tributeSignInPageImageView = rootView.findViewById(R.id.tribute_signin_imageview);
        tributeRegistrationPageImageView = rootView.findViewById(R.id.tribute_registration_imageview);
        tributeMainPageImageView = rootView.findViewById(R.id.tribute_main_page_imageview);
        tributeStockNamesImageView = rootView.findViewById(R.id.tribute_stock_names_imageview);
        tributeSelectedNameImageView = rootView.findViewById(R.id.tribute_selected_person_imageview);
        tributeAddPersonImageView = rootView.findViewById(R.id.tribute_added_person_imageview);

        zoomedImageAlertDialog = new AlertDialog.Builder(getActivity(), R.style.DialogCustom);
        viewTemplateLayout = inflater.inflate(R.layout.fragment_display_zoomed_image, container, false);
        zoomedSelectedImage = viewTemplateLayout.findViewById(R.id.zoomed_in_image_imageview);
        parent = (ViewGroup) viewTemplateLayout.getParent();

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        tributeLinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String linkedInURL = "https://github.com/InquisitiveMindHasToKnow/Tribute";

                Intent viewLinkIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(linkedInURL));
                startActivity(viewLinkIntent);
            }
        });

        tributeSignInPageImageView.setOnClickListener(this);
        tributeRegistrationPageImageView.setOnClickListener(this);
        tributeMainPageImageView.setOnClickListener(this);
        tributeStockNamesImageView.setOnClickListener(this);
        tributeSelectedNameImageView.setOnClickListener(this);
        tributeAddPersonImageView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        switch (id) {
            case R.id.tribute_signin_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.tribute_signin_page);
                zoomedImageAlertDialog.show();

                break;

            case R.id.tribute_registration_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.tribute_registration_page);
                zoomedImageAlertDialog.show();

                break;

            case R.id.tribute_main_page_imageview:

                    parent = (ViewGroup) viewTemplateLayout.getParent();
                    if (parent != null) {
                        parent.removeView(viewTemplateLayout);
                    }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.tribute_main_page);
                zoomedImageAlertDialog.show();
                break;


            case R.id.tribute_stock_names_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.tribute_stock_names);
                zoomedImageAlertDialog.show();
                break;

            case R.id.tribute_selected_person_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.tribute_random_peerson_picked);
                zoomedImageAlertDialog.show();
                break;

            case R.id.tribute_added_person_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.tribute_added_name);
                zoomedImageAlertDialog.show();
                break;
        }

    }
}
