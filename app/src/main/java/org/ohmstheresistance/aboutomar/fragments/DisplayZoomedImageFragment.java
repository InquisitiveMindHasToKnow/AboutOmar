package org.ohmstheresistance.aboutomar.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import org.ohmstheresistance.aboutomar.R;

public class DisplayZoomedImageFragment extends Fragment {

    private View rootView;
    private ImageView zoomedSelectedImageImageView;

    public DisplayZoomedImageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_display_zoomed_image, container, false);

        zoomedSelectedImageImageView = rootView.findViewById(R.id.zoomed_in_image_imageview);


        return rootView;
    }

}
