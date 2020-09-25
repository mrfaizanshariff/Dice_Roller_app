package com.aelinstudios.diceroller2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView image1;
    private ImageView image2;
    private Random random = new Random();
   private Random random1 = new Random();
   private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1=findViewById(R.id.imageView1);
       image2=findViewById(R.id.imageView2);
//       image1.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View view) {
//               rolldice();
//           }
//       });
       button= findViewById(R.id.button1);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               rolldice();
           }
       });
    }
//    public void buttonclicked(View view){
//        rolldice();
//
//    }

    private void rolldice(){
        int randomNumber = random.nextInt(6) + 1 ;
        switch (randomNumber){
            case 1:
                image1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                image1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                image1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                image1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                image1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                image1.setImageResource(R.drawable.dice6);
                break;}
        int randomNumber1 = random1.nextInt(6) + 1 ;
        switch (randomNumber1){
            case 1:
                image2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                image2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                image2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                image2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                image2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                image2.setImageResource(R.drawable.dice6);
                break;}
    }
}