package com.watchman1976.pigmokey.mimi20171012;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.watchman1976.pigmokey.mimi20171012.coreclass.match.CurrentMatch;

public class MainActivity extends AppCompatActivity {
    Button buttonAutoMatch,buttonManualMatch;
    CurrentMatch currentMatch;
    void initialize(){
        currentMatch = CurrentMatch.getInstance();

        buttonAutoMatch = (Button)findViewById(R.id.buttonAuto);
        buttonManualMatch = (Button)findViewById(R.id.buttonManualMatch);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }
}
