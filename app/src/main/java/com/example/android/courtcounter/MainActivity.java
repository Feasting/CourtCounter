package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreCountA = 0;
    int scoreCountB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plus3(View view) {
        scoreCountA += 3;
        displayForTeamA(scoreCountA);
    }

    public void plus2(View view) {
        scoreCountA += 2;
        displayForTeamA(scoreCountA);
    }

    public void plus1(View view) {
        scoreCountA += 1;
        displayForTeamA(scoreCountA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plus3b(View view) {
        scoreCountB += 3;
        displayForTeamB(scoreCountB);
    }

    public void plus2b(View view) {
        scoreCountB += 2;
        displayForTeamB(scoreCountB);
    }

    public void plus1b(View view) {
        scoreCountB += 1;
        displayForTeamB(scoreCountB);
    }

    public void resetScores(View view){
        scoreCountA = 0;
        scoreCountB = 0;

        displayForTeamA(0);

        displayForTeamB(0);
    }

}
