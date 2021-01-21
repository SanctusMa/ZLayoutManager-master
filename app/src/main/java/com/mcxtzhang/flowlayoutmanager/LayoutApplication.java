package com.mcxtzhang.flowlayoutmanager;

import android.app.Application;

public class LayoutApplication extends Application {
    private static LayoutApplication application;

    public static LayoutApplication getInstance() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }
}
