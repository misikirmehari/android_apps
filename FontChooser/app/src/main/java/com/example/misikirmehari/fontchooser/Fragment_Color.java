package com.example.misikirmehari.FontChooser;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment_Style.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment_Style#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Color extends Fragment {

    public Fragment_Color() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(com.example.misikirmehari.FontChooser.R.layout.fragment_fragment_color, container, false);

        final SeekBar seekBar_red = (SeekBar) view.findViewById(R.id.seekbar_red);

        final SeekBar seekBar_green = (SeekBar) view.findViewById(R.id.seekbar_green);

        final SeekBar seekBar_blue  = (SeekBar) view.findViewById(R.id.seekbar_blue);

        final TextView v = (TextView) view.findViewById(R.id.color_frag_text);



        seekBar_red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                v.setTextColor(Color.rgb(seekBar_red.getProgress(),seekBar_green.getProgress(),seekBar_blue.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });







        return  view ;
    }


}
