package com.example.misikirmehari.shakeandscream;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Build;
import android.os.Vibrator;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.security.Policy;

public class MainActivity extends AppCompatActivity {



    private boolean isLightOn = false;
    private CameraManager mCameraManager;
    private String mCameraId;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Boolean isFlashAvailable = getApplicationContext().getPackageManager()
                .hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);

        if (!isFlashAvailable) {

            AlertDialog alert = new AlertDialog.Builder(MainActivity.this)
                    .create();
            alert.setTitle("Error !!");
            alert.setMessage("Your device doesn't support flash light!");
            alert.setButton(DialogInterface.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // closing the application
                    finish();
                    System.exit(0);
                }
            });
            alert.show();
            return;
        }


        mCameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
        try {
            mCameraId = mCameraManager.getCameraIdList()[0];
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }


        // Add View Buttons
        Button Shake = (Button) findViewById(R.id.btn_vibrate);
        Button Scream = (Button) findViewById(R.id.btn_beep);
        Button ShowMeTheLight = (Button) findViewById(R.id.btn_flash);

        // Add appropriate classes
        final Vibrator shaker = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        final ToneGenerator toneG = new ToneGenerator(AudioManager.STREAM_ALARM, 100);


        // Vibrate on Click
        Shake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                shaker.vibrate(3000);

            }
        });


        // Scream or play sound on click
        Scream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                toneG.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD, 2000);

            }
        });

        ShowMeTheLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (isLightOn) {
                        turnOffFlashLight();
                        isLightOn = false;
                    } else {
                        turnOnFlashLight();
                        isLightOn = true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });


    }

    public void turnOnFlashLight() {

        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                mCameraManager.setTorchMode(mCameraId, true);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void turnOffFlashLight() {

        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                mCameraManager.setTorchMode(mCameraId, false);


            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
