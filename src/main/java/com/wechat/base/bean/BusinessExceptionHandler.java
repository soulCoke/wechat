package com.wechat.base.bean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.wechat.base.exception.CommonException;

/**
 * <pre>
 * @Package com.jiumai.carnet.base.bean
 * @ClassName: BusinessException 
 * @Description: 业务处理异常类
 * @author 冯建权 
 * @date 2015年9月29日 下午1:01:12 
 * @Right 版权归上海九脉信息技术有限公司所有
 * @Version 1.0
 * </pre>
 */
public class BusinessExceptionHandler extends CommonException implements HandlerExceptionResolver {
	private static final long serialVersionUID = -3842098054213794497L;
	private final Logger logger = LoggerFactory.getLogger(BusinessExceptionHandler.class);

	public BusinessExceptionHandler() {
		super();
	}

	public BusinessExceptionHandler(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
		logger.info("异常日志==^_^==code=[" + code + "],msg=[" + msg + "]");
	}

	public BusinessExceptionHandler(ResConstants res) {
		super();
		this.code = res.getCode();
		this.msg = res.getMsg();
		logger.info("异常日志==^_^==code=[" + code + "],msg=[" + msg + "]");
	}

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		logger.info("全局异常：" + handler);
		// handler就是处理器适配器要执行的Handler对象(只有method)
		// 解析出异常类型。
		// 如果该 异常类型是系统 自定义的异常，直接取出异常信息，在错误页面展示。
		BusinessException customException = null;
		if (ex instanceof BusinessException) {
			customException = (BusinessException) ex;
		} else {
			// 如果该 异常类型不是系统 自定义的异常，构造一个自定义的异常类型（信息为“未知错误”）。
			customException = new BusinessException(ResConstants.UNKNOW_ERROR);
		}
		// 错误信息
		String message = customException.getMessage();
		ModelAndView modelAndView = new ModelAndView();
		// 将错误信息传到页面
		modelAndView.addObject("commonKey", message);
		// 指向到错误界面
		modelAndView.setViewName("common");
		return modelAndView;
	}

	public void init(Throwable cause) {
		super.initCause(cause);
	}
}
