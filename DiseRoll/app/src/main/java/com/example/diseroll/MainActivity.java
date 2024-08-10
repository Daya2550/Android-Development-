package com.example.diseroll;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
   int num =0;
   int n1=0;
   String nn1="";
   String nn2="";
   int n2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView e;
        Button b,c,h;
        ImageView i,i1,i2;
        e=findViewById(R.id.textView2);
        b=findViewById(R.id.button);
        c=findViewById(R.id.button2);
        h=findViewById(R.id.button3);
        i=findViewById(R.id.imageView);
        i1=findViewById(R.id.imageView2);
        i2=findViewById(R.id.imageView3);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Random r1=new Random();
                    Random r2=new Random();
                    int num1=r1.nextInt(6);
                    int num2= r2.nextInt(6);
                    n1=n1+num1+1;
                    n2=n2+num2+1;
                    num++;
                    nn1=nn1+","+(num1+1);
                    nn2=nn2+","+(num2+1);
                    if(num1==0){
                        i.setImageResource(R.drawable.dise1);
                    } else if (num1==1) {
                        i.setImageResource(R.drawable.dise2);
                    }

                    else if (num1==2) {
                        i.setImageResource(R.drawable.dise3);
                    }
                    else if (num1==3) {
                        i.setImageResource(R.drawable.dise4);
                    }
                    else if (num1==4) {
                        i.setImageResource(R.drawable.dise5);
                    }

                    else if (num1==5) {
                        i.setImageResource(R.drawable.dise6);
                    }
                    else {
                        i.setImageResource(R.drawable.player);
                    }


                    if(num2==0){
                        i1.setImageResource(R.drawable.dise1);
                    } else if (num2==1) {
                        i1.setImageResource(R.drawable.dise2);
                    }

                    else if (num2==2) {
                        i1.setImageResource(R.drawable.dise3);
                    }
                    else if (num2==3) {
                        i1.setImageResource(R.drawable.dise4);
                    }
                    else if (num2==4) {
                        i1.setImageResource(R.drawable.dise5);
                    }

                    else if (num2==5) {
                        i1.setImageResource(R.drawable.dise6);
                    }
                    else {
                        i1.setImageResource(R.drawable.player);
                    }

                    if(num2>num1){
                        i2.setImageResource(R.drawable.player2);
                    } else if (num2<num1) {
                        i2.setImageResource(R.drawable.player1);
                    }
                    else{
                        i2.setImageResource(R.drawable.images);
                    }
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Somthing wents wrong !", Toast.LENGTH_SHORT).show();
                }



            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    i.setImageResource(R.drawable.player);
                    i1.setImageResource(R.drawable.player);
                    i2.setImageResource(R.drawable.wel);
                    n1=0;
                    n2=0;
                    num=0;
                    nn1="";
                    nn2="";
                    e.setText("");

                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Somthing wentes wrong !", Toast.LENGTH_SHORT).show();
                }
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               try {
                    if(num<=10){

                        if(n1>n2){
                            e.setText("P1 = "+nn1+" = "+n1+"\n"+"P2 = "+nn2+" = "+n2+"\n"+"No = "+num);
                            i2.setImageResource(R.drawable.player1);
                        } else if (n1<n2) {
                            e.setText("P1 = "+nn1+" = "+n1+"\n"+"P2 = "+nn2+" = "+n2+"\n"+"No = "+num);
                            i2.setImageResource(R.drawable.player2);
                        }
                        else{
                            i2.setImageResource(R.drawable.images);
                        }
                    }
                    else{

                        if(n1>n2){
                            e.setText("P1 = "+n1+"\n"+"P2 = "+n2+"\n"+"No = "+num);
                            i2.setImageResource(R.drawable.player1);
                        } else if (n1<n2) {
                            e.setText("P1 = "+n1+"\n"+"P2 = "+n2+"\n"+"No = "+num);
                            i2.setImageResource(R.drawable.player2);
                        }
                        else{
                            i2.setImageResource(R.drawable.images);
                        }

                    }


               }
               catch (Exception e){
                   Toast.makeText(MainActivity.this, "Somthing wentes Wrong !", Toast.LENGTH_SHORT).show();
               }
               
              
            }
        });
    }
}