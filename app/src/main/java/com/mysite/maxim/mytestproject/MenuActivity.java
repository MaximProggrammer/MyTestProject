package com.mysite.maxim.mytestproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

  private Button play_Game;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_menu);
    play_Game = (Button) findViewById(R.id.Play);
    play_Game.setOnClickListener(
        new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            ClickMe();
          }
        }
    );
  }

  public void ClickMe(){
    Intent Play = new Intent("com.mysite.maxim.mytestproject.MainActivity");
    startActivity(Play);
  }
}

