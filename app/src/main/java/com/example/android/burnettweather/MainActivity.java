package com.example.android.burnettweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.android.burnettweather.R.id.now;

public class MainActivity extends AppCompatActivity {

    int now1 = 45;
    int todayHigh = 56;
    int todayLow = 40;
    int tomorrowHigh = 70;
    int tomorrowLow = 40;
    int thursdayHigh = 45;
    int thursdayLow = 42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayNow(now1);
        displayToday(todayHigh, todayLow);
        displayTomorrow(tomorrowHigh, tomorrowLow);
        displayThursday(thursdayHigh, thursdayLow);
    }



    private void displayNow(int a) {
        TextView nowTextView = (TextView) findViewById(now);
        nowTextView.setText("" + a + "*");
    }


    private void displayToday(int a, int b) {
        TextView todayTextView = (TextView) findViewById(R.id.today);
        todayTextView.setText("" + a + "*/" + b + "*");
    }

    private void displayTomorrow(int a, int b) {
        TextView tomorrowTextView = (TextView) findViewById(R.id.tomorrow);
        tomorrowTextView.setText("" + a + "*/" + b + "*");
    }

    private void displayThursday(int a, int b) {
        TextView thursdayTextView = (TextView) findViewById(R.id.thursday);
        thursdayTextView.setText("" + a + "*/" + b + "*");
    }
}
