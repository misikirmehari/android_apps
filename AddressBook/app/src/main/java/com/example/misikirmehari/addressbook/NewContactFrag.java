package com.example.misikirmehari.addressbook;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link NewContactFrag.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link NewContactFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewContactFrag extends Fragment {


    public NewContactFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_new_contact, container, false);

        Button hel = (Button) v.findViewById(R.id.save_btn);

        hel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return v;
    }


}
