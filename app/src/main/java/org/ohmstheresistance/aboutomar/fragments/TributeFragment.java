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

public class TributeFragment extends Fragment {

    private View rootView;
    private TextView tributeDescriptionTextView;
    private Button tributeLinkButton;
    private PhotoView tributeSignInPageImageView;
    private PhotoView tributeRegistrationPageImageView;
    private PhotoView tributeMainPageImageView;
    private PhotoView tributeStockNamesImageView;
    private PhotoView tributeSelectedNameImageView;
    private PhotoView tributeAddPersonImageView;

    public TributeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_tribute, container, false);

        tributeDescriptionTextView = rootView.findViewById(R.id.tribute_description_textview);
        tributeLinkButton = rootView.findViewById(R.id.tribute_link_button);
        tributeSignInPageImageView = rootView.findViewById(R.id.tribute_signin_imageview);
        tributeRegistrationPageImageView = rootView.findViewById(R.id.tribute_registration_imageview);
        tributeMainPageImageView = rootView.findViewById(R.id.tribute_main_page_imageview);
        tributeStockNamesImageView = rootView.findViewById(R.id.tribute_stock_names_imageview);
        tributeSelectedNameImageView = rootView.findViewById(R.id.tribute_selected_person_imageview);
        tributeAddPersonImageView = rootView.findViewById(R.id.tribute_added_person_imageview);

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
    }
}
