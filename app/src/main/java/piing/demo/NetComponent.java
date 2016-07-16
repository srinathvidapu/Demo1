package piing.demo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Srinath on 15/07/16.
 */
@Singleton
@Component(modules={AppModule.class, NetModule.class})
public interface NetComponent {

  //  void inject(MainActivity2 activity);
    void inject(MainActivity fragment);
    // void inject(MyService service);
}