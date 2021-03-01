package com.bdweng.common.utils;

/**
 * 处理并记录日志文件
 *
 * @author Zq
 * @version 1.0
 * @date 2021/1/20 8:28 下午
 */
public class LogUtils {

    public static String getBlock(Object msg) {
        if (msg == null) {
            msg = "";
        }
        return "[" + msg.toString() + "]";
    }
}
