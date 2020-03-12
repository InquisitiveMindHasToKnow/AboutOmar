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

public class MastermindFragment extends Fragment implements View.OnClickListener {

    private View rootView;
    private Button mastermindLinkButton;

    private ImageView mastermindMainPageImageView;
    private ImageView mastermindInstructionsImageView;
    private ImageView mastermindGameImageView;
    private ImageView mastermindWinnerImageView;
    private ImageView mastermindLoserImageView;

    private AlertDialog.Builder zoomedImageAlertDialog;
    private View viewTemplateLayout;
    private ImageView zoomedSelectedImage;
    private ViewGroup parent;

    public MastermindFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_mastermind, container, false);

        mastermindLinkButton = rootView.findViewById(R.id.mastermind_link_button);
        mastermindMainPageImageView = rootView.findViewById(R.id.mastermind_main_page_imageview);
        mastermindInstructionsImageView = rootView.findViewById(R.id.mastermind_instructions_imageview);
        mastermindGameImageView = rootView.findViewById(R.id.mastermind_game_imageview);
        mastermindWinnerImageView = rootView.findViewById(R.id.mastermind_winner_imageview);
        mastermindLoserImageView = rootView.findViewById(R.id.mastermind_loser_imageview);

        zoomedImageAlertDialog = new AlertDialog.Builder(getActivity(), R.style.DialogCustom);
        viewTemplateLayout = inflater.inflate(R.layout.fragment_display_zoomed_image, container, false);
        zoomedSelectedImage = viewTemplateLayout.findViewById(R.id.zoomed_in_image_imageview);
        parent = (ViewGroup) viewTemplateLayout.getParent();

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mastermindLinkButton.setOnClickListener(this);
        mastermindMainPageImageView.setOnClickListener(this);
        mastermindInstructionsImageView.setOnClickListener(this);
        mastermindGameImageView.setOnClickListener(this);
        mastermindWinnerImageView.setOnClickListener(this);
        mastermindLoserImageView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch (id) {
            case R.id.mastermind_main_page_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.mastermind_main_page);
                zoomedImageAlertDialog.show();

                break;

            case R.id.mastermind_instructions_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.master_mind_instructions);
                zoomedImageAlertDialog.show();

                break;

            case R.id.mastermind_game_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.mastermind_game);
                zoomedImageAlertDialog.show();
                break;


            case R.id.mastermind_winner_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.mastermind_winner);
                zoomedImageAlertDialog.show();
                break;

            case R.id.mastermind_loser_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.mastermind_loser);
                zoomedImageAlertDialog.show();
                break;

            case R.id.mastermind_link_button:

                String linkedInURL = "https://github.com/InquisitiveMindHasToKnow/Mastermind";

                Intent viewLinkIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(linkedInURL));
                startActivity(viewLinkIntent);
                break;

        }
    }
}
