package org.ohmstheresistance.aboutomar.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ohmstheresistance.aboutomar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class KnowYourWorldFragment extends Fragment {


    public KnowYourWorldFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_know_your_world, container, false);
    }

}
