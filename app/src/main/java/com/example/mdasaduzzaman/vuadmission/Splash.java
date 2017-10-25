package com.example.mdasaduzzaman.vuadmission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    private TextView pt;
    private ImageView pi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        pt = (TextView) findViewById(R.id.pt);
        pi=(ImageView) findViewById(R.id.pi);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.myanimation);
        pt.startAnimation(myanim);
        pi.startAnimation(myanim);
        final Intent k=new Intent(this,gotit.class);
        Thread timer=new Thread(){
            public void run()
            {
                try {
                    sleep(2200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(k);
                }
            }
        };    timer.start();
    }
}
