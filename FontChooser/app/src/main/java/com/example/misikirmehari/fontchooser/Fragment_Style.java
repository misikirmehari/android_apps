package com.example.misikirmehari.FontChooser;

import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment_style.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment_style#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_style extends android.app.Fragment {


    // Declaring and assigning the type face object
    final Typeface typeface_bold = Typeface.create("",Typeface.BOLD);
    final Typeface typeface_bold_italic = Typeface.create("",Typeface.BOLD_ITALIC);
    final Typeface typeface_italic = Typeface.create("",Typeface.ITALIC);
    final Typeface typeface_normal = Typeface.create("",Typeface.NORMAL);





    public Fragment_style() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_fragment_style, container, false);

        final TextView textView = (TextView) view.findViewById(R.id.style_frag_text);

        String txt = getArguments().getString("main");

        textView.setText(txt);

        final Button Bold = (Button) view.findViewById(R.id.bold);

        final Button Bold_Italic = (Button) view.findViewById(R.id.bold_italic);

        final Button Italic = (Button) view.findViewById(R.id.italic);

        final Button Normal = (Button) view.findViewById(R.id.normal);


        Bold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTypeface(typeface_bold);
            }
        });

        Bold_Italic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTypeface(typeface_bold_italic);
            }
        });

        Italic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTypeface(typeface_italic);
            }
        });

        Normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTypeface(typeface_normal);
            }
        });

        return view;

        // Inflate the layout for this fragment

    }


}
