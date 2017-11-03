package com.watchman1976.pigmokey.mimi20171012;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.watchman1976.pigmokey.mimi20171012.coreclass.match.CurrentMatch;
import com.watchman1976.pigmokey.mimi20171012.ui.MatchActivity;

public class MainActivity extends AppCompatActivity {
    CurrentMatch currentMatch;

    public void buttonListenerForAuto(View sourceView){
        Log.d("teddy","AutoPlay");
        Intent iAuto=new Intent("com.watchman1976.pigmokey.mimi20171012.ui.MatchActivity");
        iAuto.putExtra("isAuto",true);
        startActivity(iAuto);
    }
    public void buttonListenerForManual(View sourceView){
        Log.d("teddy","ManualPlay");
        Intent iAuto=new Intent("com.watchman1976.pigmokey.mimi20171012.ui.MatchActivity");
        iAuto.putExtra("isAuto",false);
        startActivity(iAuto);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentMatch=CurrentMatch.getInstance();
    }
}
