package com.example.myscrollview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout[] day_button = new LinearLayout[33];
    TextView[] words_count = new TextView[33];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDayButtons();
        initWordsCount();

        //day_button[0].setOnClickListener(this);

        for (int i=0; i<4; i++) {
            day_button[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        Intent sendIntent = new Intent(getApplicationContext(), StudyActivity.class);

        switch (v.getId()) {
            case R.id.button_d1:
                if (words_count[0].isClickable() == false) {
                    Toast toast = Toast.makeText(getApplicationContext(),"이미 학습한 회차입니다.", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    sendIntent.putExtra("sendCode", 1001);
                    startActivityForResult(sendIntent, 0);
                }
                break;

            case R.id.button_d2:
                if (words_count[0].isClickable() == false && words_count[1].isClickable()==false) {
                    Toast toast = Toast.makeText(getApplicationContext(),"이미 학습한 회차입니다.", Toast.LENGTH_SHORT);
                    toast.show();
                } else if (words_count[0].isClickable() == true) {
                    Toast toast = Toast.makeText(getApplicationContext(),"DAY1을 먼저 학습하세요.", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    sendIntent.putExtra("sendCode", 2001);
                    startActivityForResult(sendIntent, 0);
                }
                break;

            case R.id.button_d3:
                if (words_count[1].isClickable() == false && words_count[2].isClickable()==false) {
                    Toast toast = Toast.makeText(getApplicationContext(),"이미 학습한 회차입니다.", Toast.LENGTH_SHORT);
                    toast.show();
                } else if (words_count[1].isClickable() == true) {
                    Toast toast = Toast.makeText(getApplicationContext(),"DAY2을 먼저 학습하세요.", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    sendIntent.putExtra("sendCode", 3001);
                    startActivityForResult(sendIntent, 0);
                }
                break;

            case R.id.button_d4:
                if (words_count[2].isClickable() == false && words_count[3].isClickable()==false) {
                    Toast toast = Toast.makeText(getApplicationContext(),"이미 학습한 회차입니다.", Toast.LENGTH_SHORT);
                    toast.show();
                } else if (words_count[2].isClickable() == true) {
                    Toast toast = Toast.makeText(getApplicationContext(),"DAY3을 먼저 학습하세요.", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    sendIntent.putExtra("sendCode", 4001);
                    startActivityForResult(sendIntent, 0);
                }
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            int return_code = data.getIntExtra("returnCode", 0);
            int words_num = data.getIntExtra("words", 0);
            //String count = Integer.toString(words_num);
            String count = data.getStringExtra("words");


            switch (return_code) {
                case 1002:
                    words_count[0].setClickable(false);
                    day_button[0].setBackgroundColor(Color.rgb(212, 212, 212));
                    words_count[1].setText(count);
                    break;

                case 2002:
                    words_count[1].setClickable(false);
                    day_button[1].setBackgroundColor(Color.rgb(212, 212, 212));
                    words_count[2].setText(count);
                    break;

                case 3002:
                    words_count[2].setClickable(false);
                    day_button[2].setBackgroundColor(Color.rgb(212, 212, 212));
                    words_count[3].setText(count);
                    break;

                case 4002:
                    words_count[3].setClickable(false);
                    day_button[3].setBackgroundColor(Color.rgb(212, 212, 212));
                    words_count[4].setText(count);
                    break;
            }
        }
    }

    // 데이버튼을 초기화
    public void initDayButtons () {
        day_button[0] = (LinearLayout) findViewById(R.id.button_d1);
        day_button[1] = (LinearLayout) findViewById(R.id.button_d2);
        day_button[2] = (LinearLayout) findViewById(R.id.button_d3);
        day_button[3] = (LinearLayout) findViewById(R.id.button_d4);
        day_button[4] = (LinearLayout) findViewById(R.id.button_d5);
        day_button[5] = (LinearLayout) findViewById(R.id.button_d6);
        day_button[6] = (LinearLayout) findViewById(R.id.button_d7);
        day_button[7] = (LinearLayout) findViewById(R.id.button_d8);
        day_button[8] = (LinearLayout) findViewById(R.id.button_d9);
        day_button[9] = (LinearLayout) findViewById(R.id.button_d10);
        day_button[10] = (LinearLayout) findViewById(R.id.button_d11);
        day_button[11] = (LinearLayout) findViewById(R.id.button_d12);
        day_button[12] = (LinearLayout) findViewById(R.id.button_d13);
        day_button[13] = (LinearLayout) findViewById(R.id.button_d14);
        day_button[14] = (LinearLayout) findViewById(R.id.button_d15);
        day_button[15] = (LinearLayout) findViewById(R.id.button_d16);
        day_button[16] = (LinearLayout) findViewById(R.id.button_d17);
        day_button[17] = (LinearLayout) findViewById(R.id.button_d18);
        day_button[18] = (LinearLayout) findViewById(R.id.button_d19);
        day_button[19] = (LinearLayout) findViewById(R.id.button_d20);
        day_button[20] = (LinearLayout) findViewById(R.id.button_d21);
        day_button[21] = (LinearLayout) findViewById(R.id.button_d22);
        day_button[22] = (LinearLayout) findViewById(R.id.button_d23);
        day_button[23] = (LinearLayout) findViewById(R.id.button_d24);
        day_button[24] = (LinearLayout) findViewById(R.id.button_d25);
        day_button[25] = (LinearLayout) findViewById(R.id.button_d26);
        day_button[26] = (LinearLayout) findViewById(R.id.button_d27);
        day_button[27] = (LinearLayout) findViewById(R.id.button_d28);
        day_button[28] = (LinearLayout) findViewById(R.id.button_d29);
        day_button[29] = (LinearLayout) findViewById(R.id.button_d30);
        day_button[30] = (LinearLayout) findViewById(R.id.button_d31);
        day_button[31] = (LinearLayout) findViewById(R.id.button_d32);
        day_button[32] = (LinearLayout) findViewById(R.id.button_d33);
    }

    // 워즈카운트 텍스트뷰를 초기화
    public void initWordsCount () {
        words_count[0] = (TextView)findViewById(R.id.count_d1);
        words_count[1] = (TextView)findViewById(R.id.count_d2);
        words_count[2] = (TextView)findViewById(R.id.count_d3);
        words_count[3] = (TextView)findViewById(R.id.count_d4);
        words_count[4] = (TextView)findViewById(R.id.count_d5);
        words_count[5] = (TextView)findViewById(R.id.count_d6);
        words_count[6] = (TextView)findViewById(R.id.count_d7);
        words_count[7] = (TextView)findViewById(R.id.count_d8);
        words_count[8] = (TextView)findViewById(R.id.count_d9);
        words_count[9] = (TextView)findViewById(R.id.count_d10);
        words_count[10] = (TextView)findViewById(R.id.count_d11);
        words_count[11] = (TextView)findViewById(R.id.count_d12);
        words_count[12] = (TextView)findViewById(R.id.count_d13);
        words_count[13] = (TextView)findViewById(R.id.count_d14);
        words_count[14] = (TextView)findViewById(R.id.count_d15);
        words_count[15] = (TextView)findViewById(R.id.count_d16);
        words_count[16] = (TextView)findViewById(R.id.count_d17);
        words_count[17] = (TextView)findViewById(R.id.count_d18);
        words_count[18] = (TextView)findViewById(R.id.count_d19);
        words_count[19] = (TextView)findViewById(R.id.count_d20);
        words_count[20] = (TextView)findViewById(R.id.count_d21);
        words_count[21] = (TextView)findViewById(R.id.count_d22);
        words_count[22] = (TextView)findViewById(R.id.count_d23);
        words_count[23] = (TextView)findViewById(R.id.count_d24);
        words_count[24] = (TextView)findViewById(R.id.count_d25);
        words_count[25] = (TextView)findViewById(R.id.count_d26);
        words_count[26] = (TextView)findViewById(R.id.count_d27);
        words_count[27] = (TextView)findViewById(R.id.count_d28);
        words_count[28] = (TextView)findViewById(R.id.count_d29);
        words_count[29] = (TextView)findViewById(R.id.count_d30);
        words_count[30] = (TextView)findViewById(R.id.count_d31);
        words_count[31] = (TextView)findViewById(R.id.count_d32);
        words_count[32] = (TextView)findViewById(R.id.count_d33);
    }
}