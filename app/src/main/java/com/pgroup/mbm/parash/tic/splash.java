package com.pgroup.mbm.parash.tic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by glory on 5/29/17.
 */

public class splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        //TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        Thread timerThread=new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(splash.this,Start.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }
    @Override
    protected  void onPause(){
        //TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}
