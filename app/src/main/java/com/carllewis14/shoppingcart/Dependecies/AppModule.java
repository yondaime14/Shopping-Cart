package com.carllewis14.shoppingcart.Dependecies;

import android.content.Context;

import com.carllewis14.shoppingcart.Activities.ShoppingCartApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * This class will contain the Dagger annotations
 * and methods here will provide app dependecies
 */
@Module
public class AppModule {

    private final ShoppingCartApplication app;

    public AppModule(ShoppingCartApplication app) {
        this.app = app;
    }

    @Provides @Singleton
    public Context provideContext(){
        return app;
    }
}
