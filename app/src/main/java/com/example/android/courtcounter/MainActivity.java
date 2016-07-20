package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int score2 = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * this method is called when the order button A is clicked
     */
    public void scoreUp1(View view){
        score = score +3;
        displayForTeamA(score);
    }

    public void scoreUp2(View view){
        score = score +2;
        displayForTeamA(score);
    }

    public void scoreUp3(View view){
        score = score +1;
        displayForTeamA(score);
    }



    /**
     * this method is called when the order button B is clicked
     */
    public void scoreUp4(View view){
        score2 = score2 +3;
        displayForTeamB(score2);
    }

    public void scoreUp5(View view){
        score2 = score2 +2;
        displayForTeamB(score2);
    }

    public void scoreUp6(View view) {
        score2 = score2 + 1;
        displayForTeamB(score2);
    }

    public void reset(View view){
        score2 = 0;
        score = 0;
        displayForTeamA(score);
        displayForTeamB(score2);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}


