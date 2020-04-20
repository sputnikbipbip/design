package com.example.G18_design;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

import com.example.G18_design.model.DesignModel;
import com.example.G18_design.view.DesignView;

public class DesignCtrl extends Activity {

    DesignModel model;
    DesignView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button reset = findViewById(R.id.reset);
        final Button load = findViewById(R.id.load);
        final Button save = findViewById(R.id.save);
        final RadioButton line = findViewById(R.id.Line);
        final RadioButton rect = findViewById(R.id.Rect);
        final RadioButton pixel = findViewById(R.id.Pixel);
        final RadioButton circle = findViewById(R.id.Circle);
    }
}
