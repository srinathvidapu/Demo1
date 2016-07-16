package piing.demo;

import android.app.Application;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Srinath on 15/07/16.
 */
@Module
public class AppModule {

    Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }



    @Provides
    @Singleton
    Application providesApplication() {
        return mApplication;
    }


}