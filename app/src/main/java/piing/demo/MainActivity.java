package piing.demo;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.IpPrefix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {


    @Inject
    OkHttpClient mOkHttpClient;
    @Inject
    SharedPreferences sharedPreferences;
    @Inject
    Application myApp;
    @Inject
    Gson mGson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((MyApp) getApplication()).getNetComponent().inject(this);

        if (mOkHttpClient != null) {
            Log.e("called", "okhttp");
        } else {
            Log.e("called", "ca");
        }

        if (sharedPreferences != null) {
            Log.e("called", "shaed");
        } else {
            Log.e("called", "ca");
        }

        if (myApp != null) {
            Log.e("called", "app");
        } else {
            Log.e("called", "ca");
        }

        if (mGson != null) {
            Log.e("called", "gson");

        } else {
            Log.e("called", "ca");
        }

    }
}
