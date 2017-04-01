package com.example.misikirmehari.FontChooser;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    /**
     * Called when the activity is first created.
     */
    String Text, size_txt, font, color;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.misikirmehari.FontChooser.R.layout.activity_main);


        final Button doneButton = (Button) findViewById(R.id.doneButton);

        final EditText editText = (EditText) findViewById(R.id.editText);


        Intent intent = getIntent();
        final String info = intent.getStringExtra(Intent.EXTRA_TEXT);


        if (info != null) {

            doneButton.setVisibility(View.VISIBLE);
            editText.setVisibility(View.INVISIBLE);

        } else {

            doneButton.setVisibility(View.INVISIBLE);

        }


        final RadioGroup radioGroup = (RadioGroup) findViewById(com.example.misikirmehari.FontChooser.R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                final Fragment_size size_frag = new Fragment_size();
                Fragment_style style_frag = new Fragment_style();
                Fragment_typeface font_frag = new Fragment_typeface();
                Fragment_color color_frag = new Fragment_color();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();


                switch (i) {
                    case com.example.misikirmehari.FontChooser.R.id.radioButton_style:

                        if (info != null) {
                            Text = info;
                            editText.setText(Text);
                            editText.setVisibility(View.VISIBLE);
                        } else
                            Text = editText.getText().toString();


                        Bundle bundle = new Bundle();
                        bundle.putString("main", Text);
                        style_frag.setArguments(bundle);
                        fragmentTransaction.replace(com.example.misikirmehari.FontChooser.R.id.frame_container, style_frag);
                        fragmentTransaction.commit();


                        Toast.makeText(MainActivity.this, "Style Clicked ", Toast.LENGTH_SHORT).show();
                        break;

                    case com.example.misikirmehari.FontChooser.R.id.radioButton_size:
//
                        if (info != null) {
                            size_txt = info;
                            editText.setText(size_txt);
                            editText.setVisibility(View.VISIBLE);
                        } else
                            size_txt = editText.getText().toString();


                        Bundle sizeBundle = new Bundle();
                        sizeBundle.putString("size", size_txt);
                        size_frag.setArguments(sizeBundle);
                        fragmentTransaction.replace(com.example.misikirmehari.FontChooser.R.id.frame_container, size_frag);
                        fragmentTransaction.commit();
                        Toast.makeText(MainActivity.this, " Size Clicked", Toast.LENGTH_SHORT).show();
                        break;

                    case com.example.misikirmehari.FontChooser.R.id.radioButton_font:


                        if (info != null) {
                            font = info;
                            editText.setText(font);
                            editText.setVisibility(View.VISIBLE);

                        } else
                            font = editText.getText().toString();

                        Bundle bundle1 = new Bundle();
                        bundle1.putString("font", font);
                        font_frag.setArguments(bundle1);
                        fragmentTransaction.replace(R.id.frame_container, font_frag);
                        fragmentTransaction.commit();

                        Toast.makeText(MainActivity.this, " Font Clicked ", Toast.LENGTH_SHORT).show();

                        break;

                    case R.id.radioButton_color:


                        if (info != null) {
                            color = info;
                            editText.setText(color);
                            editText.setVisibility(View.VISIBLE);
                        } else
                            color = editText.getText().toString();
//
                        Bundle color_bundle = new Bundle();
                        color_bundle.putString("color", color);
                        color_frag.setArguments(color_bundle);

                        fragmentTransaction.replace(com.example.misikirmehari.FontChooser.R.id.frame_container, color_frag);
                        fragmentTransaction.commit();

                        Toast.makeText(MainActivity.this, " Color Clicked ", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });


        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();

                // Works
                intent.putExtra("DATA", editText.getText().toString());

                // Works
                intent.putExtra("SIZE", editText.getTextSize());


                intent.putExtra("COLOR",editText.getCurrentTextColor());

                intent.putExtra("STYLE",editText.getTypeface().toString());

                intent.putExtra("FONT", editText.getTypeface().toString());

                setResult(Activity.RESULT_OK, intent);

                finish();

                Toast.makeText(MainActivity.this, "Done clicked ", Toast.LENGTH_SHORT).show();
            }
        });


    }

}


