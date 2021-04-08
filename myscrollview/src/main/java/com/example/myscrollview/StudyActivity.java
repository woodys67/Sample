package com.example.myscrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class StudyActivity extends AppCompatActivity {

    TextView backButton;
    TextView studyDay;
    TextView cardsCounting;
    TextView okButton;
    TextView xButton;
    TextView checkingText;
    TextView guidingText;
    TextView nextButton;
    LinearLayout frontFlip;
    LinearLayout backFlip;
    TextView frontFlipText;
    TextView backFlipText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);
    }
}