package com.wechat.service.impl;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wechat.common.utils.wx.MessageUtil;
import com.wechat.po.MsgRequest;
import com.wechat.po.RespTextMessage;
import com.wechat.po.WxAccount;
import com.wechat.service.WxEventService;
import com.wechat.service.WxMsgService;
import com.wechat.service.WxService;

@Service
public class WxServiceImpl implements WxService {
	private static Logger log = LoggerFactory.getLogger(WxServiceImpl.class);
	@Autowired
	private WxEventService wxEventService;
	@Autowired
	private WxMsgService wxMsgService;

	@Override
	public String processMsg(HttpServletRequest request, WxAccount wa) {
		String respMessage = null;
		try {
			// xml请求解析
			MsgRequest msgRequest = MessageUtil.parseXmlToMsgRequest(request);
			String msgType = msgRequest.getMsgType();
			if (MessageUtil.REQ_MESSAGE_TYPE_EVENT.equals(msgType)) {
				// 处理事件
				respMessage = wxEventService.processEvent(msgRequest, wa);
			} else {
				// 处理消息
				respMessage = wxMsgService.processMsg(msgRequest, wa);
			}
			if (respMessage == null) {
				RespTextMessage textMessage = new RespTextMessage();
				textMessage.setToUserName(msgRequest.getFromUserName());
				textMessage.setFromUserName(msgRequest.getToUserName());
				textMessage.setCreateTime(new Date().getTime());
				textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
				textMessage.setFuncFlag(0);
				textMessage.setContent(msgRequest.getContent());
				return MessageUtil.textMessageToXml(textMessage);
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.info("发生了未知异常!");
		}
		return respMessage;
	}
}
