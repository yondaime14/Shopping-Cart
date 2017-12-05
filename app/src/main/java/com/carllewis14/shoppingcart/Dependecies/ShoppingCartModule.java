package com.carllewis14.shoppingcart.Dependecies;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.carllewis14.shoppingcart.Activities.ShoppingCart;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Provides the instances for the ShoppingCart
 */
@Module
public class ShoppingCartModule {

    @Provides @Singleton
    SharedPreferences providesSharedPref(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides @Singleton
    ShoppingCart providesShoppingCart(SharedPreferences sharedPreferences){
        return new ShoppingCart(sharedPreferences);
    }


}
