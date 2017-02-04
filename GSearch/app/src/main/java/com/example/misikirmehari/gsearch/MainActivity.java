package com.example.misikirmehari.gsearch;

import android.app.FragmentManager;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText editTextInput;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextInput = (EditText) findViewById(R.id.editTextInput);
    }

    public void onSearchClick(View v)
    {

        String term = editTextInput.getText().toString();
        String url = "https://newsapi.org/v1/articles/?source="+term+"&apiKey=b88d1a7d390e45e4bb74cfecc1c1246d";

        try {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}


//b88d1a7d390e45e4bb74cfecc1c1246d