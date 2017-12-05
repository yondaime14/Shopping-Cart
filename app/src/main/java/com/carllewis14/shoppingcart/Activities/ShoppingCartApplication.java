package com.carllewis14.shoppingcart.Activities;

import android.app.Application;
import dagger.Component;
import com.carllewis14.shoppingcart.Dependecies.AppComponent;
import com.carllewis14.shoppingcart.Dependecies.AppModule;

/**
 *
 */

public class ShoppingCartApplication extends Application {

    private static ShoppingCartApplication instance = new ShoppingCartApplication();
    private static AppComponent appComponent;


    public static ShoppingCartApplication getInstance() {
        return instance;
    }



    @Override
    public void onCreate() {
        super.onCreate();
        getAppComponent();
    }

    public AppComponent getAppComponent() {
        if (appComponent == null){
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .build();
        }
        return appComponent;
    }


}
