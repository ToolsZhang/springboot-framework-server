package com.bdweng.common.annotation;

import java.lang.annotation.*;

/**
 * 数据权限过滤注解
 *
 * @author Zq
 * @version 1.0
 * @date 2021/1/20 4:23 下午
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataScope {

    /**
     * 部门表的别名
     */
    public String deptAlias() default "";

    /**
     * 用户表的别名
     */
    public String userAlias() default "";
}
