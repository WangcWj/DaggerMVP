package com.wang.dagger20mvp.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.wang.dagger20mvp.R;
import com.wang.dagger20mvp.dagger.component.DaggerLoginComponent;
import com.wang.dagger20mvp.dagger.module.LoginModule;
import com.wang.dagger20mvp.mvp.method.Login;
import com.wang.dagger20mvp.mvp.method.LoginResult;
import com.wang.dagger20mvp.mvp.method.LoginSuccess;
import com.wang.dagger20mvp.mvp.persenter.LoginPersenter;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements LoginSuccess{
    @Inject
    LoginPersenter loginPersenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initLoginPersenter();
        initLogin();
    }

    private void initLogin() {
        loginPersenter.login("w","Chao");
    }

    private void initLoginPersenter() {
        DaggerLoginComponent.builder()
                .loginModule(new LoginModule(this))
                .build()
                .inject(this);
    }

    @Override
    public void isSuccess(boolean isSuccess) {
        Log.e("CHAO", "isSuccess ->"+isSuccess);
    }
}
