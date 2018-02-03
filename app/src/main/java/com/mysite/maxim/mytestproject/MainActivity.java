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

        bb = new Button[4][];
        bb[0]=new Button[4];
        bb[1]=new Button[4];
        bb[2]=new Button[4];
        bb[3]=new Button[4];

        bb[0][0] = findViewById(R.id.b00);
        bb[0][1] = findViewById(R.id.b01);
        bb[0][2] = findViewById(R.id.b02);
        bb[0][3] = findViewById(R.id.b03);
        bb[1][0] = findViewById(R.id.b10);
        bb[1][1] = findViewById(R.id.b11);
        bb[1][2] = findViewById(R.id.b12);
        bb[1][3] = findViewById(R.id.b13);
        bb[2][0] = findViewById(R.id.b20);
        bb[2][1] = findViewById(R.id.b21);
        bb[2][2] = findViewById(R.id.b22);
        bb[2][3] = findViewById(R.id.b23);
        bb[3][0] = findViewById(R.id.b30);
        bb[3][1] = findViewById(R.id.b31);
        bb[3][2] = findViewById(R.id.b32);
        bb[3][3] = findViewById(R.id.b33);

        for (int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {

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
        for (int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {

                bb[i][j].setVisibility(View.VISIBLE);
                bb[i][j].setText(""+(i*4 + j + 1));

            }
        }
        bb[3][3].setVisibility(View.INVISIBLE);
    }

    private void clickBB(int i, int j) {
        System.out.println("i = "+i+", j = "+j);
        bb[i][j].setVisibility(View.INVISIBLE);
    }

}

