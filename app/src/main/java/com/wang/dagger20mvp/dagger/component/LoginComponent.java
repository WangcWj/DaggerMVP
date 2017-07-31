package com.wang.dagger20mvp.dagger.component;

import com.wang.dagger20mvp.dagger.module.LoginModule;
import com.wang.dagger20mvp.mvp.view.MainActivity;

import dagger.Component;

/**
 * Created by WangChao on 2017/7/31.
 */
@Component(modules = LoginModule.class)
public interface LoginComponent {
    void inject(MainActivity mainActivity);
}
