package fr.exfolyart.myfuckinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Exfolyart extends AppCompatActivity {

    private TextView points;
    private ImageView exfolyart;
    private int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookie);

        this.points = (TextView) findViewById(R.id.points);
        this.exfolyart = (ImageView) findViewById(R.id.exfolyart);

        exfolyart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks++;
                points.setText("Points : " + clicks);
            }
        });
    }
}