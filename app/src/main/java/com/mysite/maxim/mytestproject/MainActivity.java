package com.mysite.maxim.mytestproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button[][] bb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bb = new Button[3][];
        bb[0]=new Button[3];
        bb[1]=new Button[3];
        bb[2]=new Button[3];

        bb[0][0] = findViewById(R.id.One);
        bb[0][1] = findViewById(R.id.Two);
        bb[0][2] = findViewById(R.id.Three);
        bb[1][0] = findViewById(R.id.Four);
        bb[1][1] = findViewById(R.id.Five);
        bb[1][2] = findViewById(R.id.Six);
        bb[2][0] = findViewById(R.id.Seven);
        bb[2][1] = findViewById(R.id.Eight);
        bb[2][2] = findViewById(R.id.Nine);

        for (int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {

                final int ii=i, jj=j;

                bb[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        clickBB(ii, jj);
                    }
                });

            }
        }

        initStart();

    }

    private void initStart() {
        for (int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {

                bb[i][j].setVisibility(View.VISIBLE);
                bb[i][j].setText("Y");

            }
        }
    }

    private void clickBB(int i, int j) {
        System.out.println("i = "+i+", j = "+j);
        bb[i][j].setVisibility(View.INVISIBLE);
    }

}

