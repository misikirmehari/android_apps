package com.example.misikirmehari.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioGroup OrientationGroup = (RadioGroup) findViewById(R.id.orientation);
        OrientationGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.horizontal:
                        group.setOrientation(LinearLayout.HORIZONTAL);
                        break;

                    case R.id.vertical:
                        group.setOrientation(LinearLayout.VERTICAL);
                        break;

                }
            }
        });

        Button change_pic = (Button) findViewById(R.id.change_picture);
        ArrayList<Integer> viewImages = new ArrayList<>();
        viewImages.add(R.drawable.laughing);
        viewImages.add(R.drawable.lion2);
        viewImages.add(R.drawable.lion3);
        viewImages.add(R.drawable.lion_1);


        change_pic.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView view = (ImageView) findViewById(R.id.myicon);
                view.setImageResource(R.drawable.lion_1);
            }

        });
    }

    public void onClick(View view) {
        EditText input = (EditText) findViewById(R.id.editText);
        String string = input.getText().toString();
        Toast.makeText(this, "Button 1 pressed", Toast.LENGTH_LONG).show();
    }

}




