package com.bdweng;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * web容器中进行部署
 * @author Zq
 * @version 1.0
 * @date 2021/1/19 6:47 下午
 */
public class RestAdminServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(RestAdminApplication.class);
    }
}
