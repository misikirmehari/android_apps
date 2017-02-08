package com.example.misikirmehari.gsearch;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String TAG = "MAINACTIVITY";



    /** Called when the activity is first created. */


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Log.i(TAG,"CHECKED Listener");

                Fragment_Two cnn_news_frag = new Fragment_Two();
                Fragment_one breaking_news_frag = new Fragment_one();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();



                switch (i){
                    case R.id.radioButton_breaking:


                        fragmentTransaction.replace(R.id.frame_container,breaking_news_frag,"breaking");
                        fragmentTransaction.commit();


                        Toast.makeText(MainActivity.this, " Breaking news checked", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.radioButton_cnn:
//                        if(!fragmentTransaction.isEmpty()){
//                            fragmentTransaction.remove(breaking_news_frag);
//                            Log.i("transaction is empty", TAG);
//                        }

                        fragmentTransaction.replace(R.id.frame_container,cnn_news_frag);
                        fragmentTransaction.commit();

                        Toast.makeText(MainActivity.this, " cnn news checked", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });

    }


   // TODO:










//    public void onSearchClick(View v)
//    {
//
//        String term = editTextInput.getText().toString();
//        String url = "https://newsapi.org/v1/articles/?source="+term+"&apiKey=b88d1a7d390e45e4bb74cfecc1c1246d";
//
//        try {
//            Intent intent = new Intent(Intent.ACTION_VIEW);
//            intent.setData(Uri.parse(url));
//            startActivity(intent);
//        } catch (Exception e) {
//            // TODO: handle exception
//        }
//
//    }
}


//b88d1a7d390e45e4bb74cfecc1c1246d