package com.example.G18_design;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.example.G18_design.model.DesignModel;
import com.example.G18_design.view.DesignView;

public class DesignCtrl extends Activity implements View.OnTouchListener{

    DesignModel model;
    DesignView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        final Button load = findViewById(R.id.load);
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.invalidate();
            }
        });
        final Button save = findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        final RadioButton line = findViewById(R.id.Line);
        final RadioButton rect = findViewById(R.id.Rect);
        final RadioButton pixel = findViewById(R.id.Pixel);
        final RadioButton circle = findViewById(R.id.Circle);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
                return true;
        }
        return true;
    }

}
