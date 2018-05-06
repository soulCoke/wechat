package com.wechat.service;

import com.wechat.po.MsgRequest;
import com.wechat.po.WxAccount;

public interface WxMsgService {
	String processMsg(MsgRequest msgRequest, WxAccount wxAccount);
}
