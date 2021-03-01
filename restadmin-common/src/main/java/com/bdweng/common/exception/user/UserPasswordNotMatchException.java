package com.bdweng.common.exception.user;

/**
 * 用户密码不正确或不符合规范异常类
 *
 * @author Zq
 * @version 1.0
 * @date 2021/1/20 8:19 下午
 */
public class UserPasswordNotMatchException extends UserException {

    private static final long serialVersionUID = 1L;

    public UserPasswordNotMatchException()
    {
        super("user.password.not.match", null);
    }
}

