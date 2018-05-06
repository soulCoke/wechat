package com.wechat.service;

import com.wechat.po.MsgRequest;
import com.wechat.po.WxAccount;

/**  
 * @Title: WxEventService.java  
 * @Package com.wechat.service  
 * @Description:微信公众号事件处理
 * @author yuanliyang
 * @date 2018年5月6日 下午4:46:02  
 * @version V1.0  
*/  
public interface WxEventService {
	String processEvent(MsgRequest msgRequest, WxAccount wxAccount);
}
