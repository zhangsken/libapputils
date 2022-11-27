package com.github.zhangsken.libapputils;

import android.app.Application;

public class BaseApplication extends Application {

    private static BaseApplication _mApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        _mApplication = this;
        CrashHandler.init(this);
    }

}
