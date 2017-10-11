package com.thachershields.hw4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import java.io.BufferedReader;
import org.apache.commons.io.*;


public class MainActivity extends AppCompatActivity {

    EditText    txtKeyword;
    Button      btnSearch;
    ImageView   imgMain;

    ImageButton btnPrev;
    ImageButton btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtKeyword  = (EditText)findViewById(R.id.txtKeyword);
        btnSearch   = (Button)findViewById(R.id.btnSearch);
        imgMain     = (ImageView)findViewById(R.id.imgMain);
        btnPrev     = (ImageButton)findViewById(R.id.btnPrev);
        btnNext     = (ImageButton)findViewById(R.id.btnNext);

    }

    private boolean isConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo == null || !networkInfo.isConnected() ||
                (networkInfo.getType() != ConnectivityManager.TYPE_WIFI
                        && networkInfo.getType() != ConnectivityManager.TYPE_MOBILE)) {
            return false;
        }
        return true;
    }

}
