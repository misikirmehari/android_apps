package com.example.misikirmehari.addressbook;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


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

        View v =inflater.inflate(R.layout.fragment_new_contact, container, false);


        // UI Views

        final EditText NameET = (EditText)v.findViewById(R.id.editTextName);
        final EditText EmailET = (EditText) v.findViewById(R.id.editTextEmail);
        Button saveBT = (Button) v.findViewById(R.id.save_btn);


        saveBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameinput = NameET.getText().toString();
                String emailinput = EmailET.getText().toString();

                ViewContactFrag frag = new ViewContactFrag();
                FragmentManager fm=getFragmentManager();

                FragmentTransaction ft=fm.beginTransaction();

                Bundle newContactBundle = new Bundle();
                newContactBundle.putString("Name",nameinput);
                newContactBundle.putString("Email",emailinput);

                frag.setArguments(newContactBundle);
                ft.replace(R.id.frame_container, frag);
                ft.commit();



            }
        });






    return v;

    }


}
