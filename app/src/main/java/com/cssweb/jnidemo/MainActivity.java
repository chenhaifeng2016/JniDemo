package com.cssweb.jnidemo;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.junkai.driver.ApduResponse;
import com.junkai.driver.DriverException;
import com.junkai.driver.SDDriver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    static {
        System.loadLibrary("hello-jni");

    }


    TextView tvJni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nfcwrapper nfcw = new nfcwrapper();
        String s = nfcw.stringFromJNI();

        tvJni = (TextView) findViewById(R.id.tvJniString);
        tvJni.setText(s);


    }





}
