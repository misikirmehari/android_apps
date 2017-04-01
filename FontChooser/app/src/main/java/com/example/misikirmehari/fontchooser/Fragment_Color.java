package com.example.misikirmehari.FontChooser;

import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment_style.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment_style#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_color extends Fragment {

    public Fragment_color() {
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

        final EditText editText = (EditText) getActivity().findViewById(R.id.editText);

        String colorinput = getArguments().getString("color");
        editText.setText(colorinput);


        seekBar_red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                editText.setTextColor(Color.rgb(seekBar_red.getProgress(),seekBar_green.getProgress(),seekBar_blue.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        seekBar_green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                editText.setTextColor(Color.rgb(seekBar_red.getProgress(),seekBar_green.getProgress(),seekBar_blue.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });





        seekBar_blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                editText.setTextColor(Color.rgb(seekBar_red.getProgress(),seekBar_green.getProgress(),seekBar_blue.getProgress()));
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
