package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("LifeCycle", "OnCreate() invoked");

        TextView txtVMsg2 = findViewById(R.id.TVMsg2);
        txtVMsg2.setText(R.string.Msg2);

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("LifeCycle", "OnStart() invoked");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("LifeCycle", "OnRestart() invoked");
    }

    @Override
    protected  void onResume(){
        super.onResume();

        Log.i("LifeCycle", "OnResume() invoked");
    }

    @Override
    protected void onPause(){
        super.onPause();

        Log.i("LifeCycle", "OnPause() invoked");
    }

    @Override
    protected  void onStop(){
        super.onStop();

        Log.i("LifeCycle", "OnStop() invoked");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        Log.i("LifeCycle", "OnDestroy() invoked");
    }

}