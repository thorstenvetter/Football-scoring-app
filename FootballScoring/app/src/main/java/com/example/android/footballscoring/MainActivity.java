package com.example.android.footballscoring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    public void displayScoreTeamA(String scoreTeamA){
        TextView scoreView = findViewById(R.id.text_view_score_team_a);
        scoreView.setText(scoreTeamA);
    }

    public void addSixPointsTeamA(View view){
        scoreTeamA = scoreTeamA + 6;
        displayScoreTeamA(String.valueOf(scoreTeamA));
    }

    public void addExtraPointTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA(String.valueOf(scoreTeamA));
    }

    public void addTwoPointsTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayScoreTeamA(String.valueOf(scoreTeamA));
    }

    public void addThreePointsTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayScoreTeamA(String.valueOf(scoreTeamA));
    }
    public void displayScoreTeamB(String scoreTeamB){
        TextView scoreView = findViewById(R.id.text_view_score_team_b);
        scoreView.setText(scoreTeamB);
    }

    public void addSixPointsTeamB(View view){
        scoreTeamB = scoreTeamB + 6;
        displayScoreTeamB(String.valueOf(scoreTeamB));
    }

    public void addExtraPointTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB(String.valueOf(scoreTeamB));
    }

    public void addTwoPointsTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayScoreTeamB(String.valueOf(scoreTeamB));
    }

    public void addThreePointsTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayScoreTeamB(String.valueOf(scoreTeamB));
    }

    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(String.valueOf(scoreTeamA));
        displayScoreTeamB(String.valueOf(scoreTeamB));
    }

}