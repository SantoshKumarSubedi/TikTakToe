package com.pgroup.mbm.parash.tic;

import android.content.Intent;

import java.util.Random;

/**
 * Created by glory on 5/31/17.
 */

public class Bot {
    public int check(int placement[][]){
        System.out.println("bot.check");
        int r=0;
        int[] p=new int[10];
        p[1]=placement[0][0];
        p[2]=placement[0][1];
        p[3]=placement[0][2];
        p[4]=placement[1][0];
        p[5]=placement[1][1];
        p[6]=placement[1][2];
        p[7]=placement[2][0];
        p[8]=placement[2][1];
        p[9]=placement[2][2];
        r=gameover(p);
        if(r==0){

        }else{
            r=100;
        }
        if(r==0){
            r=random(p);
        }
        return r;
    }
    public int gameover(int p[]){
        int a=0;

        if(p[1]==2&&p[2]==2&&p[3]==0){
            a=3;
        }else if(p[1]==2&&p[4]==2&&p[7]==0){
            a=7;
        }else if(p[1]==2&&p[5]==2&&p[9]==0){
            a=9;
        }else if(p[1]==2&&p[3]==2&&p[2]==0){
            a=2;
        }else if(p[1]==2&&p[9]==2&&p[5]==0){
            a=5;
        }else if(p[1]==2&&p[7]==2&&p[4]==0){
            a=4;
        }else if(p[2]==2&&p[3]==2&&p[1]==0){
            a=1;
        }else if(p[2]==2&&p[5]==2&&p[8]==0){
            a=8;
        }else if(p[2]==2&&p[8]==2&&p[5]==0){
            a=5;
        }else if(p[3]==2&&p[1]==2&&p[2]==0){
            a=2;
        }else if(p[3]==2&&p[6]==2&&p[9]==0){
            a=9;
        }else if(p[3]==2&&p[9]==2&&p[6]==0){
            a=6;
        }else if(p[3]==2&&p[5]==2&&p[7]==0){
            a=7;
        }else if(p[3]==2&&p[7]==2&&p[5]==0){
            a=5;
        }else if(p[4]==2&&p[5]==2&&p[6]==0){
            a=6;
        }else if(p[4]==2&&p[6]==2&&p[5]==0){
            a=5;
        }else if(p[4]==2&&p[7]==2&&p[1]==0){
            a=1;
        }else if(p[5]==2&&p[6]==2&&p[4]==0){
            a=4;
        }else if(p[5]==2&&p[9]==2&&p[1]==0){
            a=1;
        }else if(p[5]==2&&p[8]==2&&p[2]==0){
            a=2;
        }else if(p[5]==2&&p[7]==2&&p[3]==0){
            a=3;
        }else if(p[7]==2&&p[8]==2&&p[9]==0){
            a=9;
        }else if(p[9]==2&&p[8]==2&&p[7]==0){
            a=7;
        }else if(p[9]==2&&p[7]==2&&p[8]==0){
            a=8;
        }else
            a=0;

return a;
    }

    public int stopgame(int p[]){
        int a=0;
        if(p[1]==1&&p[2]==1&&p[3]==0){
            a=3;
        }else if(p[1]==1&&p[4]==1&&p[7]==0){
            a=7;
        }else if(p[1]==1&&p[5]==1&&p[9]==0){
            a=9;
        }else if(p[1]==1&&p[3]==1&&p[2]==0){
            a=2;
        }else if(p[1]==1&&p[9]==1&&p[5]==0){
            a=5;
        }else if(p[1]==1&&p[7]==1&&p[4]==0){
            a=4;
        }else if(p[2]==1&&p[3]==1&&p[1]==0){
            a=1;
        }else if(p[2]==1&&p[5]==1&&p[8]==0){
            a=8;
        }else if(p[2]==1&&p[8]==1&&p[5]==0){
            a=5;
        }else if(p[3]==1&&p[1]==1&&p[2]==0){
            a=2;
        }else if(p[3]==1&&p[6]==1&&p[9]==0){
            a=9;
        }else if(p[3]==1&&p[9]==1&&p[6]==0){
            a=6;
        }else if(p[3]==1&&p[5]==1&&p[7]==0){
            a=7;
        }else if(p[3]==1&&p[7]==1&&p[5]==0){
            a=5;
        }else if(p[4]==1&&p[5]==1&&p[6]==0){
            a=6;
        }else if(p[4]==1&&p[6]==1&&p[5]==0){
            a=5;
        }else if(p[4]==1&&p[7]==1&&p[1]==0){
            a=1;
        }else if(p[5]==1&&p[6]==1&&p[4]==0){
            a=4;
        }else if(p[5]==1&&p[9]==1&&p[1]==0){
            a=1;
        }else if(p[5]==1&&p[8]==1&&p[2]==0){
            a=2;
        }else if(p[5]==1&&p[7]==1&&p[3]==0){
            a=3;
        }else if(p[7]==1&&p[8]==1&&p[9]==0){
            a=9;
        }else if(p[9]==1&&p[8]==1&&p[7]==0){
            a=7;
        }else if(p[9]==1&&p[7]==1&&p[8]==0){
            a=8;
        }else
            a=0;
return 0;
    }
    public int random(int p[]){
int a=0;
        if(p[5]==0){
            a=5;
        }else{
            Random rand=new Random();
            a=rand.nextInt(9)+1;
        }
        return a;
    }
}
