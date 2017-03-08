package com.example.misikirmehari.addressbook;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button createNewContact = (Button) findViewById(R.id.newcontact);
        final Button viewMyContacts = (Button) findViewById(R.id.display_contact);
        final Button quitApp = (Button) findViewById(R.id.quit);



        final android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();





        quitApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        createNewContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewContactFrag frag1 = new NewContactFrag();
                ft.replace(R.id.frame_container,frag1);
                ft.commit();
            }
        });


        viewMyContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
