package com.carllewis14.shoppingcart.Dependecies;

import com.carllewis14.shoppingcart.Activities.MainActivity;
import com.carllewis14.shoppingcart.Presenter.ProductPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * This interface does two things
 * lists available Dagger Modules
 * lists injectable targets
 */
@Singleton
@Component(
        modules = {
                AppModule.class,
                ShoppingCartModule.class
        }
)

public interface AppComponent {

    void inject(ProductPresenter productPresenter);
    void inject(MainActivity mainActivity);
}
