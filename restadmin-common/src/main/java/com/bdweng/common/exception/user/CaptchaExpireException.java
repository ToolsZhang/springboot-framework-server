package com.bdweng.common.exception.user;

/**
 * 验证码失效异常类
 *
 * @author Zq
 * @version 1.0
 * @date 2021/1/20 8:18 下午
 */
public class CaptchaExpireException extends UserException {

    private static final long serialVersionUID = 1L;

    public CaptchaExpireException()
    {
        super("user.jcaptcha.expire", null);
    }
}