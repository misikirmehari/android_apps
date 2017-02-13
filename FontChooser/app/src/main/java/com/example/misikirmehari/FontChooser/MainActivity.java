package com.example.misikirmehari.FontChooser;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {





    /**
     * Called when the activity is first created.
     */


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.misikirmehari.FontChooser.R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.editText);


        final RadioGroup radioGroup = (RadioGroup) findViewById(com.example.misikirmehari.FontChooser.R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Fragment_Size size_frag = new Fragment_Size();
                Fragment_Style style_frag = new Fragment_Style();
                Fragment_Typeface font_frag = new Fragment_Typeface();
                Fragment_Color color_frag = new Fragment_Color();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();


                switch (i) {
                    case com.example.misikirmehari.FontChooser.R.id.radioButton_style:
                        String Text = editText.getText().toString();
                        Bundle bundle = new Bundle();
                        bundle.putString("main", Text);
                        style_frag.setArguments(bundle);
                        fragmentTransaction.replace(com.example.misikirmehari.FontChooser.R.id.frame_container, style_frag);
                        fragmentTransaction.commit();


                        Toast.makeText(MainActivity.this, "Style Clicked ", Toast.LENGTH_SHORT).show();
                        break;

                    case com.example.misikirmehari.FontChooser.R.id.radioButton_size:
//
                        fragmentTransaction.replace(com.example.misikirmehari.FontChooser.R.id.frame_container, size_frag);
                        fragmentTransaction.commit();

                        Toast.makeText(MainActivity.this, " Size Clicked", Toast.LENGTH_SHORT).show();
                        break;

                    case com.example.misikirmehari.FontChooser.R.id.radioButton_font:

                        String font = editText.getText().toString();
                        Bundle bundle1 = new Bundle();
                        bundle1.putString("font", font);
                        font_frag.setArguments(bundle1);

                        fragmentTransaction.replace(R.id.frame_container, font_frag);

                        fragmentTransaction.commit();

                        Toast.makeText(MainActivity.this, " Font Clicked ", Toast.LENGTH_SHORT).show();

                        break;

                    case R.id.radioButton_color:
//
                        fragmentTransaction.replace(com.example.misikirmehari.FontChooser.R.id.frame_container, color_frag);
                        fragmentTransaction.commit();

                        Toast.makeText(MainActivity.this, " Color Clicked ", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });

    }

}


