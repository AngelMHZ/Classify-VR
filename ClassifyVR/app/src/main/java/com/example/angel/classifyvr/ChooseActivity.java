package com.example.angel.classifyvr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class ChooseActivity extends AppCompatActivity {
    int width;
    int hei;

    Button b1,b2, b3, b4, b5, b6;



    public void createButtons() {
        width = getResources().getDisplayMetrics().widthPixels/2;
        hei=getResources().getDisplayMetrics().heightPixels/3;

        b1=(Button) findViewById(R.id.buttonSchedule);
        b2=(Button) findViewById(R.id.buttonClasses);
        b3=(Button) findViewById(R.id.buttonSports);
        b4=(Button) findViewById(R.id.buttonVPAC);
        b5=(Button) findViewById(R.id.buttonClubs);
        b6=(Button) findViewById(R.id.buttonGreek);

    }

    public void schedule(){
        b1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                if (arg1.getAction()== MotionEvent.ACTION_DOWN)
                   b1.setBackground(getResources().getDrawable(R.drawable.scheduleimage));
                else  if (arg1.getAction()== MotionEvent.ACTION_UP)
                    b1.setBackground(getResources().getDrawable(R.drawable.scheduleimageblur));
                return true;
            }
        });

    }

    public void classes(){
        b2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                if (arg1.getAction()==MotionEvent.ACTION_DOWN)
                    b2.setBackground(getResources().getDrawable(R.drawable.classimage));
                else if (arg1.getAction()==MotionEvent.ACTION_UP)
                    b2.setBackground(getResources().getDrawable(R.drawable.classimageblur));
                return true;
            }
        });

    }

    public void sports(){
        b3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                if (arg1.getAction()==MotionEvent.ACTION_DOWN)
                    b3.setBackground(getResources().getDrawable(R.drawable.sportsimage));
                else if (arg1.getAction()==MotionEvent.ACTION_UP)
                    b3.setBackground(getResources().getDrawable(R.drawable.sportsimageblur));
                return true;
            }
        });

    }

    public void vpac(){
        b4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                if (arg1.getAction()==MotionEvent.ACTION_DOWN)
                    b4.setBackground(getResources().getDrawable(R.drawable.vpacimage));
                else if (arg1.getAction()==MotionEvent.ACTION_UP)
                    b4.setBackground(getResources().getDrawable(R.drawable.vpacimageblur));
                return true;
            }
        });

    }

    public void clubs(){
        b5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                if (arg1.getAction()==MotionEvent.ACTION_DOWN)
                    b5.setBackground(getResources().getDrawable(R.drawable.clubsimage));
                else if (arg1.getAction()==MotionEvent.ACTION_UP)
                    b5.setBackground(getResources().getDrawable(R.drawable.clubsimageblur));
                return true;
            }
        });

    }

    public void greek(){
        b6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                if (arg1.getAction()==MotionEvent.ACTION_DOWN)
                    b6.setBackground(getResources().getDrawable(R.drawable.greeklifeimage));
                else if (arg1.getAction()==MotionEvent.ACTION_UP)
                    b6.setBackground(getResources().getDrawable(R.drawable.greeklifeimageblur));
                return true;
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        createButtons();

        schedule();
        classes();
        sports();
        vpac();
        clubs();
        greek();
    }
}
