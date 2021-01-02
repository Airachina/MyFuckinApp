package fr.exfolyart.myfuckinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Exfolyart extends AppCompatActivity {
    private TextView points;
    private ImageView exfolyart;
    private int clicks = 0;
    private Button goto3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookie);

        goto3 = (Button) findViewById(R.id.goto3);
        this.points = (TextView) findViewById(R.id.points);
        this.exfolyart = (ImageView) findViewById(R.id.exfolyart);

        exfolyart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks++;
                points.setText("Points : " + clicks);
            }
        });

        goto3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {openActivity3();}});
    }
    public void openActivity3()
    {
        Intent goto3 = new Intent(this, MainActivity2.class);
        startActivity(goto3);
        finish();
    }
}