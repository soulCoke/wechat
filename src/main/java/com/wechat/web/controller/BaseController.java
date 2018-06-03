package com.wechat.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**  
 * @Title: BaseController.java  
 * @Package com.wechat.web.controller  
 * @Description:
 * @author yuanliyang
 * @date 2018年5月31日 下午2:57:01  
 * @version V1.0  
*/  
@Controller
public class BaseController {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    protected HttpServletRequest request;
    @Autowired
    protected HttpServletResponse response;

}
