package com.example.myscrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    TextView dayView;
    Button btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        dayView = (TextView)findViewById(R.id.text_day);
        btn_return = (Button)findViewById(R.id.button_return);

        Intent receiveIntent = getIntent();
        int receive_code = receiveIntent.getIntExtra("sendCode", 0);
        String number = Integer.toString(receive_code);

        //int nextWords = Integer.parseInt(view_num);

        dayView.setText(number);

        btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), MainActivity.class);
                String view_num = dayView.getText().toString();

                switch (receive_code) {
                    case 1001:
                        returnIntent.putExtra("returnCode", 1002);
                        returnIntent.putExtra("words", view_num);
                        setResult(RESULT_OK, returnIntent);
                        break;
                        // 학습이 완료되지 않은 경우를 위해 if문으로 RESULT_CANCELED 작성

                    case 2001:
                        returnIntent.putExtra("returnCode", 2002);
                        returnIntent.putExtra("words", view_num);
                        setResult(RESULT_OK, returnIntent);
                        break;

                    case 3001:
                        returnIntent.putExtra("returnCode", 3002);
                        returnIntent.putExtra("words", view_num);
                        setResult(RESULT_OK, returnIntent);
                        break;

                    case 4001:
                        returnIntent.putExtra("returnCode", 4002);
                        returnIntent.putExtra("words", view_num);
                        setResult(RESULT_OK, returnIntent);
                        break;
                }
                finish();
            }
        });
    }
}