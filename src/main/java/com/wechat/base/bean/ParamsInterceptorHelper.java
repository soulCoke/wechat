package com.wechat.base.bean;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**  
 * @Title: ParamsInterceptorHelper.java  
 * @Package com.wechat.base.bean  
 * @Description:请求参数拦截
 * @author yuanliyang
 * @date 2018年5月5日 下午11:42:19  
 * @version V1.0  
*/  
public class ParamsInterceptorHelper {
	private static final Logger logger = LoggerFactory.getLogger(ParamsInterceptorHelper.class);

	/**   
	 *
	 * @author yuanliyang  
	 * @param request        
	 */
	public static void interceporParams(HttpServletRequest request) {
		Enumeration<String> enums = request.getParameterNames();
		logger.info("URL=" + request.getRequestURI());
		while (enums.hasMoreElements()) {
			String paramName = (String) enums.nextElement();
			String[] values = request.getParameterValues(paramName);
			for (int i = 0; i < values.length; i++) {
				logger.info("<<<<<<<请求参数：[" + i + "]   " + paramName + "=" + values[i] + ">>>>>>>");
			}
		}
	}
}
