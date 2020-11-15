package com.app.architectureexample.di.module;

import com.app.architectureexample.view.ui.fragments.ProductList;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract ProductList contributeProductListFragment();

}
