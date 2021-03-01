package com.bdweng.common.enums;

/**
 * 用户状态
 *
 * @author Zq
 * @version 1.0
 * @date 2021/1/20 10:32 下午
 */
public enum UserStatus {

    OK("0", "正常"), DISABLE("1", "停用"), DELETED("2", "删除");

    private final String code;
    private final String info;

    UserStatus(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
