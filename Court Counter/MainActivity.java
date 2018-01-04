package com.sharonsyra.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsA = 0;
    int pointsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button twoPtsBt = findViewById(R.id.two_points_button_A);
        twoPtsBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsB = pointsB + 2;
                displayB(pointsB);
            }
        });
    }

    /*
    * Add 3 points*/
    public void threePointsA(View view) {
        pointsA = pointsA + 3;
        displayA(pointsA);
    }

    /*
    * Add 2 points*/
    public void twoPointsA(View view) {
        pointsA = pointsA + 2;
        displayA(pointsA);
    }

    /*
    * Add free throw*/
    public void freeThrowA(View view) {
        pointsA++;
        displayA(pointsA);
    }

    /*
    * Displays the score on the screen*/
    private void displayA(int number) {
        TextView scoreTextView = findViewById(
                R.id.score_A_text_view);
        scoreTextView.setText("" + pointsA);
    }

    /*
    * Add 3 points*/
    public void threePointsB(View view) {
        pointsB = pointsB + 3;
        displayB(pointsB);
    }

    /*
    * Add 2 points*/
    public void twoPointsB(View view) {
        pointsB = pointsB + 2;
        displayB(pointsB);
    }

    /*
    * Add free throw*/
    public void freeThrowB(View view) {
        pointsB++;
        displayB(pointsB);
    }

    /*
    * Displays the score on the screen*/
    private void displayB(int number) {
        TextView scoreTextView = (TextView) findViewById(
                R.id.score_B_text_view);
        scoreTextView.setText("" + pointsB);
    }

    public void reset(View view) {
        pointsA = 0;
        pointsB = 0;
        displayA(pointsA);
        displayB(pointsB);
    }
}
