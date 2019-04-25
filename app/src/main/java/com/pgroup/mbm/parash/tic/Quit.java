package com.pgroup.mbm.parash.tic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by glory on 5/17/17.
 */

public class Quit extends AppCompatActivity {
    Button restart1,quit1;
    String type;
    @Override
    protected void onCreate( @Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_restart_quit);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        restart1 = (Button) findViewById(R.id.button_restart);
        quit1 = (Button) findViewById(R.id.button_quit);

        restart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toast.makeText(Quit.this, "Restart", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Quit.this, Board.class);
                    System.out.println(type);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
            }
        });
        quit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            moveTaskToBack(true);
                finish();

            }
        });


    }
    }

