package piing.demo;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/**
 * Created by Srinath on 15/07/16.
 */
@Module
public class NetModule {



    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient() {
        Log.e("called","provideOkHttpClient");
        OkHttpClient client = new OkHttpClient();
        //client.setCache(cache);

        return client;
    }


    @Provides
    @Singleton
        // Application reference must come from AppModule.class
    SharedPreferences providesSharedPreferences(Application application) {
        Log.e("called","providesSharedPreferences");
        return PreferenceManager.getDefaultSharedPreferences(application);
    }


    @Provides
    @Singleton
    Gson providesGson()
    {
        Log.e("called","providesGson");
        return new Gson();
    }




}