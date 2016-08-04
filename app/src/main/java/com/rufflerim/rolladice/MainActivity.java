package com.rufflerim.rolladice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dice6Intent = new Intent(MainActivity.this, DiceActivity.class);
                dice6Intent.putExtra("max", 6);
                startActivity(dice6Intent);
            }
        });

        Button button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dice20Intent = new Intent(MainActivity.this, DiceActivity.class);
                dice20Intent.putExtra("max", 20);
                startActivity(dice20Intent);
            }
        });
    }
}
