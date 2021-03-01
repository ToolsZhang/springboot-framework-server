package com.bdweng.common.exception.user;

/**
 * 验证码错误异常类
 *
 * @author Zq
 * @version 1.0
 * @date 2021/1/20 8:15 下午
 */
public class CaptchaException extends UserException {

    private static final long serialVersionUID = 1L;

    public CaptchaException()
    {
        super("user.jcaptcha.error", null);
    }

}
