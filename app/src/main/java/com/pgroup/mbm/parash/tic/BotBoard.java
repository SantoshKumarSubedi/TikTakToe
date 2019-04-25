package com.pgroup.mbm.parash.tic;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.Arrays;

/**
 * Created by glory on 6/1/17.
 */

public class BotBoard extends AppCompatActivity{
    int turn=0;
    String type="bot";
    boolean[] click=new boolean[9];
    int player1[][]=new int[3][3];
    int player2[][]=new int[3][3];
    Tic_dec tc=new Tic_dec();
    Bot bot=new Bot();
    ImageView imgbox1,imgbox2,imgbox3,imgbox4,imgbox5,imgbox6,imgbox7,imgbox8,imgbox9;
    @Override
    protected void onCreate(@Nullable Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        setContentView(R.layout.bot_board);
        Arrays.fill(click,true);

        imgbox1=(ImageView) findViewById(R.id.bot_img1);
        imgbox2=(ImageView) findViewById(R.id.bot_img2);
        imgbox3=(ImageView) findViewById(R.id.bot_img3);
        imgbox4=(ImageView) findViewById(R.id.bot_img4);
        imgbox5=(ImageView) findViewById(R.id.bot_img5);
        imgbox6=(ImageView) findViewById(R.id.bot_img6);
        imgbox7=(ImageView) findViewById(R.id.bot_img7);
        imgbox8=(ImageView) findViewById(R.id.bot_img8);
        imgbox9=(ImageView) findViewById(R.id.bot_img9);

        imgbox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(click[0]==true){
                    Glide.with(BotBoard.this).load(R.drawable.o).into(imgbox1);
                    player1[0][0]=1;
                    int stat=tc.decision(player1);
                    if(stat==3){
                        Toast.makeText(BotBoard.this, "player 1 win's", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(BotBoard.this,BotQuit.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                    }
                    int b=bot.check(player1);
                    System.out.println(b);
                    int z=checkPlacement(b);
                    System.out.println(z);
                   bot(z);
                    click[0]=false;

                }
            }
        });

        imgbox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (click[1]==true){
             Glide.with(BotBoard.this).load(R.drawable.o).into(imgbox2);
                player1[0][1]=1;
                int stat=tc.decision(player1);
                if(stat==3){
                    Toast.makeText(BotBoard.this, "player 1 win's", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(BotBoard.this,BotQuit.class);

                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                }
                int b=bot.check(player1);
                int z=checkPlacement(b);
                bot(z);
                click[1]=false;
            }
            }
        });

        imgbox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click[2]==true){
                    Glide.with(BotBoard.this).load(R.drawable.o).into(imgbox3);
                    player1[0][2]=1;
                    int stat=tc.decision(player1);
                    if (stat==3){
                        Toast.makeText(BotBoard.this, "player 1 win's", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(BotBoard.this,BotQuit.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                    }
                    int b=bot.check(player1);
                    int z=checkPlacement(b);
                    bot(z);
                    click[2]=false;
                }
            }
        });

        imgbox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (click[3]==true){
                Glide.with(BotBoard.this).load(R.drawable.o).into(imgbox4);
                player1[1][0]=1;
                int stat=tc.decision(player1);
                if(stat==3){
                    Toast.makeText(BotBoard.this,"player 1 win's",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(BotBoard.this,BotQuit.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                }
                int b=bot.check(player1);
                int z=checkPlacement(b);
                bot(z);
                click[3]=false;
            }
            }
        });

        imgbox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (click[4]==true){
                Glide.with(BotBoard.this).load(R.drawable.o).into(imgbox5);
                player1[1][1]=0;
                int stat=tc.decision(player1);
                if (stat==3){
                    Toast.makeText(BotBoard.this, "player 1 win's", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(BotBoard.this,BotQuit.class);

                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                }
                int b=bot.check(player1);
                int z=checkPlacement(b);
                bot(z);
                click[4]=false;
            }
            }
        });

        imgbox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click[5]==true){
                    Glide.with(BotBoard.this).load(R.drawable.o).into(imgbox6);
                    player1[1][2]=0;
                    int stat=tc.decision(player1);
                    if(stat==3){
                        Toast.makeText(BotBoard.this, "player 1 win's", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(BotBoard.this,BotQuit.class);

                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                    }
                    int b=bot.check(player1);
                    int z=checkPlacement(b);
                    bot(z);
                    click[5]=false;
                }
            }
        });

        imgbox7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click[6]==true){
                    Glide.with(BotBoard.this).load(R.drawable.o).into(imgbox7);
                    player1[2][0]=0;
                    int stat=tc.decision(player1);
                    if (stat==3){
                        Toast.makeText(BotBoard.this, "player 1 win's", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(BotBoard.this,BotQuit.class);

                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                    }
                    int b=bot.check(player1);
                    int z=checkPlacement(b);
                    bot(z);
                    click[6]=false;
                }
            }
        });

        imgbox8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click[7]==true){
                    Glide.with(BotBoard.this).load(R.drawable.o).into(imgbox5);
                    player1[2][1]=0;
                    int stat=tc.decision(player1);
                    if (stat==3){
                        Toast.makeText(BotBoard.this, "player 1 win's", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(BotBoard.this,BotQuit.class);

                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                    }
                    int b=bot.check(player1);
                    int z=checkPlacement(b);
                    bot(z);
                    click[7]=false;
                }
            }
        });

        imgbox9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click[8]==true){
                    Glide.with(BotBoard.this).load(R.drawable.o).into(imgbox5);
                    player1[2][2]=0;
                    int stat=tc.decision(player1);
                    if (stat==3){
                        Toast.makeText(BotBoard.this, "player 1 win's", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(BotBoard.this,BotQuit.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                    }
                    int b=bot.check(player1);
                    int z=checkPlacement(b);
                    bot(z);
                    click[8]=false;
                }
            }
        });
    }
    public int checkPlacement(int z){
        System.out.println("checkplacement");
        if(z==1){
            if(player1[0][0]==1||player1[0][0]==2){
                z=bot.check(player1);
                checkPlacement(z);
            }}else if(z==2){
            if(player1[0][1]==1||player1[0][1]==2){
                z=bot.check(player1);
                checkPlacement(z);
            }}else if(z==3){
            if(player1[0][2]==1||player1[0][2]==2){
                z=bot.check(player1);
                checkPlacement(z);
            }}else if(z==4){
            if(player1[1][0]==1||player1[1][0]==2){
                z=bot.check(player1);
                checkPlacement(z);
            }}else if(z==5){
            if(player1[1][1]==1||player1[1][1]==2){
                z=bot.check(player1);
                checkPlacement(z);
            }}else if(z==6){
            if(player1[1][2]==1||player1[1][2]==2){
                z=bot.check(player1);
                checkPlacement(z);
            }}else if(z==7){
            if(player1[2][0]==1||player1[2][0]==2){
                z=bot.check(player1);
                checkPlacement(z);
            }}else if(z==8){
            if(player1[2][1]==1||player1[2][1]==2){
                z=bot.check(player1);
                checkPlacement(z);
            }}else if(z==9){
            if(player1[2][2]==1||player1[2][2]==2){
                z=bot.check(player1);
                checkPlacement(z);
            }}
        return z;

    }

    public  int bot(int z){
        String imagename="x";
        System.out.println("BOT");
        System.out.println(z);
        if(z==1){
            if(player1[0][0]==1||player1[0][0]==2){
                z=bot.check(player1);
            }else
                imgbox1.setImageResource(R.drawable.x);
            player1[0][0]=2;
        }else if(z==2){
            if(player1[0][1]==1||player1[0][1]==2){
                z=bot.check(player1);
            }else
                imgbox2.setImageResource(R.drawable.x);
            player1[0][1]=2;
        }else if(z==3){
            imgbox3.setImageResource(R.drawable.x);
            player1[0][2]=2;
        }else if(z==4){
            imgbox4.setImageResource(R.drawable.x);
            player1[1][0]=2;
        }else if(z==5){
            imgbox5.setImageResource(R.drawable.x);
            player1[1][1]=2;
            System.out.println("Z:"+z);
        }else if(z==6){
            imgbox6.setImageResource(R.drawable.x);
            player1[1][2]=2;
        }else if(z==7){
            imgbox7.setImageResource(R.drawable.x);
            player1[2][0]=2;
        }else if(z==8){
            imgbox8.setImageResource(R.drawable.x);
            player1[2][1]=2;
        }else if(z==9){
            imgbox9.setImageResource(R.drawable.x);
            player1[2][2]=2;
        }
        return 0;
    }
}
