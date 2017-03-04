package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int homeScore = 0;
    int awayScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Score buttons
    public void addScore(View view) {
        switch (view.getId()) {
            case (R.id.homeThree_textview):
                homeScore = homeScore + 3;
                break;
            case (R.id.homeTwo_textview):
                homeScore = homeScore + 2;
                break;
            case (R.id.homeOne_textview):
                homeScore = homeScore + 1;
                break;
            case (R.id.homeMinusOne_textview):
                if (homeScore > 0) {
                    homeScore = homeScore - 1;
                }
                break;
            case (R.id.awayThree_textview):
                awayScore = awayScore + 3;
                break;
            case (R.id.awayTwo_textview):
                awayScore = awayScore + 2;
                break;
            case (R.id.awayOne_textview):
                awayScore = awayScore + 1;
                break;
            case (R.id.awayMinusOne_textview):
                if (awayScore > 0) {
                    awayScore = awayScore - 1;
                }
                break;
            default:
                //reset
                homeScore = 0;
                awayScore = 0;
        }

        //Display score
        displayScore();
    }

    //Display score
    private void displayScore() {
        TextView homeTextView = (TextView) findViewById(R.id.home_textview);
        TextView awayTextView = (TextView) findViewById(R.id.away_textview);

        homeTextView.setText(String.valueOf(homeScore));
        awayTextView.setText(String.valueOf(awayScore));
    }
}
