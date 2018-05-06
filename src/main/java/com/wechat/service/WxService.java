package com.wechat.service;

import javax.servlet.http.HttpServletRequest;

import com.wechat.po.WxAccount;

public interface WxService {
	String processMsg(HttpServletRequest request,WxAccount wa);
}
