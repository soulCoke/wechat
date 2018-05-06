package com.wechat.base.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wechat.base.exception.CommonException;


/**  
 * @Title: BusinessException.java  
 * @Package com.wechat.base.bean  
 * @Description:
 * @author yuanliyang
 * @date 2018年5月5日 下午6:59:11  
 * @version V1.0  
*/  
public class BusinessException extends CommonException {
	private static final long serialVersionUID = -3842098054213794497L;
	private final Logger logger = LoggerFactory.getLogger(BusinessException.class);

	public BusinessException(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
		logger.info("异常日志==^_^==code=[" + code + "],msg=[" + msg + "]");
	}

	public BusinessException(ResConstants res) {
		super();
		this.code = res.getCode();
		this.msg = res.getMsg();
		logger.info("异常日志==^_^==code=[" + code + "],msg=[" + msg + "]");
	}

}
