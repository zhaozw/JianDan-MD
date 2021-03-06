package com.example.coder.jiandan_md.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * Created by coder on 16/9/22.
 */
public class PackageUtil {

    public static String getVersionName(Context context) {

        String version = "";

        try {
            // 获取packagemanager的实例
            PackageManager packageManager = context.getPackageManager();

            // getPackageName()是你当前类的包名，0代表是获取版本信息
            PackageInfo packInfo = packageManager.getPackageInfo(context.getPackageName(),0);

            version = packInfo.versionName;

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        return version;
    }
}
