package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // declare global variables
    int teamA = 0;
    int teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTeamA(teamA);
        displayTeamB(teamB);
    }

    /**
     * This method is called when the reset button is clicked.
     */
    public void reset(View view) {
        teamA = 0;
        teamB = 0;
        displayTeamA(teamA);
        displayTeamB(teamB);
    }

    /**
     * This method displays team A score
     */
    private void displayTeamA(int number) {
        TextView teamAScore = (TextView) findViewById(R.id.teamAScore);
        teamAScore.setText("" + number);
    }

    /**
     * This method displays team B score
     */
    private void displayTeamB(int number) {
        TextView teamBScore = (TextView) findViewById(R.id.teamBScore);
        teamBScore.setText("" + number);
    }

    /**
     * This method is called when the Team A +3 Points button is clicked.
     */
    public void submit3PointsTeamA(View view) {
        teamA += 3;
        displayTeamA(teamA);
    }

    /**
     * This method is called when the Team A +2 Points button is clicked.
     */
    public void submit2PointsTeamA(View view) {
        teamA += 2;
        displayTeamA(teamA);
    }

    /**
     * This method is called when the Team A Free Throw button is clicked.
     */
    public void submit1PointTeamA(View view) {
        teamA += 1;
        displayTeamA(teamA);
    }

    /**
     * This method is called when the Team A +3 Points button is clicked.
     */
    public void submit3PointsTeamB(View view) {
        teamB += 3;
        displayTeamB(teamB);
    }

    /**
     * This method is called when the Team A +2 Points button is clicked.
     */
    public void submit2PointsTeamB(View view) {
        teamB += 2;
        displayTeamB(teamB);
    }

    /**
     * This method is called when the Team A Free Throw button is clicked.
     */
    public void submit1PointTeamB(View view) {
        teamB += 1;
        displayTeamB(teamB);
    }

}
