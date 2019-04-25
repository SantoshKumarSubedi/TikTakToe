package com.pgroup.mbm.parash.tic;

/**
 * Created by glory on 6/3/17.
 */

public class Score {
    static int a=0;
    static int b=0;
    public void numbers(String player){
        if(player=="player1"){
          a++;
        }else if(player=="player2"){
            b++;
        }
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
}
