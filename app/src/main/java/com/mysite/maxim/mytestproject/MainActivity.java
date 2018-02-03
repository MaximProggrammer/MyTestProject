package com.mysite.maxim.mytestproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    boolean[] V;
    Button[] B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        V = new boolean[8];
        V[0] = false;
        V[1] = false;
        V[2] = false;
        V[3] = false;
        V[4] = false;
        V[5] = false;
        V[6] = false;
        V[7] = false;
        V[8] = false;

        B = new Button[8];

        B[0] = (Button)findViewById(R.id.One);
        B[1] = (Button)findViewById(R.id.Two);
        B[2] = (Button)findViewById(R.id.Three);
        B[3] = (Button)findViewById(R.id.Four);
        B[4] = (Button)findViewById(R.id.Five);
        B[5] = (Button)findViewById(R.id.Six);
        B[6] = (Button)findViewById(R.id.Seven);
        B[7] = (Button)findViewById(R.id.Eight);
        B[8] = (Button)findViewById(R.id.Nine);

        addOnClickListener();
    }



    public void addOnClickListener (){
        B[1].setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B[2].setVisibility(View.VISIBLE);
                        B[1].setVisibility(View.INVISIBLE);
                        B[2].setText("2");
                        V[1] = true;
                    }
                }
        );
    }
}

