package org.kasapbasi.week08002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MyAction(View v){

        Intent myInt = new Intent();
        myInt.setAction("org.kasapbasi.week08002.MYCUSTOM_INTENT");
        sendBroadcast(myInt);

    }
}
