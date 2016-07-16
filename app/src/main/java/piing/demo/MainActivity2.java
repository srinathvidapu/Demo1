package piing.demo;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.CpuUsageInfo;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.gson.Gson;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

/**
 * Created by Srinath on 16/07/16.
 */
public class MainActivity2 extends MainActivity {


//    @Inject
//    OkHttpClient mOkHttpClient;
//    @Inject
//    SharedPreferences sharedPreferences;
//    @Inject
//    Application myApp;
//    @Inject
//    Gson mGson;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String version=Build.VERSION.CODENAME;
        Log.e("codename",version);

        String version1=Build.VERSION.INCREMENTAL;
        Log.e("INCREMENTAL",version1);

        String RELEASE=Build.VERSION.RELEASE;
        Log.e("RELEASE",RELEASE);

        int SDK_INT=Build.VERSION.SDK_INT;
        Log.e("SDK_INT",SDK_INT+"");

        String SDK=Build.VERSION.SDK;
        Log.e("SDK",SDK);


        String BOARD=Build.BOARD;
        Log.e("BOARD",BOARD);

        String BOOTLOADER=Build.BOOTLOADER;
        Log.e("BOOTLOADER",BOOTLOADER);


        String BRAND=Build.BRAND;
        Log.e("BRAND",BRAND);


        String DEVICE=Build.DEVICE;
        Log.e("DEVICE",DEVICE);

        String DISPLAY=Build.DISPLAY;
        Log.e("DISPLAY",DISPLAY);


        String FINGERPRINT=Build.FINGERPRINT;
        Log.e("FINGERPRINT",FINGERPRINT);

        String getRadioVersion=Build.getRadioVersion();
        Log.e("getRadioVersion",getRadioVersion);

        String HARDWARE=Build.HARDWARE;
        Log.e("HARDWARE",HARDWARE);


        String USER=Build.USER;
        Log.e("USER",USER);


        String HOST=Build.HOST;
        Log.e("HOST",HOST);


        String ID=Build.ID;
        Log.e("ID",ID);

        String MANUFACTURER=Build.MANUFACTURER;
        Log.e("MANUFACTURER",MANUFACTURER);


        String MODEL=Build.MODEL;
        Log.e("MODEL",MODEL);


        long TIME=Build.TIME;
        Log.e("TIME",TIME+"");






        Iterable<String> iterable= Splitter.on(",")
                .trimResults()
               .omitEmptyStrings()
                .split(",foo,bar,,   qux,");

        int i=0;
        for(String a:iterable)
        {
            Log.e("ite",a+""+(i+1));
        }




       // ((MyApp)getApplication()).getNetComponent().inject(this);

        if(mOkHttpClient!=null)
        {
            Log.e("called","okhttp");
        }

        if(sharedPreferences!=null)
        {
            Log.e("called","shaed");
        }

        if(myApp!=null)
        {
            Log.e("called","app");
        }

        if(mGson!=null)
        {
            Log.e("called","gson");

        }



    }
}
