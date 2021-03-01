package com.bdweng.common.exception.file;

/**
 * 文件名大小限制异常类
 *
 * @author Zq
 * @version 1.0
 * @date 2021/1/20 9:57 下午
 */
public class FileSizeLimitExceededException extends FileException {

    private static final long serialVersionUID = 1L;

    public FileSizeLimitExceededException(long defaultMaxSize) {
        super("upload.exceed.maxSize", new Object[]{defaultMaxSize});
    }
}
