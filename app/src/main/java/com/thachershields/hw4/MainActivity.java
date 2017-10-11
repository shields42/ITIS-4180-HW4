package com.thachershields.hw4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

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
}
