package com.bdweng.common.exception.file;

import com.bdweng.common.exception.BaseException;

/**
 * 文件信息异常类
 *
 * @author Zq
 * @version 1.0
 * @date 2021/1/20 9:56 下午
 */
public class FileException extends BaseException {
    
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args) {
        super("file", code, args, null);
    }

}
