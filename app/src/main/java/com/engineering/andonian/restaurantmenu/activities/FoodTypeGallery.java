package com.engineering.andonian.restaurantmenu.activities;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.engineering.andonian.restaurantmenu.R;
import com.engineering.andonian.restaurantmenu.fragments.AlcoholDisclaimerFragment;

public class FoodTypeGallery extends AppCompatActivity {

    private ImageButton proteinButton;
    private ImageButton saladButton;
    private ImageButton plantsButton;
    private ImageButton drinksButton;
    private ImageButton fusionButton;
    private ImageButton culturalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_type_gallery);

        FragmentManager fm = getFragmentManager();
        AlcoholDisclaimerFragment alcoholDisclaimerFragment = new AlcoholDisclaimerFragment();
        alcoholDisclaimerFragment.show(fm, "Alcohol Disclaimer");

        setButtons();

    }

    private void setButtons() {
        setProteinImageButton();
        setSaladImageButton();
        setPlantsImageButton();
        setFusionImageButton();
        setCulturalImageButton();
        setDrinksImageButton();
    }

    private void setProteinImageButton() {
        proteinButton  = (ImageButton) findViewById(R.id.proteinButton);
        proteinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });
    }

    private void setSaladImageButton() {
        saladButton  = (ImageButton) findViewById(R.id.saladButton);
        saladButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });
    }

    private void setPlantsImageButton() {
        plantsButton  = (ImageButton) findViewById(R.id.plantsButton);
        plantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });
    }

    private void setFusionImageButton() {
        fusionButton  = (ImageButton) findViewById(R.id.fusionButton);
        fusionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });
    }

    private void setCulturalImageButton() {
        culturalButton  = (ImageButton) findViewById(R.id.culturalButton);
        culturalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });
    }

    private void setDrinksImageButton() {
        drinksButton  = (ImageButton) findViewById(R.id.drinksButton);
        drinksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });
    }

}

