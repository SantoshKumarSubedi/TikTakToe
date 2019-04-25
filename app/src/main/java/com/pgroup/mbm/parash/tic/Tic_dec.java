package com.pgroup.mbm.parash.tic;

/**
 * Created by Parash Gurung on 2/25/2017.
 */

public class Tic_dec {

    public int decision(int player1[][]){
      //  if(player1[0][0]==1&&player1[0][1]==2&&player1[0][2]==3){
        // System.out.println("Player 1 won the game");
           // return 1;
        //}
        //if(player1[1][0]==4&&player1[1][1]==5&&player1[1][2]==6){
          //  System.out.println("Player 1 won the game");
            //return 1;
        //}
        //if(player1[2][0]==7&&player1[2][1]==8&&player1[2][2]==9){
          //  System.out.println("Player 1 won the game");
            //return 1;
        //}
        //if(player1[0][0]==1&&player1[1][1]==5&&player1[2][2]==9){
          //  System.out.println("Player 1 won the game");
            //return 1;
        //}
        //if(player1[0][2]==3&&player1[1][1]==5&&player1[2][0]==7){
          //  System.out.println("Player 1 won the game");
           // return 1;
        //}
        //if(player1[0][0]==1&&player1[1][0]==4&&player1[2][0]==7){
          //  System.out.println("Player 1 won the game");
            //return 1;
        //}
        //if(player1[0][1]==2&&player1[1][1]==5&&player1[2][1]==8){
          //  System.out.println("Player 1 won the game");
            //return 1;
        //}
        //if(player1[0][2]==3&&player1[1][2]==6&&player1[2][2]==9){
           // System.out.println("Player 1 won the game");
            //return 1;
        //}
        int m=0;
        for(int i=0;i<=2;i++){
            if(m!=3){
                m=0;
                for(int j=0;j<=2;j++){

                    if(player1[i][j]==1){
                        m++;
                    }
                }
            }
        }
        if(m!=3){
            m=0;
            for(int j=0;j<=2;j++){
                if(m!=3){
                    m=0;
                    for(int k=0;k<=2;k++){

                        if(player1[k][j]==1){
                            m++;
                        }
                    }
                }
            }
        }

        if(player1[0][0]==1&&player1[1][1]==1&&player1[2][2]==1){
            m=3;
        }else if(player1[0][2]==1&&player1[1][1]==1&&player1[2][0]==1){
            m=3;
        }
        return m;
    }
    public int decision1(int player2[][]){
        //if(player2[0][0]==1&&player2[0][1]==2&&player2[0][2]==3){
          //  System.out.println("Player 1 won the game");
            //return 1;
        //}
        //if(player2[1][0]==4&&player2[1][1]==5&&player2[1][2]==6){
          //  System.out.println("Player 1 won the game");
            //return 1;
        //}
        //if(player2[2][0]==7&&player2[2][1]==8&&player2[2][2]==9){
          //  System.out.println("Player 1 won the game");
            //return 1;
        //}
        //if(player2[0][0]==1&&player2[1][1]==5&&player2[2][2]==9){
          //  System.out.println("Player 1 won the game");
            //return 1;
        //}
        //if(player2[0][2]==3&&player2[1][1]==5&&player2[2][0]==7){
          //  System.out.println("Player 1 won the game");
            //return 1;
        //}
        //if(player2[0][0]==1&&player2[1][0]==4&&player2[2][0]==7){
          //  System.out.println("Player 1 won the game");
            //return 1;
        //}
        //if(player2[0][1]==2&&player2[1][1]==5&&player2[2][1]==8){
          //  System.out.println("Player 1 won the game");
            //return 1;
        //}
        //if(player2[0][2]==3&&player2[1][2]==6&&player2[2][2]==9){
          //  System.out.println("Player 1 won the game");
            //return 1;
        //}

        int m=0;
        for(int i=0;i<=2;i++){
            if(m!=3){
                m=0;
                for(int j=0;j<=2;j++){

                    if(player2[i][j]==1){
                        m++;
                    }
                }
            }
        }
        if(m!=3){
            m=0;
            for(int j=0;j<=2;j++){
                if(m!=3){
                    m=0;
                    for(int k=0;k<=2;k++){

                        if(player2[k][j]==1){
                            m++;
                        }
                    }
                }
            }
        }

        if(player2[0][0]==1&&player2[1][1]==1&&player2[2][2]==1){
            m=3;
        }else if(player2[0][2]==1&&player2[1][1]==1&&player2[2][0]==1){
            m=3;
        }
        return m;
    }
}
