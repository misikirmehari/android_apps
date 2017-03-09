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
import android.widget.TextView;


public class ViewContactFrag extends Fragment {

    public ViewContactFrag() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_view_contact, container, false);
        TextView name = (TextView)v.findViewById(R.id.nameview);
        TextView email = (TextView) v.findViewById(R.id.emailview);
        Button backBT = (Button) v.findViewById(R.id.BackBtn);

        String nameInput = getArguments().getString("Name");
        String emailInpu = getArguments().getString("Email");


        name.setText(nameInput);
        email.setText(emailInpu);


        backBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewContactFrag frag = new NewContactFrag();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_container,frag);
                fragmentTransaction.commit();
            }
        });


    return v;
    }



}
