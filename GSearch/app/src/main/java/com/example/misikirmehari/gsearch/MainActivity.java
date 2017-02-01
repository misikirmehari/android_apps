package com.example.misikirmehari.gsearch;

import android.app.FragmentManager;
import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText editTextInput;
    public final static String Input = "com.example.GSearch.MESSAGE";

    SearchFragment Fragment ;
    FragmentManager FragManager ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextInput = (EditText) findViewById(R.id.editTextInput);
        Fragment = new SearchFragment();
        FragManager = getFragmentManager();

    }

    public void onSearchClick(View v) {

        FragManager.beginTransaction().add(R.id.Frag_container, Fragment).commit();

    }
//        try {
//            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
//            String term = editTextInput.getText().toString();
//            intent.putExtra(SearchManager.QUERY, term);
//            startActivity(intent);
//        } catch (Exception e) {
//            // TODO: handle exception
//        }
//    }
}