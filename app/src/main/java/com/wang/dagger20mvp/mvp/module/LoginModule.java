package com.wang.dagger20mvp.mvp.module;


import android.util.Log;

import com.wang.dagger20mvp.mvp.method.Login;
import com.wang.dagger20mvp.mvp.method.LoginResult;

/**
 * Created by WangChao on 2017/7/31.
 */

public class LoginModule implements LoginResult{
    @Override
    public String loginResult(String userName, String userPass) {
        if("Wang".equals(userName) && "Chao".equals(userPass)){
            return "success";
        }else {
            return  "fail";
        }
    }
}
