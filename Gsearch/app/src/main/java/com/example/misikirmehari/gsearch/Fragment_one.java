package com.example.misikirmehari.gsearch;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment_one.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment_one#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_one extends Fragment {

    public Fragment_one() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_one, container, false);
    }


}
