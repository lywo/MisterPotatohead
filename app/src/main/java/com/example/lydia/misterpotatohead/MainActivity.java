package com.example.lydia.misterpotatohead;

import android.support.v4.util.ArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

//TODO rewrite CheckBox and ImageView using arrays and iterate in functions

public class MainActivity extends AppCompatActivity {

    CheckBox cbarms, cbshoes, cbhat, cbmustache, cbeyes, cbeyebrows, cbglasses, cbnose, cbmouth, cbears;
    ImageView arms, shoes, hat, mustache, eyes, eyebrows, glasses, nose, mouth, ears;
    HashMap<Integer , ImageView> mMap = new HashMap<Integer , ImageView>();

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

        cbarms = (CheckBox) findViewById(R.id.checkarms);
        cbshoes = (CheckBox) findViewById(R.id.checkshoes);
        cbhat = (CheckBox) findViewById(R.id.checkhat);
        cbmustache = (CheckBox) findViewById(R.id.checkmustache);
        cbeyes = (CheckBox) findViewById(R.id.checkeyes);
        cbeyebrows = (CheckBox) findViewById(R.id.checkeyebrows);
        cbglasses = (CheckBox) findViewById(R.id.checkglasses);
        cbnose = (CheckBox) findViewById(R.id.checknose);
        cbmouth = (CheckBox) findViewById(R.id.checkmouth);
        cbears = (CheckBox) findViewById(R.id.checkears);

        arms.setVisibility(View.INVISIBLE);
        shoes.setVisibility(View.INVISIBLE);
        hat.setVisibility(View.INVISIBLE);
        mustache.setVisibility(View.INVISIBLE);
        eyes.setVisibility(View.INVISIBLE);
        eyebrows.setVisibility(View.INVISIBLE);
        glasses.setVisibility(View.INVISIBLE);
        nose.setVisibility(View.INVISIBLE);
        mouth.setVisibility(View.INVISIBLE);
        ears.setVisibility(View.INVISIBLE);

        mMap.put(R.id.checkarms, arms);
        mMap.put(R.id.checkshoes, shoes);
        mMap.put(R.id.checkhat, hat);
        mMap.put(R.id.checkmustache, mustache);
        mMap.put(R.id.checkeyes, eyes);
        mMap.put(R.id.checkeyebrows, eyebrows);
        mMap.put(R.id.checkglasses, glasses);
        mMap.put(R.id.checknose, nose);
        mMap.put(R.id.checkmouth, mouth);
        mMap.put(R.id.checkears, ears);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("arms", arms.getVisibility());
        outState.putInt("shoes", shoes.getVisibility());
        outState.putInt("hat", hat.getVisibility());
        outState.putInt("eyes", eyes.getVisibility());
        outState.putInt("eyebrows", eyebrows.getVisibility());
        outState.putInt("glasses", glasses.getVisibility());
        outState.putInt("ears", ears.getVisibility());
        outState.putInt("mouth", mouth.getVisibility());
        outState.putInt("nose", nose.getVisibility());
        outState.putInt("mustache", mustache.getVisibility());

        outState.putBoolean("cbarms", cbarms.isChecked());
        outState.putBoolean("cbshoes", cbshoes.isChecked());
        outState.putBoolean("cbhat", cbhat.isChecked());
        outState.putBoolean("cbeyes", cbeyes.isChecked());
        outState.putBoolean("cbeyebrows", cbeyebrows.isChecked());
        outState.putBoolean("cbglasses", cbglasses.isChecked());
        outState.putBoolean("cbears", cbears.isChecked());
        outState.putBoolean("cbmouth", cbmouth.isChecked());
        outState.putBoolean("cbnose", cbnose.isChecked());
        outState.putBoolean("cbmustache", cbmustache.isChecked());
    }

    private void restoreVisibility( View view, int i ){
        if (i == View.VISIBLE) {
            view.setVisibility(View.VISIBLE);
        }
        else if (i == View.INVISIBLE){
            view.setVisibility(View.INVISIBLE);
        }
        else if (i == View.GONE){
            view.setVisibility(View.GONE);
        }
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        //you need to handle NullPionterException here.
        restoreVisibility(arms, savedInstanceState.getInt("arms"));
        restoreVisibility(shoes, savedInstanceState.getInt("shoes"));
        restoreVisibility(hat, savedInstanceState.getInt("hat"));
        restoreVisibility(eyes, savedInstanceState.getInt("eyes"));
        restoreVisibility(eyebrows, savedInstanceState.getInt("eyebrows"));
        restoreVisibility(mustache, savedInstanceState.getInt("mustache"));
        restoreVisibility(ears, savedInstanceState.getInt("ears"));
        restoreVisibility(mouth, savedInstanceState.getInt("mouth"));
        restoreVisibility(nose, savedInstanceState.getInt("nose"));
        restoreVisibility(glasses, savedInstanceState.getInt("glasses"));

        cbarms.setChecked(savedInstanceState.getBoolean("cbarms"));
        cbshoes.setChecked(savedInstanceState.getBoolean("cbshoes"));
        cbhat.setChecked(savedInstanceState.getBoolean("cbhat"));
        cbeyes.setChecked(savedInstanceState.getBoolean("cbeyes"));
        cbeyebrows.setChecked(savedInstanceState.getBoolean("cbeyebrows"));
        cbmustache.setChecked(savedInstanceState.getBoolean("cbmustache"));
        cbears.setChecked(savedInstanceState.getBoolean("cbears"));
        cbmouth.setChecked(savedInstanceState.getBoolean("cbmouth"));
        cbnose.setChecked(savedInstanceState.getBoolean("cbnose"));
        cbglasses.setChecked(savedInstanceState.getBoolean("cbglasses"));
    }

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


