package com.bdweng.common.exception.file;

/**
 * 文件名称超长限制异常类
 *
 * @author Zq
 * @version 1.0
 * @date 2021/1/20 9:56 下午
 */
public class FileNameLengthLimitExceededException extends FileException {

    private static final long serialVersionUID = 1L;

    public FileNameLengthLimitExceededException(int defaultFileNameLength) {
        super("upload.filename.exceed.length", new Object[]{defaultFileNameLength});
    }
}
