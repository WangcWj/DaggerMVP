package com.wang.dagger20mvp.mvp.persenter;

import android.util.Log;

import com.wang.dagger20mvp.dagger.component.DaggerLoginResultComponent;
import com.wang.dagger20mvp.mvp.method.Login;
import com.wang.dagger20mvp.mvp.method.LoginResult;
import com.wang.dagger20mvp.mvp.method.LoginSuccess;
import com.wang.dagger20mvp.mvp.module.LoginModule;

import javax.inject.Inject;

/**
 * Created by WangChao on 2017/7/31.
 */

public class LoginPersenter implements Login {
    LoginSuccess loginResult;
    @Inject
    LoginModule loginModule;

    public LoginPersenter(LoginSuccess loginResult) {
        this.loginResult = loginResult;
        DaggerLoginResultComponent.builder()
                .loginModule(new com.wang.dagger20mvp.dagger.module.LoginModule())
                .build()
                .inject(this);
    }

    @Override
    public void login(String userName, String userPass) {
        String s = loginModule.loginResult(userName, userPass);
         Log.e("CHAO", "login ->"+s);
        loginResult.isSuccess("success".equals(s));
    }
}
