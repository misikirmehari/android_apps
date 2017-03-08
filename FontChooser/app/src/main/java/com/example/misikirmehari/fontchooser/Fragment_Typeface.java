package com.example.misikirmehari.FontChooser;

import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Fragment_typeface extends Fragment {
    Typeface typefaceMono = Typeface.create(Typeface.MONOSPACE, Typeface.NORMAL);
    Typeface typefaceDefault = Typeface.create(Typeface.DEFAULT, Typeface.NORMAL);
    Typeface typefaceSerif = Typeface.create(Typeface.SERIF, Typeface.NORMAL);
    Typeface typefaceSans = Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL);
    Typeface typefaceDefaultBold = Typeface.create(Typeface.DEFAULT_BOLD, Typeface.NORMAL);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(com.example.misikirmehari.FontChooser.R.layout.fragment_fragement_typeface, container, false);


        final TextView font_txt = (TextView) view.findViewById(R.id.font_frag_text);
        String str = getArguments().getString("font");
        font_txt.setText(str);


        Button monospaceBtn = (Button) view.findViewById(R.id.monospace_font);
        Button defaultBtn = (Button) view.findViewById(R.id.default_font);
        Button serifBtn = (Button) view.findViewById(R.id.serif_font);
        Button sansSerifBtn = (Button) view.findViewById(R.id.sans_serif_font);
        Button defaultBoldBtn = (Button) view.findViewById(R.id.default_bold_font);


        monospaceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                font_txt.setTypeface(typefaceMono);
            }
        });

        defaultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                font_txt.setTypeface(typefaceDefault);
            }
        });

        defaultBoldBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                font_txt.setTypeface(typefaceDefaultBold);
            }
        });

        serifBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                font_txt.setTypeface(typefaceSerif);
            }
        });

        sansSerifBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                font_txt.setTypeface(typefaceSans);
            }
        });

        return view;


    }

}