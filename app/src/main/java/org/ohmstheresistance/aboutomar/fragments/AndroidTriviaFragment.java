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

public class AndroidTriviaFragment extends Fragment implements View.OnClickListener {

    private View rootView;
    private Button androidTriviaLinkButton;

    private ImageView androidTriviaMainPageImageView;
    private ImageView androidTriviaAboutImageView;
    private ImageView androidTriviaRulesImageView;
    private ImageView androidTriviaQuizImageView;
    private ImageView androidTriviaWinnerImageView;
    private ImageView androidTriviaLoserImageView;

    private AlertDialog.Builder zoomedImageAlertDialog;
    private View viewTemplateLayout;
    private ImageView zoomedSelectedImage;
    private ViewGroup parent;

    public AndroidTriviaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_android_trivia, container, false);

        androidTriviaMainPageImageView = rootView.findViewById(R.id.android_trivia_main_page_imageview);
        androidTriviaAboutImageView = rootView.findViewById(R.id.android_trivia_about_imageview);
        androidTriviaRulesImageView = rootView.findViewById(R.id.android_trivia_rules_imageview);
        androidTriviaQuizImageView = rootView.findViewById(R.id.android_trivia_quiz_imageview);
        androidTriviaWinnerImageView = rootView.findViewById(R.id.android_trivia_winner_imageview);
        androidTriviaLoserImageView = rootView.findViewById(R.id.android_trivia_loser_imageview);
        androidTriviaLinkButton = rootView.findViewById(R.id.android_trivia_link_button);

        zoomedImageAlertDialog = new AlertDialog.Builder(getActivity(), R.style.DialogCustom);
        viewTemplateLayout = inflater.inflate(R.layout.fragment_display_zoomed_image, container, false);
        zoomedSelectedImage = viewTemplateLayout.findViewById(R.id.zoomed_in_image_imageview);
        parent = (ViewGroup) viewTemplateLayout.getParent();

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        androidTriviaMainPageImageView.setOnClickListener(this);
        androidTriviaAboutImageView.setOnClickListener(this);
        androidTriviaRulesImageView.setOnClickListener(this);
        androidTriviaQuizImageView.setOnClickListener(this);
        androidTriviaWinnerImageView.setOnClickListener(this);
        androidTriviaLoserImageView.setOnClickListener(this);
        androidTriviaLinkButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch (id) {

            case R.id.android_trivia_main_page_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.android_trivia_main_page);
                zoomedImageAlertDialog.show();

                break;

            case R.id.android_trivia_about_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.android_trivia_about);
                zoomedImageAlertDialog.show();

                break;

            case R.id.android_trivia_rules_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.android_trivia_rules);
                zoomedImageAlertDialog.show();

                break;

            case R.id.android_trivia_quiz_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.android_trivia_quiz);
                zoomedImageAlertDialog.show();

                break;

            case R.id.android_trivia_winner_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.android_trivia_winner);
                zoomedImageAlertDialog.show();

                break;

            case R.id.android_trivia_loser_imageview:

                parent = (ViewGroup) viewTemplateLayout.getParent();
                if (parent != null) {
                    parent.removeView(viewTemplateLayout);
                }
                zoomedImageAlertDialog.setView(viewTemplateLayout);
                zoomedSelectedImage.setImageResource(R.drawable.android_trivia_loser);
                zoomedImageAlertDialog.show();

                break;

            case R.id.android_trivia_link_button:

                String linkedInURL = "https://github.com/InquisitiveMindHasToKnow/AndroidTrivia";

                Intent viewLinkIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(linkedInURL));
                startActivity(viewLinkIntent);
                break;
        }
    }
}
