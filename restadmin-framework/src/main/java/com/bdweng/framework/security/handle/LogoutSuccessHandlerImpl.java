package com.bdweng.framework.security.handle;

import com.alibaba.fastjson.JSON;
import com.bdweng.common.constant.Constants;
import com.bdweng.common.constant.HttpStatus;
import com.bdweng.common.core.domain.AjaxResult;
import com.bdweng.common.core.domain.model.LoginUser;
import com.bdweng.common.utils.ServletUtils;
import com.bdweng.common.utils.StringUtils;
import com.bdweng.framework.manager.AsyncManager;
import com.bdweng.framework.manager.factory.AsyncFactory;
import com.bdweng.framework.web.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义退出处理类 返回成功
 *
 * @author Zq
 * @version 1.0
 * @date 2021/1/21 11:49 上午
 */
@Configuration
public class LogoutSuccessHandlerImpl implements LogoutSuccessHandler {

    @Autowired
    private TokenService tokenService;

    /**
     * 退出处理
     *
     * @return
     */
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException, ServletException {
        LoginUser loginUser = tokenService.getLoginUser(request);
        if (StringUtils.isNotNull(loginUser)) {
            String userName = loginUser.getUsername();
            // 删除用户缓存记录
            tokenService.delLoginUser(loginUser.getToken());
            // 记录用户退出日志
            AsyncManager.me().execute(AsyncFactory.recordLogininfor(userName, Constants.LOGOUT, "退出成功"));
        }
        ServletUtils.renderString(response, JSON.toJSONString(AjaxResult.error(HttpStatus.SUCCESS, "退出成功")));
    }
}
