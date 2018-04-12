package org.kasapbasi.week08002;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by mcemkasapbasi on 12.04.2018.
 */

public class MyRecevier extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context," ALDIM % received",Toast.LENGTH_LONG).show();
    }
}
