package com.lclark.scheduleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button prevDayButton, saveButton, nextDayButton;
    private TextView textView;
    private EditText editText;
    private String[] days;
    private int currentDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prevDayButton = (Button) findViewById(R.id.activity_main_prev_day_button);
        saveButton = (Button) findViewById(R.id.activity_main_save_button);
        nextDayButton = (Button) findViewById(R.id.activity_main_next_day_button);
        textView = (TextView) findViewById(R.id.activity_main_textview);
        editText = (EditText) findViewById(R.id.activity_main_edit_text);

        currentDay = 0;
        days = getResources().getStringArray(R.array.days_of_week);


        prevDayButton.setOnClickListener(this);
        saveButton.setOnClickListener(this);
        nextDayButton.setOnClickListener(this);

        prevDayButton.setText(days[6]);
        nextDayButton.setText(days[1]);


    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.activity_main_prev_day_button){
            currentDay = (currentDay-1)%7;
            prevDayButton.setText(days[(currentDay-1)%7]);
            nex
        }
    }
}
