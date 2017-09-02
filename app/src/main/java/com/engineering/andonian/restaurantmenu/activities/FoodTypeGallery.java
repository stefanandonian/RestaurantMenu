package com.engineering.andonian.restaurantmenu.activities;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        setProteinButton();
        setSaladButton();
        setPlantsButton();
        setFusionButton();
        setCulturalButton();
        setDrinksButton();
    }

    private void setButton(ImageButton button, int buttonId) {
        button  = (ImageButton) findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void setProteinButton() {
        setButton(proteinButton,R.id.proteinButton);
    }

    private void setSaladButton() {
        setButton(saladButton,R.id.saladButton);
    }

    private void setPlantsButton() {
        setButton(plantsButton,R.id.plantsButton);
    }

    private void setFusionButton() {
        setButton(fusionButton,R.id.fusionButton);
    }

    private void setCulturalButton() {
        setButton(culturalButton,R.id.culturalButton);
    }

    private void setDrinksButton() {
        setButton(drinksButton,R.id.drinksButton);
    }

}

