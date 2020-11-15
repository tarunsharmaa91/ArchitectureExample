package com.app.architectureexample.view.ui.common;

import androidx.fragment.app.FragmentManager;

import com.app.architectureexample.R;
import com.app.architectureexample.view.ui.MainActivity;
import com.app.architectureexample.view.ui.fragments.ProductList;

import javax.inject.Inject;

public class NavigationController {

    private final int containerId;
    private final FragmentManager fragmentManager;

    @Inject
    public NavigationController(MainActivity mainActivity) {
        containerId = R.id.fragmentContainer;
        fragmentManager = mainActivity.getSupportFragmentManager();
    }

    public void navigateToProductListFragment(){
        ProductList productListFragment = new ProductList();
        fragmentManager.beginTransaction().replace(containerId, productListFragment).commitAllowingStateLoss();
    }
}
