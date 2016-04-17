package com.example.lydia.misterpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ImageView arms, shoes, hat, mustache, eyes, eyebrows, glasses, nose, mouth, ears;
    CheckBox armscb,  shoescb, hatcb, mustachecb, eyescb, eyebrowscb, glassescb, nosecb, mouthcb, earscb;

// Link images and checkboxes
    // TO DO
// Object Compare = [ImageView] [ CheckBox];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arms = (ImageView) findViewById(R.id.Arms);
        shoes = (ImageView) findViewById(R.id.Shoes);
        hat = (ImageView) findViewById(R.id.Hat);
        mustache = (ImageView) findViewById(R.id.Mustache);
        eyes = (ImageView) findViewById(R.id.Eyes);
        eyebrows = (ImageView) findViewById(R.id.Eyebrows);
        glasses = (ImageView) findViewById(R.id.Glasses);
        nose = (ImageView) findViewById(R.id.Nose);
        mouth = (ImageView) findViewById(R.id.Mouth);
        ears = (ImageView) findViewById(R.id.Ears);

        armscb = (CheckBox) findViewById(R.id.checkarms);
        shoescb = (CheckBox) findViewById(R.id.checkshoes);
        hatcb = (CheckBox) findViewById(R.id.checkhat);
        mustachecb = (CheckBox) findViewById(R.id.checkmustache);
        eyescb = (CheckBox) findViewById(R.id.checkeyes);
        eyebrowscb = (CheckBox) findViewById(R.id.checkeyebrows);
        glassescb = (CheckBox) findViewById(R.id.checkglasses);
        nosecb = (CheckBox) findViewById(R.id.checknose);
        mouthcb = (CheckBox) findViewById(R.id.checkmouth);
        earscb = (CheckBox) findViewById(R.id.checkears);
    }

//    private final Object mDisplayObject [][] = {
//            {arms, armscb},
//            {shoes, shoescb},
//            {hat, hatcb},
//            {mustache, mustachecb},
//            {eyes, eyescb},
//            {eyebrows, eyebrowscb},
//            {glasses, glassescb},
//            {mouth, mouthcb},
//            {ears, earscb},
//            {nose, nosecb}
//    };
//    private final Object[] mDisplayObjects = mDisplayObject;

    private final Map<Integer , ImageView> mMap = new HashMap<Integer , ImageView>() {{
        put(R.id.checkarms, arms);
        put(R.id.checkshoes, shoes);
        put(R.id.checkhat, hat);
        put(R.id.checkmustache, mustache);
        put(R.id.checkeyes, eyes);
        put(R.id.checkeyebrows, eyebrows);
        put(R.id.checkglasses, glasses);
        put(R.id.checknose, nose);
        put(R.id.checkmouth, mouth);
        put(R.id.checkears, ears);
    }};

    public void onCheckboxClicked(View view) {
        // Perform action on clicks, depending on whether it's now checked
        CheckBox checkBox = (CheckBox) view;
        int iID = checkBox.getId();
        ImageView iView = mMap.get(iID);

        if (checkBox.isChecked()) {
            // display linked image
            iView.setVisibility(View.VISIBLE);
        }
        else{
            // hide linked image
            iView.setVisibility(View.INVISIBLE);
        }
    }
}


