package org.ohmstheresistance.aboutomar.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ohmstheresistance.aboutomar.R;

public class DisplayZoomedImageFragment extends Fragment {

    private View rootView;

    public DisplayZoomedImageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_display_zoomed_image, container, false);



        return rootView;
    }


    @Override
    public void onDetach() {
        super.onDetach();

    }
}
