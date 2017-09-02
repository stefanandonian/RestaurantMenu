package com.engineering.andonian.restaurantmenu.fragments;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.engineering.andonian.restaurantmenu.R;

public class AlcoholDisclaimerFragment extends DialogFragment {

    Button closeAlcoholDisclaimerButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_alcohol_disclaimer, container, false);
        getDialog().setTitle("Alcohol Disclaimer");
        setCloseAlcoholDisclaimerButton(container);
        return rootView;
    }

    private void setCloseAlcoholDisclaimerButton(ViewGroup container) {
        closeAlcoholDisclaimerButton = (Button) container.findViewById(R.id.alcohol_disclaimer_certify_button);
        closeAlcoholDisclaimerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TO DO
            }
        });
    }
}
