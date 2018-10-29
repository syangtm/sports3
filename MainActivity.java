package com.example.ssyang.sports;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointA =0;
    int pointB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method displays the given quantity value on the screen.
     */

    public void incrementA1(View view){
        TextView quantityTextView = (TextView) findViewById(R.id.ascore);
        quantityTextView.setText(pointA+1+"");
        pointA+=1;
    }

    public void incrementA2(View view){
        TextView quantityTextView = (TextView) findViewById(R.id.ascore);
        quantityTextView.setText(pointA+2+"");
        pointA+=2;
    }

    public void incrementB1(View view){
        TextView quantityTextView = (TextView) findViewById(R.id.bscore);
        quantityTextView.setText(pointB+1+"");
        pointB+=1;
    }

    public void incrementB2(View view){
        TextView quantityTextView = (TextView) findViewById(R.id.bscore);
        quantityTextView.setText(pointB+2+"");
        pointB+=2;
    }

    public void decrementA(View view){
        TextView quantityTextView = (TextView) findViewById(R.id.ascore);
        quantityTextView.setText(pointA-1+"");
        pointA-=1;
    }
    public void decrementB(View view){
        TextView quantityTextView = (TextView) findViewById(R.id.bscore);
        quantityTextView.setText(pointB-1+"");
        pointB-=1;
    }

    public void reset(View view){
        TextView aView = (TextView) findViewById(R.id.ascore);
        aView.setText("0");
        TextView bView = (TextView) findViewById(R.id.bscore);
        bView.setText("0");
        pointA = 0;
        pointB = 0;

    }
}
