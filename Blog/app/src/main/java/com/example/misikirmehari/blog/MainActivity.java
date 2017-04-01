package com.example.misikirmehari.blog;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.function.ToDoubleBiFunction;

public class MainActivity extends AppCompatActivity {
    final static int EDIT_BLOG_REQUEST = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button SendButton = (Button) findViewById(R.id.send_btn);
        final EditText InputText = (EditText) findViewById(R.id.edit_text);

        Button ShareButton = (Button) findViewById(R.id.share_blog_btn);


        SendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_EDIT);
                String test1 = InputText.getText().toString();
                sendIntent.putExtra(Intent.EXTRA_TEXT, test1);
                sendIntent.setType("text/plain");
                startActivityForResult(sendIntent, EDIT_BLOG_REQUEST);
                Toast.makeText(MainActivity.this, "send button clicked", Toast.LENGTH_SHORT).show();

            }
        });


        ShareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);

                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, InputText.getText());
                startActivity(Intent.createChooser(sharingIntent,"Send using"));
            }
        });
    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == EDIT_BLOG_REQUEST) {

            if (resultCode == RESULT_OK) {

                // TODO: 3/29/17  Add key to the result intent
                EditText InputText = (EditText) findViewById(R.id.edit_text);

                InputText.setText(data.getExtras().getString("DATA"));

                InputText.setTextSize(data.getFloatExtra("SIZE", 0f));

                // InputText.setTypeface((Typeface) data.getExtras().getString("STYLE"));

                // InputText.setTypeface((Typeface) data.getExtras().getString("FONT"));

                InputText.setTextColor(data.getIntExtra("COLOR", 0));


            }
        }
    }


}
