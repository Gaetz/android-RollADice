package com.rufflerim.rolladice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

/**
 * Created by User on 04/08/2016.
 */
public class DiceActivity extends Activity implements View.OnClickListener {

    private TextView textResult;
    private int max;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        max = getIntent().getIntExtra("max", 0);

        TextView title = (TextView) findViewById(R.id.title_view);
        title.setText(String.valueOf(max)+"-sided Roll");

        textResult =  (TextView) findViewById(R.id.result_view);
        textResult.setText("");

        Button buttonRoll = (Button) findViewById(R.id.button_roll);
        buttonRoll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        SecureRandom random = new SecureRandom();
        textResult.setText(String.valueOf(random.nextInt(max) + 1));
    }
}
