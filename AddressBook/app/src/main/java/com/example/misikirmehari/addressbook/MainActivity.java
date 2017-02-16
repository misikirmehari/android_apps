package com.example.misikirmehari.addressbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button newContact = (Button) findViewById(R.id.newcontact);
        Button myContacts = (Button) findViewById(R.id.display_contact);
        final Button quitApp = (Button) findViewById(R.id.quit);

        quitApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quitApp.bo
            }
        });

    }
}
