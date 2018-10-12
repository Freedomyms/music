package com.yangms.music.common;

import android.app.Application;
import android.content.Context;

import com.yangms.music.utils.SPUtils;

/**
 * Created by admin on 2018/10/12.
 */

public class MusicApplication extends Application {

    public static MusicApplication MyInstance;
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        MyInstance = this;
        context = getApplicationContext();
        SPUtils.init(context);
    }

    public static Context getContextObject() {
        return context;
    }

    public static MusicApplication getMyInstance() {
        return MyInstance;
    }
}
