package com.bdweng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * 启动程序
 *
 * @author Zq
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class RestAdminApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        ApplicationContext context = SpringApplication.run(RestAdminApplication.class, args);
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("(♥◠‿◠)ﾉﾞ  RestAdmin启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "    ____            __  ___       __          _          \n" +
                "   / __ \\___  _____/ /_/   | ____/ /___ ___  (_)____      \n" +
                "  / /_/ / _ \\/ ___/ __/ /| |/ __  / __ `__ \\/ / __  \\     \n" +
                " / _, _/ ___(__  / /_/ ___ / /_/ / / / / / / / / / /     \n" +
                "/_/ |_|\\___/____/ \\_/_/  |_ \\_,_/_/ /_/ /_/_/_/ /_/  ");
    }
}
