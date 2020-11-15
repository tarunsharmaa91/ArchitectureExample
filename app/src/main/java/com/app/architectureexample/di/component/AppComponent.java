package com.app.architectureexample.di.component;

import android.app.Application;

import com.app.architectureexample.Arch;
import com.app.architectureexample.di.module.MainActivityModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        MainActivityModule.class
})
public interface AppComponent {
    void inject(Arch arch);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
}
