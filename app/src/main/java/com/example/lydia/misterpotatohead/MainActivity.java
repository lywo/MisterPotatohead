package com.example.lydia.misterpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView arms, shoes, hat, mustache, eyes, eyebrows, glasses, nose, mouth, ears;
    CheckBox armscb,  shoescb, hatcb, mustachecb, eyescb, eyebrowscb, glassescb, nosecb, mouthcb, earscb;

// Link images and checkboxes
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

    public void onCheckboxClicked(View view) {
                // Perform action on clicks, depending on whether it's now checked

                // get tag and select one checkbox by id
                // TO DO


                if (((CheckBox) view).isChecked()) {
                    // display linked image
                    ImageView.setVisibility(View.VISIBLE);
                } else if (!((CheckBox) view) .isChecked()){
                    // do not display linked image
                    ImageView.setVisibility(View.INVISIBLE);
                }

                else {
                    return;
            }
        }

//        CheckBox.setVisibiliy(View.INVISIBLE);
////
//        String id = CheckBox.getTag();

//        for (ImageView.id == id )
//        {
//            if ((CheckBox).getStatus().isChecked)
//            {
//                ImageView.setVisibility(View.VISIBLE);
//            }
//
//            else if (!(CheckBox) .getStatus() .isChecked)
//            {
//                ImageView.setVisibility(View.INVISIBLE);
//            }
//
//            else{
//                return;
//            }
//        }





//        if ((CheckBox).getStatus().isChecked){
//            ImageView.setVisibility((View.VISIBLE));
//        }
//        else if (!(CheckBox).getStatus().isChecked) {
//            ImageView.setVisibility(View.INVISIBLE);
//        }
//        else {
//            return;
//        }
    }


}


