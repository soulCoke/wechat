package com.wechat.po;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

/**  
 * @Title: WxAccount.java  
 * @Package com.wechat.po  
 * @Description:
 * @author yuanliyang
 * @date 2018年5月6日 下午5:26:04  
 * @version V1.0  
*/  
@Data
@ToString
public class WxAccount implements Serializable {
	private static final long serialVersionUID = 1L;
	private String account;//账号
	private String appid;//appid
	private String appsecret;//appsecret
	private String url;//验证时用的url
	private String token;//token
}
