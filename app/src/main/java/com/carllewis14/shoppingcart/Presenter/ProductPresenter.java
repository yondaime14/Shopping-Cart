package com.carllewis14.shoppingcart.Presenter;

import com.carllewis14.shoppingcart.Activities.ShoppingCart;
import com.carllewis14.shoppingcart.Activities.ShoppingCartApplication;
import com.carllewis14.shoppingcart.Model.LineItem;
import com.carllewis14.shoppingcart.Model.Product;

import javax.inject.Inject;

/**
 * Presenter for products
 */

public class ProductPresenter {

    //create a class member variable for
    //shopping cart to be injected
    @Inject
    ShoppingCart mCart;

    public ProductPresenter() {
        //injection occurs here
        ShoppingCartApplication.getInstance().getAppComponent().inject(this);
    }

    //
    public void onItemQuantityChanged(LineItem item, int qty) {
        mCart.updateItemQty(item, qty);
    }

    //Another example of using the shopping cart
    public void onAddToCartButtonClicked(Product product) {
        //perform add to checkout button here
        LineItem item = new LineItem(product, 1);
        mCart.addItemToCart(item);
    }

    public void onClearButtonClicked() {
        mCart.clearShoppingCart();
    }

    public void onDeleteItemButtonClicked(LineItem item) {
        mCart.removeItemFromCart(item);
    }
}
