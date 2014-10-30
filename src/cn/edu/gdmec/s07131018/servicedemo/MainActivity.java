package cn.edu.gdmec.s07131018.servicedemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void start(View view){
    	Intent intent = new Intent("cn.edu.gdmec.service");
    	startService(intent);
    }
    public void stop(View view){
    	Intent intent = new Intent("cn.edu.gdmec.service");
    	stopService(intent);
    }
}
