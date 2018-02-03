package com.mysite.maxim.mytestproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    boolean[] vis;

    Button[] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vis = new boolean[8];
        vis[0] = false;
        vis[1] = false;
        vis[2] = false;
        vis[3] = false;
        vis[4] = false;
        vis[5] = false;
        vis[6] = false;
        vis[7] = false;
        vis[8] = false;

        buttons = new Button[8];

        buttons[0] = (Button)findViewById(R.id.One);
        buttons[1] = (Button)findViewById(R.id.Two);
        buttons[2] = (Button)findViewById(R.id.Three);
        buttons[3] = (Button)findViewById(R.id.Four);
        buttons[4] = (Button)findViewById(R.id.Five);
        buttons[5] = (Button)findViewById(R.id.Six);
        buttons[6] = (Button)findViewById(R.id.Seven);
        buttons[7] = (Button)findViewById(R.id.Eight);
        buttons[8] = (Button)findViewById(R.id.Nine);

        addOnClickListener();
    }

    public void addOnClickListener (){
        buttons[1].setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttons[2].setVisibility(View.VISIBLE);
                        buttons[1].setVisibility(View.INVISIBLE);
                        buttons[2].setText("2");
                        vis[1] = true;
                    }
                }
        );
        buttons[2].setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttons[3].setVisibility(View.VISIBLE);
                        buttons[2].setVisibility(View.INVISIBLE);
                        buttons[3].setText("2");
                        vis[2] = true;
                    }
                }
        );
    }
}

