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


public class CeeLoFragment extends Fragment implements View.OnClickListener {

    private View rootView;
    private Button ceeLoLinkButton;

    private ImageView ceeLoInstructionsImageView;
    private ImageView ceeLoDiceRollerImageView;

    private AlertDialog.Builder zoomedImageAlertDialog;
    private View viewTemplateLayout;
    private ImageView zoomedSelectedImage;
    private ViewGroup parent;

    public CeeLoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_ceelo_fragment, container, false);

        ceeLoLinkButton = rootView.findViewById(R.id.ceelo_link_button);
        ceeLoInstructionsImageView = rootView.findViewById(R.id.ceelo_instructions_imageview);
        ceeLoDiceRollerImageView = rootView.findViewById(R.id.ceelo_roller_imageview);

        zoomedImageAlertDialog = new AlertDialog.Builder(getActivity(), R.style.DialogCustom);
        viewTemplateLayout = inflater.inflate(R.layout.fragment_display_zoomed_image, container, false);
        zoomedSelectedImage = viewTemplateLayout.findViewById(R.id.zoomed_in_image_imageview);
        parent = (ViewGroup) viewTemplateLayout.getParent();

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ceeLoLinkButton.setOnClickListener(this);
        ceeLoInstructionsImageView.setOnClickListener(this);
        ceeLoDiceRollerImageView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {


        int id = view.getId();

        switch (id) {
            case R.id.ceelo_instructions_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.ceelo_instructions);
                zoomedImageAlertDialog.show();

                break;

            case R.id.ceelo_roller_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.ceelo_dice_roller);
                zoomedImageAlertDialog.show();

                break;

            case R.id.ceelo_link_button:

                String linkedInURL = "https://github.com/InquisitiveMindHasToKnow/CeeLo";

                Intent viewLinkIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(linkedInURL));
                startActivity(viewLinkIntent);

                break;
        }
    }
}
