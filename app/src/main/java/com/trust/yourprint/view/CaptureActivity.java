package com.trust.yourprint.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.trust.yourprint.R;

import org.opencv.android.OpenCVLoader;

public class CaptureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture);

        if (OpenCVLoader.initDebug()) {
            Toast.makeText(getApplicationContext(), "OpenCV cargo ctmre!!!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "OpenCV no cargo ctmre!!!", Toast.LENGTH_LONG).show();
        }

    }
}
