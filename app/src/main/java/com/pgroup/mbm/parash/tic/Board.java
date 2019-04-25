package com.pgroup.mbm.parash.tic;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.Arrays;

/**
 * Created by Parash Gurung on 2/24/2017.
 */

public class Board extends AppCompatActivity {

    TextView scoreplayer1,scoreplayer2;
    int player10,player20;
    int turn = 0;
    boolean[] click = new boolean[9];
    int player1[][] = new int[3][3];
    int player2[][] = new int[3][3];
    Tic_dec tc = new Tic_dec();
    Score score=new Score();
    Bot bot=new Bot();
    ImageView imgbox1,imgbox2,imgbox3,imgbox4,imgbox5,imgbox6,imgbox7,imgbox8,imgbox9;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Arrays.fill(click, true);
        player10=score.getA();
        player20=score.getB();

        imgbox1 = (ImageView) findViewById(R.id.img1);
        imgbox2 = (ImageView) findViewById(R.id.img2);
        imgbox3 = (ImageView) findViewById(R.id.img3);
        imgbox4 = (ImageView) findViewById(R.id.img4);
        imgbox5 = (ImageView) findViewById(R.id.img5);
        imgbox6 = (ImageView) findViewById(R.id.img6);
        imgbox7 = (ImageView) findViewById(R.id.img7);
        imgbox8 = (ImageView) findViewById(R.id.img8);
        imgbox9 = (ImageView) findViewById(R.id.img9);
        scoreplayer1=(TextView) findViewById(R.id.board_textview_player1);
        scoreplayer2=(TextView) findViewById(R.id.board_textview_player2);
        scoreplayer1.setText("Player1:"+player10);
        scoreplayer2.setText("Player2:"+player20);
        imgbox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(click[0] == true) {
                    if (turn == 0) {
                        Glide.with(Board.this).load(R.drawable.o).into(imgbox1);
                        turn = 1;
                        player1[0][0] = 1;
                        int stat = tc.decision(player1);
                        if(stat == 3){
                            score.numbers("player1");
                            Toast.makeText(Board.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else {
                            Toast.makeText(Board.this, "Player 2's Turn", Toast.LENGTH_SHORT).show();
                        }
                        click[0] = false;

                    //}
                //    if (type=="bot"){
                 //   int b=bot.check(player1);
                   //    int z=checkPlacement(b);
                //bot(z);
                  //      Toast.makeText(Board.this, "aaaaaaaaaaaaaaaaaaaaaa", Toast.LENGTH_SHORT).show();
                    } else {
                        Glide.with(Board.this).load(R.drawable.x).into(imgbox1);
                        turn = 0;
                        player2[0][0] = 1;
                        int stat=tc.decision1(player2);
                        if(stat==3){
                            score.numbers("player2");
                            Toast.makeText(Board.this, "player 2 win", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else {
                            Toast.makeText(Board.this, "Player 1's Turn", Toast.LENGTH_SHORT).show();
                        }
                            click[0] = false;

                    }
                }

            }
        });

        imgbox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(click[1] == true) {
                    if (turn == 0) {
                        Glide.with(Board.this).load(R.drawable.o).into(imgbox2);
                        player1[0][1] = 1;
                        turn = 1;
                        int stat=tc.decision1(player1);
                        if(stat==3){
                            score.numbers("player1");
                            Toast.makeText(Board.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else {
                            Toast.makeText(Board.this, "Player 2's Turn", Toast.LENGTH_SHORT).show();
                        }
                        click[1] = false;
                    //}
                    //if (type=="bot"){

                    }else {
                        Glide.with(Board.this).load(R.drawable.x).into(imgbox2);
                        player2[0][1] = 1;
                        turn = 0;
                        int stat=tc.decision1(player2);
                        if(stat==3){
                            score.numbers("player2");
                            Toast.makeText(Board.this, "player 2 win", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else {
                            Toast.makeText(Board.this, "Player 1's Turn", Toast.LENGTH_SHORT).show();
                        }
                        click[1] = false;
                    }
                }

            }
        });

        imgbox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(click[2] == true) {
                    if (turn == 0) {
                        Glide.with(Board.this).load(R.drawable.o).into(imgbox3);
                        player1[0][2] = 1;
                        turn = 1;
                        int stat = tc.decision(player1);
                        if(stat == 3){
                            score.numbers("player1");
                            Toast.makeText(Board.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);

                        }else {
                            Toast.makeText(Board.this, "Player 2's Turn", Toast.LENGTH_SHORT).show();
                        }
                        click[2] = false;
                   // }
                    //if(type=="bot"){

                    } else {

                        Glide.with(Board.this).load(R.drawable.x).into(imgbox3);
                        player2[0][2] = 1;
                        turn = 0;
                        int stat=tc.decision1(player2);
                        if(stat==3){
                            score.numbers("player2");
                            Toast.makeText(Board.this, "player 2 win", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else {
                            Toast.makeText(Board.this, "Player 1's Turn", Toast.LENGTH_SHORT).show();
                        }
                        click[2] = false;
                    }
                }

            }
        });

        imgbox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(click[3] == true) {
                    if (turn == 0) {

                        Glide.with(Board.this).load(R.drawable.o).into(imgbox4);
                        player1[1][0] = 1;
                        turn = 1;
                        int stat = tc.decision(player1);
                        if(stat == 3){
                            score.numbers("player1");
                            Toast.makeText(Board.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else {
                            Toast.makeText(Board.this, "Player 2's Turn", Toast.LENGTH_SHORT).show();
                        }
                        click[3] = false;
  //                  }
//                    if(type=="bot"){
//
                    } else {

                        Glide.with(Board.this).load(R.drawable.x).into(imgbox4);
                        player2[1][0] = 1;
                        turn = 0;
                        int stat=tc.decision1(player2);
                        if(stat==3){
                            score.numbers("player2");
                            Toast.makeText(Board.this, "player 2 win", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else {
                            Toast.makeText(Board.this, "Player 1's Turn", Toast.LENGTH_SHORT).show();
                        }
                        click[3] = false;
                    }
                }

            }
        });

        imgbox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(click[4] == true) {
                    if (turn == 0) {

                        Glide.with(Board.this).load(R.drawable.o).into(imgbox5);
                        player1[1][1] = 1;
                        turn = 1;
                        int stat = tc.decision(player1);
                        if(stat == 3){
                            score.numbers("player1");
                            Toast.makeText(Board.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else {
                            Toast.makeText(Board.this, "Player 2's Turn", Toast.LENGTH_SHORT).show();
                        }
                        click[4] = false;
//                    }
    //                if (type=="bot"){

                    } else {
                        Glide.with(Board.this).load(R.drawable.x).into(imgbox5);
                        player2[1][1] = 1;
                        turn = 0;
                        int stat=tc.decision1(player2);
                        if(stat==3){
                            score.numbers("player2");
                            Toast.makeText(Board.this, "player 2 win", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else {
                            Toast.makeText(Board.this, "Player 1's Turn", Toast.LENGTH_SHORT).show();
                        }
                        click[4] = false;
                    }
                }

            }
        });

        imgbox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(click[5] == true) {
                    if (turn == 0) {

                        Glide.with(Board.this).load(R.drawable.o).into(imgbox6);
                        player1[1][2] = 1;
                        turn = 1;
                        int stat = tc.decision(player1);
                        if(stat == 3){
                            score.numbers("player1");
                            Toast.makeText(Board.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else {
                            Toast.makeText(Board.this, "Player 2's Turn", Toast.LENGTH_SHORT).show();
                        }
                        click[5] = false;
//                    }
  //                  if(type=="bot"){

                    } else {
                        Glide.with(Board.this).load(R.drawable.x).into(imgbox6);
                        player2[1][2] = 1;
                        turn = 0;
                        int stat=tc.decision1(player2);
                        if(stat==3){
                            score.numbers("player2");
                            Toast.makeText(Board.this, "player 2 win", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else {
                            Toast.makeText(Board.this, "Player 1's Turn", Toast.LENGTH_SHORT).show();
                        }
                        click[5] = false;
                    }
                }

            }
        });
        imgbox7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(click[6] = true) {
                    if (turn == 0) {
                        Glide.with(Board.this).load(R.drawable.o).into(imgbox7);
                        player1[2][0] = 1;
                        turn = 1;
                        int stat = tc.decision(player1);
                        if(stat == 3){
                            score.numbers("player1");
                            Toast.makeText(Board.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else {
                            Toast.makeText(Board.this, "Player 2's Turn", Toast.LENGTH_SHORT).show();
                        }
                        click[6] = false;
    //                }
  //                  if(type=="bot"){

                    } else {
                        Glide.with(Board.this).load(R.drawable.x).into(imgbox7);
                        player2[2][0] = 1;
                        turn = 0;
                        int stat=tc.decision1(player2);
                        if(stat==3){
                            score.numbers("player2");
                            Toast.makeText(Board.this, "player 2 win", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else {
                            Toast.makeText(Board.this, "Player 1's Turn", Toast.LENGTH_SHORT).show();
                        }
                        click[6] = false;
                    }
                }

            }
        });
        imgbox8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(click[7] = true) {
                    if (turn == 0) {
                        Glide.with(Board.this).load(R.drawable.o).into(imgbox8);
                        player1[2][1] = 1;
                        turn = 1;
                        int stat = tc.decision(player1);
                        if(stat == 3){
                            score.numbers("player1");
                            Toast.makeText(Board.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else {
                            Toast.makeText(Board.this, "Player 2's Turn", Toast.LENGTH_SHORT).show();
                        }
                        click[7] = false;
  //                  }
//                    if(type=="bot"){

                    } else {
                        Glide.with(Board.this).load(R.drawable.x).into(imgbox8);
                        player2[2][1] = 1;
                        turn = 0;
                        int stat=tc.decision1(player2);
                        if(stat==3){
                            score.numbers("player2");
                            Toast.makeText(Board.this, "player 2 win", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else {
                            Toast.makeText(Board.this, "Player 1's Turn", Toast.LENGTH_SHORT).show();
                        }
                        click[7] = false;
                    }
                }

            }
        });
        imgbox9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(click[8] = true) {
                    if (turn == 0) {
                        Glide.with(Board.this).load(R.drawable.o).into(imgbox9);
                        player1[2][2] = 1;
                        turn = 1;
                        int stat = tc.decision(player1);
                        if(stat == 3){
                            score.numbers("player1");
                            Toast.makeText(Board.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else {
                            Toast.makeText(Board.this, "Player 2's Turn", Toast.LENGTH_SHORT).show();
                        }
                        click[8] = false;
     //               }
    //               if (type=="bot"){

                    } else {
                        Glide.with(Board.this).load(R.drawable.x).into(imgbox9);
                        player2[2][2] = 1;
                        turn = 0;
                        int stat=tc.decision1(player2);
                        if(stat==3){
                            score.numbers("player2");
                            Toast.makeText(Board.this, "player 2 win", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(Board.this,Quit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else {
                            Toast.makeText(Board.this, "Player 1's Turn", Toast.LENGTH_SHORT).show();
                        }
                        click[8] = false;
                    }
                }

            }
        });

    }
    public int checkPlacement(int z){
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
        if(z==1){
            if(player1[0][0]==1||player1[0][0]==2){
                z=bot.check(player1);
            }else
                Glide.with(Board.this).load(R.drawable.o).into(imgbox1);
            player1[0][0]=2;
        }else if(z==2){
            if(player1[0][1]==1||player1[0][1]==2){
                z=bot.check(player1);
            }else
                Glide.with(Board.this).load(R.drawable.o).into(imgbox2);
                 player1[0][1]=2;
        }else if(z==3){
            Glide.with(Board.this).load(R.drawable.o).into(imgbox3);
             player1[0][2]=2;
        }else if(z==4){
            Glide.with(Board.this).load(R.drawable.o).into(imgbox4);
            player1[1][0]=2;
        }else if(z==5){
            Glide.with(Board.this).load(R.drawable.o).into(imgbox5);
            player1[1][1]=2;
        }else if(z==6){
            Glide.with(Board.this).load(R.drawable.o).into(imgbox6);
            player1[1][2]=2;
        }else if(z==7){
            Glide.with(Board.this).load(R.drawable.o).into(imgbox7);
            player1[2][0]=2;
        }else if(z==8){
            Glide.with(Board.this).load(R.drawable.o).into(imgbox8);
            player1[2][1]=2;
        }else if(z==9){
            Glide.with(Board.this).load(R.drawable.o).into(imgbox9);
            player1[2][2]=2;
        }
        return 0;
    }
}