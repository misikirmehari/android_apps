package com.example.misikirmehari.FontChooser;

import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.View.VISIBLE;


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



        final String txt = getArguments().getString("main");


        final Button Bold = (Button) view.findViewById(R.id.bold);

        final Button Bold_Italic = (Button) view.findViewById(R.id.bold_italic);

        final Button Italic = (Button) view.findViewById(R.id.italic);

        final Button Normal = (Button) view.findViewById(R.id.normal);

        final EditText editText = (EditText)getActivity().findViewById(R.id.editText);




        Bold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                editText.setText(txt);
                editText.setTypeface(typeface_bold);
            }
        });

        Bold_Italic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(txt);
                editText.setTypeface(typeface_bold_italic);




            }
        });

        Italic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(txt);
                editText.setTypeface(typeface_italic);
            }
        });


        Normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(txt);
                editText.setTypeface(typeface_normal);
            }
        });

        return view;

        // Inflate the layout for this fragment

    }


}
