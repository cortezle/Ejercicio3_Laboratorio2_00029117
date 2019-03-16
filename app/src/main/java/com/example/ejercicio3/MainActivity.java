package com.example.ejercicio3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity{

    private TextView panel1, panel2,panel3;
    private int random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panel1=findViewById(R.id.pn1);
        panel2=findViewById(R.id.pn2);
        panel3=findViewById(R.id.pn3);

        panel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                random = (int) (Math.random() * 6);
                switch (random){
                    case 1:
                        panel1.setBackgroundColor(Color.rgb (100,0,0));
                        break;

                    case 2:
                        panel1.setBackgroundColor(Color.rgb (50,0,0));
                        break;

                    case 3:
                        panel1.setBackgroundColor(Color.rgb (150,0,0));
                        break;

                    case 4:
                        panel1.setBackgroundColor(Color.rgb (0,0,0));
                        break;

                    case 5:
                        panel1.setBackgroundColor(Color.rgb (200,0,0));
                        break;

                    case 6:
                        panel1.setBackgroundColor(Color.rgb (120,0,0));
                        break;

                    default:
                        panel1.setBackgroundColor(Color.rgb (255,0,0));
                }

            }
        });

        panel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                random = (int) (Math.random() * 6)+1;
                switch (random){
                    case 1:
                        panel2.setBackgroundColor(Color.rgb (0,100,0));
                        break;

                    case 2:
                        panel2.setBackgroundColor(Color.rgb (0,50,0));
                        break;


                    case 3:
                        panel2.setBackgroundColor(Color.rgb (0,150,0));
                        break;

                    case 4:
                        panel2.setBackgroundColor(Color.rgb (0,0,0));
                        break;

                    case 5:
                        panel2.setBackgroundColor(Color.rgb (0,200,0));
                        break;

                    case 6:
                        panel2.setBackgroundColor(Color.rgb (0,120,0));
                        break;

                    default:
                        panel2.setBackgroundColor(Color.rgb (0,255,0));
                }

            }
        });

        panel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                random = (int) (Math.random() * 6)+1;
                switch (random){
                    case 1:
                        panel3.setBackgroundColor(Color.rgb (0,0,100));
                        break;

                    case 2:
                        panel3.setBackgroundColor(Color.rgb (0,0,50));
                        break;

                    case 3:
                        panel3.setBackgroundColor(Color.rgb (0,0,150));
                        break;

                    case 4:
                        panel3.setBackgroundColor(Color.rgb (0,0,0));
                        break;

                    case 5:
                        panel3.setBackgroundColor(Color.rgb (0,0,200));
                        break;

                    case 6:
                        panel3.setBackgroundColor(Color.rgb (0,0,120));
                        break;

                    default:
                        panel3.setBackgroundColor(Color.rgb (0,0,55));
                        break;
                }

            }
        });
    }
}
