package org.ohmstheresistance.aboutomar.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ohmstheresistance.aboutomar.R;

public class CupidShuffleFragment extends Fragment {


    private View rootView;

    public CupidShuffleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_cupid_shuffle, container, false);


        return rootView;
    }

}
