package com.groovin101.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    private static final String TAG = FunFactsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.activity_fun_facts);

        //hold our various views
        //Note the reference to the R class. This is a generated class, but the ids are sourced from the ids we used in the activity_fun_facts.xml file
        final TextView factTextContainer = (TextView) findViewById(R.id.factText);
        final Button showFactButton = (Button) findViewById(R.id.button_showFact);

        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factTextContainer.setText(factBook.getAFact());
                int color = colorWheel.getAColor();
                layout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        });

//        Toast myDebugMessage = Toast.makeText(this, "We have created the FunFactActivity!", Toast.LENGTH_LONG);
//        myDebugMessage.show();
        Log.d(TAG, "we are in the onCreate method yo");
    }
}
