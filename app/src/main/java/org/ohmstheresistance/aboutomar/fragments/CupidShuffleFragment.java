package org.ohmstheresistance.aboutomar.fragments;


import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.ohmstheresistance.aboutomar.R;

public class CupidShuffleFragment extends Fragment implements View.OnClickListener {


    private View rootView;
    private Button cupidShuffleLinkButton;

    private ImageView cupidShuffleLoginImageView;
    private ImageView cupidShuffleMainUserImageView;
    private ImageView cupidShufflePotentialMatchImageView;
    private ImageView cupidShuffleListOfLocations;
    private ImageView cupidShuffleDateReservationImageView;
    private ImageView cupidShuffleDatePromptImageView;
    private ImageView cupidShuffleDirectMessagesImageView;
    private ImageView cupidShuffleConnectionRequestsImageView;
    private ImageView cupidShuffleDateReservationConfirmationImageView;

    private AlertDialog.Builder zoomedImageAlertDialog;
    private View viewTemplateLayout;
    private ImageView zoomedSelectedImage;
    private ViewGroup parent;

    public CupidShuffleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_cupid_shuffle, container, false);

        cupidShuffleLinkButton = rootView.findViewById(R.id.cupid_shuffle_link_button);

        cupidShuffleLoginImageView = rootView.findViewById(R.id.cs_login_imageview);
        cupidShuffleMainUserImageView = rootView.findViewById(R.id.cs_main_user_imageview);
        cupidShufflePotentialMatchImageView = rootView.findViewById(R.id.cs_potential_match_imageview);
        cupidShuffleListOfLocations = rootView.findViewById(R.id.cs_list_of_locations);
        cupidShuffleDateReservationImageView = rootView.findViewById(R.id.cs_date_reservation_imageview);
        cupidShuffleDatePromptImageView = rootView.findViewById(R.id.cs_date_prompt_imageview);
        cupidShuffleDirectMessagesImageView = rootView.findViewById(R.id.cs_direct_messages_imageview);
        cupidShuffleConnectionRequestsImageView = rootView.findViewById(R.id.cs_connection_requests_imageview);
        cupidShuffleDateReservationConfirmationImageView = rootView.findViewById(R.id.cs_date_reservation_confirmation_imageview);


        zoomedImageAlertDialog = new AlertDialog.Builder(getActivity(), R.style.DialogCustom);
        viewTemplateLayout = inflater.inflate(R.layout.fragment_display_zoomed_image, container, false);
        zoomedSelectedImage = viewTemplateLayout.findViewById(R.id.zoomed_in_image_imageview);
        parent = (ViewGroup) viewTemplateLayout.getParent();


        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        cupidShuffleLinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String linkedInURL = "https://github.com/InquisitiveMindHasToKnow/CupidShuffle";

                Intent viewLinkIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(linkedInURL));
                startActivity(viewLinkIntent);
            }
        });

        cupidShuffleLoginImageView.setOnClickListener(this);
        cupidShuffleMainUserImageView.setOnClickListener(this);
        cupidShufflePotentialMatchImageView.setOnClickListener(this);
        cupidShuffleListOfLocations.setOnClickListener(this);
        cupidShuffleDateReservationImageView.setOnClickListener(this);
        cupidShuffleDatePromptImageView.setOnClickListener(this);
        cupidShuffleDirectMessagesImageView.setOnClickListener(this);
        cupidShuffleConnectionRequestsImageView.setOnClickListener(this);
        cupidShuffleDateReservationConfirmationImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        int id = v.getId();

        switch (id) {
            case R.id.cs_login_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.cs_login_screen);
                zoomedImageAlertDialog.show();

                break;

            case R.id.cs_main_user_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.cs_main_user);
                zoomedImageAlertDialog.show();

                break;

            case R.id.cs_potential_match_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.cs_potential_match);
                zoomedImageAlertDialog.show();
                break;


            case R.id.cs_list_of_locations:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.cs_list_of_locations);
                zoomedImageAlertDialog.show();
                break;

            case R.id.cs_date_reservation_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.cs_date_reservation);
                zoomedImageAlertDialog.show();
                break;

            case R.id.cs_date_prompt_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.cs_date_prompt);
                zoomedImageAlertDialog.show();
                break;

            case R.id.cs_direct_messages_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.cs_direct_messages);
                zoomedImageAlertDialog.show();
                break;

            case R.id.cs_connection_requests_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.cs_connection_requests);
                zoomedImageAlertDialog.show();
                break;

            case R.id.cs_date_reservation_confirmation_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.cs_reservation_confirmation);
                zoomedImageAlertDialog.show();
                break;
        }

    }
}
