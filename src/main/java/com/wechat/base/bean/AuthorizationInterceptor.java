package com.wechat.base.bean;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wechat.common.utils.StringUtils4JM;

/**
 * @Title: AuthorizationInterceptor.java
 * @Package com.wechat.base.bean
 * @Description:拦截器
 * @author yuanliyang
 * @date 2018年5月5日 下午11:57:02
 * @version V1.0
 */
@Component
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {
    private final static Logger logger = LoggerFactory.getLogger(AuthorizationInterceptor.class);
    private static final String POST = "post";
    private static final String GET = "get";

    private static final String JSON_CONTENT_TYPE = "application/json; charset=utf-8";

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, org.springframework.web.servlet.ModelAndView modelAndView) throws Exception {

    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
	String method = request.getMethod();
	ParamsInterceptorHelper.interceporParams(request);
	return true;

    }

    public static void responseException(HttpServletResponse response, ResResponse ejo) {
	try {
	    ObjectMapper objectMapper = new ObjectMapper();
	    objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
	    if (StringUtils4JM.isBlank(ejo.getCode())) {
		ejo.setCode(ResConstants.SUCCESS.getCode());
	    }
	    if (StringUtils4JM.isBlank(ejo.getMsg())) {
		ejo.setMsg(ResConstants.SUCCESS.getMsg());
	    }
	    if (ejo.getTotalCount() != null && ejo.getTotalCount() == 0 && ejo.getObjs() == null) {
		ejo.setObjs(new ArrayList<>());
	    }
	    String exJson = objectMapper.writeValueAsString(ejo);
	    response.setContentType(JSON_CONTENT_TYPE);
	    response.setCharacterEncoding(Constants.COMMON_CHARSET_UTF8_NAME);
	    response.getWriter().write(exJson);
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}
