package com.example.misikirmehari.tabbuttoncounter;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // Model
    private Counter count;


    // View
    private TextView countview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        count = new Counter();
        countview = (TextView) findViewById(R.id.textView);

        Button countTap = (Button) findViewById(R.id.button);

        countTap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.addCounter();
                countview.setText(count.getCount().toString());
            }
        });


    }


}



