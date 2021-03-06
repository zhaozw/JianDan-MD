package com.example.coder.jiandan_md.util;

import android.os.Environment;

import java.io.File;
import java.util.Random;

/**
 * Created by coder on 16/9/21.
 */
public class CacheUtil {
    public static final String FILE_SAVE = "JianDanMD";

    /**
     * 获取保存图片的名称
     * @param cacheFile
     * @param urls
     * @return
     */
    public static String getSharePicName(File cacheFile, String[] urls) {
        return cacheFile.getAbsolutePath() + new Random().nextInt(100000) + "." + urls[urls
                .length - 1];
    }


    /**
     * 获取图片保存文件夹路径
     *
     * @return
     */
    public static String getSaveDirPath() {
        return Environment
                .getExternalStorageDirectory().getAbsolutePath() + File.separator + FILE_SAVE;
    }


    /**
     * 获取新的图片保存名称
     *
     * @param cacheFile
     * @param urls
     * @return
     */
    public static String getSavePicName(File cacheFile, String[] urls) {
        return "jiandan_" + cacheFile.getName().substring(0, 8) + "." +
                urls[urls.length - 1];
    }
}
