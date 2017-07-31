package com.wang.dagger20mvp.dagger.module;

import com.wang.dagger20mvp.mvp.method.Login;
import com.wang.dagger20mvp.mvp.method.LoginResult;
import com.wang.dagger20mvp.mvp.method.LoginSuccess;
import com.wang.dagger20mvp.mvp.persenter.LoginPersenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by WangChao on 2017/7/31.
 */
@Module
public class LoginModule {
    LoginSuccess login;
    public LoginModule(LoginSuccess login) {
        this.login = login;
    }

    public LoginModule() {
    }

    @Provides
    public LoginPersenter getLoginPersenter() {
        return new LoginPersenter(login);
    }
    @Provides
    public com.wang.dagger20mvp.mvp.module.LoginModule getLoginModule(){
        return  new com.wang.dagger20mvp.mvp.module.LoginModule();
    }
}
