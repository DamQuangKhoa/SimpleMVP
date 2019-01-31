package in.androidmate.anujgupta.movify;

import android.app.Application;

import in.androidmate.anujgupta.movify.di.components.ApplicationComponent;
import in.androidmate.anujgupta.movify.di.components.DaggerApplicationComponent;
import in.androidmate.anujgupta.movify.di.modules.ApplicationModule;


public class MyApplication extends Application {

    private static ApplicationComponent applicationComponent;

      public MyApplication(){

      }

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent
                                .builder()
                                .applicationModule(new ApplicationModule(this))
                                .build();

    }

    public ApplicationComponent getApplicationComponent(){
          return applicationComponent;
      }

}
