package piing.demo;

import android.app.Application;
import android.net.IpPrefix;
import android.util.Log;

/**
 * Created by Srinath on 15/07/16.
 */
public class MyApp extends Application{

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        Log.e("called","myapp");

        // Dagger%COMPONENT_NAME%
        mNetComponent = DaggerNetComponent.builder()
                // list of modules that are part of this component need to be created here too
                // This also corresponds to the name of your module: %component_name%Module
                .netModule(new NetModule())
                .appModule(new AppModule(this))
                .build();

        // If a Dagger 2 component does not have any constructor arguments for any of its modules,
        // then we can use .create() as a shortcut instead:
        //  mAppComponent = com.codepath.dagger.components.DaggerNetComponent.create();
    }

    public NetComponent getNetComponent() {
        Log.e("called","getNetComponent");
        return mNetComponent;
    }




}