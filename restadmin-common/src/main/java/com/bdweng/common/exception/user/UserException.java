package com.bdweng.common.exception.user;

import com.bdweng.common.exception.BaseException;

/**
 * TODO
 *
 * @author Zq
 * @version 1.0
 * @date 2021/1/20 8:17 下午
 */
public class UserException extends BaseException {

    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}