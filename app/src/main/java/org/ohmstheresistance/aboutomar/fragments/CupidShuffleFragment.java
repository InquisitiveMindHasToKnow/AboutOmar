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

import org.ohmstheresistance.aboutomar.R;

public class CupidShuffleFragment extends Fragment {


    private View rootView;
    private Button cupidShuffleLinkButton;

    public CupidShuffleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_cupid_shuffle, container, false);

        cupidShuffleLinkButton = rootView.findViewById(R.id.cupid_shuffle_link_button);


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
    }
}
