package com.pgroup.mbm.parash.tic;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by glory on 5/30/17.
 */

public class Start extends AppCompatActivity {
    Button player1, player2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
         Button pl1 = (Button)findViewById(R.id.button_player1);
        Button pl2 = (Button)findViewById(R.id.button_player2);



        final TranslateAnimation pl1trans = new TranslateAnimation(Animation.ABSOLUTE, 0,
                Animation.RELATIVE_TO_PARENT, 1, Animation.ABSOLUTE, 0 ,Animation.ABSOLUTE,100);
        pl1trans.setDuration(1000);

        final AnimationSet setAnimation = new AnimationSet(true);
        setAnimation.addAnimation(pl1trans);
        setupAnimation(pl1,pl1trans, R.anim.set_anim);
        setupAnimation(pl2,pl1trans, R.anim.set_anim);


    }

    /* private void setupAnimation(View view, final Animation animation, final  int animationID){
         view.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 v.startAnimation(AnimationUtils.loadAnimation(Chose.this, animationID));
                 v.startAnimation(animation);
             }
         });
     }
 */
    private void setupAnimation(View view, final Animation animation,
                                final int player) {
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // If the button is checked, load the animation from the given resource
                // id instead of using the passed-in animation paramter. See the xml files
                // for the details on those animations.
                final int pl=player;
                v.startAnimation(animation);

                Thread thread=new Thread(){
                    @Override
                    public void run(){
                        try{
                            sleep(500);
                            if (pl==0){
                                Intent intent=new Intent(Start.this,BotBoard.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                startActivity(intent);
                            }else{
                                Intent intent=new Intent(Start.this,Board.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                startActivity(intent);
                            }

                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                };
                thread.start();
            }
        });

    }

}
