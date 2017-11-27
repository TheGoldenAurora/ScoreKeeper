package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.scorekeeper.R.id.scoreTeamA;
import static com.example.android.scorekeeper.R.id.scoreTeamB;
import static com.example.android.scorekeeper.R.string.score;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;
    int plusA=0;
    int plusB=0;
    int foulsA=0;
    int foulsB=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Increase the score for Team A by 3 points.

    public void teamA_Victory(View v) {
        scoreA = scoreA + 3;
        plusA+=3;
        displayForTeamA(scoreA);
        scoresForTeamA(plusA);
    }

    //Increase the score for Team A by 1 point.

    public void teamA_Draw(View v) {
        scoreA = scoreA + 1;
        plusA+=1;
        displayForTeamA(scoreA);
        scoresForTeamA(plusA);
    }
    //Decrease the score for Team A by 1 point.

    public void teamA_Foul(View v) {
        scoreA = scoreA - 1;
        displayForTeamA(scoreA);
        foulsA-=1;
        foulsForTeamA(foulsA);
    }

    //Increase the score for Team B by 3 points.

    public void teamB_Victory(View v) {
        scoreB = scoreB + 3;
        plusB+=3;
        displayForTeamB(scoreB);
        scoresForTeamB(plusB);
    }

    //Increase the score for Team B by 1 point.

    public void teamB_Draw(View v) {
        scoreB = scoreB + 1;
        plusB+=1;
        displayForTeamB(scoreB);
        scoresForTeamB(plusB);
    }
    //Decrease the score for Team B by 1 point.

    public void teamB_Foul(View v) {
        scoreB = scoreB - 1;
        displayForTeamB(scoreB);
        foulsB-=1;
        foulsForTeamB(foulsB);
    }

    //To reset the scores of both teams:

    public void resetScore(View v) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    //To display the score of Team A:

    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.currentScoreTeamA);
        scoreView.setText(String.valueOf(scoreA));
    }

    //To display the increasing score of Team A:

    public void scoresForTeamA(int plus) {
        TextView scoreView = (TextView) findViewById(scoreTeamA);
        scoreView.setText(String.valueOf(plus));
    }

    //To display the fouls of Team A:

    public void foulsForTeamA(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.foulsTeamA);
        scoreView.setText(String.valueOf(fouls));
    }

    //To display the score of Team A:

    public void displayForTeamB(int score) {
        int scoreTeamB=plusB+foulsB;
        TextView scoreView = (TextView) findViewById(R.id.currentScoreTeamB);
        scoreView.setText(String.valueOf(score));
    }

    //To display the increasing score of Team A:

    public void scoresForTeamB(int plus) {
        TextView scoreView = (TextView) findViewById(scoreTeamB);
        scoreView.setText(String.valueOf(plus));
    }

    //To display the fouls of Team A:

    public void foulsForTeamB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.foulsTeamB);
        scoreView.setText(String.valueOf(fouls));
    }

    //To display the winners of the match:

    public void displayWinner(View v)
    {
        if(scoreA>scoreB)
            Toast.makeText(getApplicationContext(),"And the winner is.....Team A!!!",3).show();
        else if(scoreB>scoreA)
            Toast.makeText(getApplicationContext(),"And the winner is.....Team B!!!",3).show();
        else if(scoreB==scoreA)
            Toast.makeText(getApplicationContext(),"It's a tie!",Toast.LENGTH_LONG).show();
    }



}
