package com.wechat.base.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**  
 * @Title: CommonException.java  
 * @Package com.wechat.base.exception  
 * @Description:
 * @author yuanliyang
 * @date 2018年5月5日 下午6:59:04  
 * @version V1.0  
*/  
public class CommonException extends Exception {
	private final Logger logger = LoggerFactory.getLogger(CommonException.class);
	private static final long serialVersionUID = -3842098054213794497L;
	public String code;
	public String msg;

	public CommonException() {
		super();
	}

	public CommonException(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
		logger.info("异常日志==^_^==code=[" + code + "],msg=[" + msg + "]");
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
