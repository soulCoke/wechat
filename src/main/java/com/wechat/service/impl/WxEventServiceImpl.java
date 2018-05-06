package com.wechat.service.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.wechat.common.utils.wx.MessageUtil;
import com.wechat.po.MsgRequest;
import com.wechat.po.RespTextMessage;
import com.wechat.po.WxAccount;
import com.wechat.service.WxEventService;
@Service
public class WxEventServiceImpl implements WxEventService {
	private static Logger log = LoggerFactory.getLogger(WxEventServiceImpl.class);

	@Override
	public String processEvent(MsgRequest msgRequest, WxAccount wxAccount) {
		// 返回消息
		String respMessage = null;
		// 消息类型
		String event = msgRequest.getEvent();
		
		switch (event) {
		case MessageUtil.EVENT_TYPE_SUBSCRIBE:
			log.info("关注事件");
			respMessage = processSubscribe(msgRequest, wxAccount);
			break;

		case MessageUtil.EVENT_TYPE_UNSUBSCRIBE:
			log.info("取消关注事件");
			respMessage = processUnsubscribe(msgRequest, wxAccount);
			break;

		case MessageUtil.EVENT_TYPE_CLICK:
			log.info("菜单点击事件==按钮id:" + msgRequest.getEventKey());
			respMessage = processClick(msgRequest, wxAccount);
			break;

		case MessageUtil.EVENT_TYPE_VIEW:
			log.info("菜单跳转链接事件");
			respMessage = processView(msgRequest, wxAccount);
			break;

		case MessageUtil.EVENT_TYPE_LOCATION:
			log.info("上传地理位置事件");
			respMessage = processLocation(msgRequest, wxAccount);
			break;

		case MessageUtil.EVENT_TYPE_TRANSFER_CUSTOMER_SERVICE:
			log.info("把消息推送给客服");
			respMessage = processTransferCustomerService(msgRequest, wxAccount);
			break;

		case MessageUtil.EVENT_TYPE_SCAN:
			log.info("二维码扫描事件");
			respMessage = processScan(msgRequest, wxAccount);
			break;

		default:
			log.info("未知事件，暂未对应");
			respMessage = processDefault(msgRequest, wxAccount);
			break;
		}

		return respMessage;
	}

	private String processSubscribe(MsgRequest msgRequest, WxAccount wxAccount) {
		return null;
	}

	private String processUnsubscribe(MsgRequest msgRequest, WxAccount wxAccount) {
		return null;
	}

	private String processClick(MsgRequest msgRequest, WxAccount wxAccount) {
		return null;
	}

	private String processView(MsgRequest msgRequest, WxAccount wxAccount) {
		return null;
	}

	private String processLocation(MsgRequest msgRequest, WxAccount wxAccount) {
		return null;
	}

	private String processTransferCustomerService(MsgRequest msgRequest, WxAccount wxAccount) {
		return null;
	}

	private String processScan(MsgRequest msgRequest, WxAccount wxAccount) {
		return null;
	}

	private String processDefault(MsgRequest msgRequest, WxAccount wxAccount) {
		RespTextMessage textMessage = new RespTextMessage();
		textMessage.setToUserName(msgRequest.getToUserName());
		textMessage.setFromUserName(msgRequest.getFromUserName());
		textMessage.setCreateTime(new Date().getTime());
		textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
		textMessage.setFuncFlag(0);
		textMessage.setContent("未知事件,暂未对应");
		return MessageUtil.textMessageToXml(textMessage);
	}

}
