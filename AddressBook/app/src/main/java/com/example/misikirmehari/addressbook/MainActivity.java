package com.example.misikirmehari.addressbook;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Add View UI and refernces
        final Button newContact = (Button) findViewById(R.id.newcontact);
        final Button myContacts = (Button) findViewById(R.id.display_contact);
        final Button quitApp = (Button) findViewById(R.id.quit);


        // Add Fragments
        final NewContactFrag newContactFrag = new NewContactFrag();
        final ViewContactFrag viewContactFrag = new ViewContactFrag();
        final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();


        // Listeners and Handlers
        quitApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        newContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction.replace(R.id.frame_container,newContactFrag);
                fragmentTransaction.commit();
            }
        });


        myContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.frame_container,viewContactFrag);
                fragmentTransaction.commit();

            }
        });

    }
}
