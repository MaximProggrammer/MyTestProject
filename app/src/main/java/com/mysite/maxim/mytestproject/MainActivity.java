package com.mysite.maxim.mytestproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

  Button[][] bb;
  private Button shuffle;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    bb = new Button[4][];
    bb[0] = new Button[4];
    bb[1] = new Button[4];
    bb[2] = new Button[4];
    bb[3] = new Button[4];

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
    shuffle = (Button)findViewById(R.id.Shuffle);
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {

        final int ii = i, jj = j;

        bb[i][j].setOnClickListener(
            new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                clickBB(ii, jj);

              }

            });

      }
    }

    initStart();

    shuffle.setOnClickListener(
        new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            Random random = new Random();
            for(int x = 0;x < 100;x++){
              int i = random.nextInt(4);
              int j = random.nextInt(4);
              clickBB(i, j);
            }
          }
        }
    );



  }


  private void initStart() {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        bb[i][j].setVisibility(View.VISIBLE);
        bb[i][j].setText("" + (i * 4 + j + 1));

      }
    }
    bb[3][3].setVisibility(View.INVISIBLE);
  }

  private void clickBB(int I, int J) {
    if(bb[I][J].getVisibility() != View.VISIBLE) return;
    System.out.println("I = " + I + ", J = " + J);

    for (int j = 0; j < 4; j++) {
      if (bb[I][j].getVisibility() != View.VISIBLE) {

        bb[I][J].setVisibility(View.INVISIBLE);
        bb[I][j].setVisibility(View.VISIBLE);

        int j1 = J, j2 = j;

        if (j1 < j2) for (int jj = j2; jj > j1; jj--) {

          bb[I][jj].setText(bb[I][jj - 1].getText());

        }

        if (j1 > j2) for (int jj = j2; jj < j1; jj++) {

          bb[I][jj].setText(bb[I][jj + 1].getText());

        }

        return;

      }
    }


    for (int i = 0; i < 4; i++) {


      if (bb[i][J].getVisibility() != View.VISIBLE) {

        bb[I][J].setVisibility(View.INVISIBLE);
        bb[i][J].setVisibility(View.VISIBLE);

        int i1 = I, i2 = i;

        if (i1 < i2) for (int ii = i2; ii > i1; ii--) {

          bb[ii][J].setText(bb[ii - 1][J].getText());

        }

        if (i1 > i2) for (int ii = i2; ii < i1; ii++) {

          bb[ii][J].setText(bb[ii + 1][J].getText());


        }

        return;

      }
    }

  }

}

