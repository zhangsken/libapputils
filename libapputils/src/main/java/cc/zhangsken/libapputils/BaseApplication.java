package cc.zhangsken.libapputils;

import android.app.Application;
import cc.zhangsken.libapputils.CrashHandler;

public class BaseApplication extends Application {

    private static BaseApplication _mApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        _mApplication = this;
        CrashHandler.init(this);
    }

}
