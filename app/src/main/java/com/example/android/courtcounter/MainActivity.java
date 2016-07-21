package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * this method is called when the order button A is clicked
     */
    public void addThreeForTeamA(View v){
        scoreA = scoreA +3;
        displayForTeamA(scoreA);
    }

    public void addTwoForTeamA(View v){
        scoreA = scoreA +2;
        displayForTeamA(scoreA);
    }

    public void addOneForTeamA(View v){
        scoreA = scoreA +1;
        displayForTeamA(scoreA);
    }



    /**
     * this method is called when the order button B is clicked
     */
    public void addThreeForTeamB(View v){
        scoreB = scoreB +3;
        displayForTeamB(scoreB);
    }

    public void addTwoForTeamB(View v){
        scoreB = scoreB +2;
        displayForTeamB(scoreB);
    }

    public void addOneForTeamB(View v) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void reset(View v){
        scoreB = 0;
        scoreA = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
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
