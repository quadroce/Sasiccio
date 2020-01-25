package com.example.tamil;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //private static final int REQUEST_CALL=1;
    //private EditText mEditTextNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer kunda1=MediaPlayer.create(this, R.raw.kundapaya);
        final MediaPlayer suono1 = MediaPlayer.create(this, R.raw.test);
        final MediaPlayer perieMole1 = MediaPlayer.create(this,R.raw.periemole);
        final MediaPlayer hotta1 = MediaPlayer.create(this, R.raw.hotta);
        final MediaPlayer cinnasutu1 = MediaPlayer.create(this,R.raw.cinnasutu);
       // Button buttonToccami = findViewById(R.id.toccami);
        Button buttonPerie = findViewById(R.id.periemolePush);
        Button buttonCinna = findViewById(R.id.cinnasutuButton);
        Button buttonHotta = findViewById(R.id.hottaButton);
        Button buttonKunda = findViewById(R.id.kundaButton);
       // Switch SwitchStop = findViewById(R.id.switch1);

        /*

        imagecall.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             makePhoneCall();
                                         }
                                     }
        );*/

        /*buttonToccami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suono1.start();
            }
        });*/
        buttonCinna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cinnasutu1.start();
            }
        });

        buttonPerie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perieMole1.start();
            }
        });

        buttonKunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kunda1.start();
            }
        });
        buttonPerie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perieMole1.start();
            }
        });
        buttonHotta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hotta1.start();
            }
        });


    }

}

       /*private void makePhoneCall() {
            String number = mEditTextNumber.getText().toString();
            if (number.trim().length() > 0) {

                if (ContextCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(MainActivity.this,
                            new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    String dial = "tel:" + number;
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                }

            } else {
                Toast.makeText(MainActivity.this, "Enter Phone Number", Toast.LENGTH_SHORT).show();
            }
        }

    @Override*/
    /*public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                makePhoneCall();
            } else {
                Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
            }
        }
    }*/

