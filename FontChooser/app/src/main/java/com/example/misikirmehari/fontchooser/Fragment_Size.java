package com.example.misikirmehari.FontChooser;

import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.IntegerRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Fragment_size extends Fragment {
    // TODO: Rename parameter arguments, choose names that match


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(com.example.misikirmehari.FontChooser.R.layout.fragment_fragment_size, container, false);



        final EditText editText = (EditText) view.findViewById(R.id.font_size_txt);
        Button button = (Button) view.findViewById(R.id.submit_button);



        final TextView textView = (TextView) view.findViewById(R.id.size_frag_text);



        String input = getArguments().getString("size");
        textView.setText(input);



        button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        String value = editText.getText().toString();
        textView.setTextSize(Integer.parseInt(value));
    }
});





    return view;


    }
}
