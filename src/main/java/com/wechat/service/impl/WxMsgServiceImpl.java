package com.wechat.service.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.wechat.common.utils.wx.MessageUtil;
import com.wechat.po.MsgRequest;
import com.wechat.po.WxAccount;
import com.wechat.service.WxMsgService;
@Service
public class WxMsgServiceImpl implements WxMsgService{
	private static Logger log = LoggerFactory.getLogger(WxMsgServiceImpl.class);
	@Override
	public String processMsg(MsgRequest msgRequest, WxAccount wxAccount) {
		// 返回消息
		String respMessage = null;
		//消息类型
		String msgType=msgRequest.getMsgType();
		log.info("消息类型:"+msgType);
		switch (msgType) {
		case MessageUtil.REQ_MESSAGE_TYPE_TEXT:
			respMessage = processText(msgRequest, wxAccount);
			break;
		case MessageUtil.REQ_MESSAGE_TYPE_IMAGE:
			respMessage = processImage(msgRequest, wxAccount);
			break;
		case MessageUtil.REQ_MESSAGE_TYPE_LOCATION:
			respMessage = processLocation(msgRequest, wxAccount);
			break;
		case MessageUtil.REQ_MESSAGE_TYPE_LINK:
			respMessage = processLink(msgRequest, wxAccount);
			break;
		case MessageUtil.REQ_MESSAGE_TYPE_VOICE:
			respMessage = processVoice(msgRequest, wxAccount);
			break;
		case MessageUtil.REQ_MESSAGE_TYPE_SHORTVIDEO:
			respMessage = processShotVideo(msgRequest, wxAccount);
			break;
		case MessageUtil.REQ_MESSAGE_TYPE_VIDEO:
			respMessage = processVideo(msgRequest, wxAccount);
			break;
		default:
			break;
		}
		return respMessage;
	}

	private String processText(MsgRequest msgRequest, WxAccount wxAccount) {
		return null;
	}
	private String processImage(MsgRequest msgRequest, WxAccount wxAccount) {
		return null;
	}
	private String processLocation(MsgRequest msgRequest, WxAccount wxAccount) {
		return null;
	}
	private String processLink(MsgRequest msgRequest, WxAccount wxAccount) {
		return null;
	}
	private String processVoice(MsgRequest msgRequest, WxAccount wxAccount) {
		return null;
	}
	private String processShotVideo(MsgRequest msgRequest, WxAccount wxAccount) {
		return null;
	}
	private String processVideo(MsgRequest msgRequest, WxAccount wxAccount) {
		return null;
	}

	/**  
	 * @Title: isQqFace  
	 * @Description:判断QQ表情
	 * @author yuanliyang
	 * @date 2018年5月6日 下午4:05:48 
	 * @param @param content
	 * @param @return    参数  
	 * @return boolean    返回类型  
	 * @throws  
	*/  
	public static boolean isQqFace(String content) {
		boolean result = false;

		// 判断QQ表情的正则表达式
		String qqfaceRegex = "/::\\)|/::~|/::B|/::\\||/:8-\\)|/::<|/::$|/::X|/::Z|/::'\\(|/::-\\||/::@|/::P|/::D|/::O|/::\\(|/::\\+|/:--b|/::Q|/::T|/:,@P|/:,@-D|/::d|/:,@o|/::g|/:\\|-\\)|/::!|/::L|/::>|/::,@|/:,@f|/::-S|/:\\?|/:,@x|/:,@@|/::8|/:,@!|/:!!!|/:xx|/:bye|/:wipe|/:dig|/:handclap|/:&-\\(|/:B-\\)|/:<@|/:@>|/::-O|/:>-\\||/:P-\\(|/::'\\||/:X-\\)|/::\\*|/:@x|/:8\\*|/:pd|/:<W>|/:beer|/:basketb|/:oo|/:coffee|/:eat|/:pig|/:rose|/:fade|/:showlove|/:heart|/:break|/:cake|/:li|/:bome|/:kn|/:footb|/:ladybug|/:shit|/:moon|/:sun|/:gift|/:hug|/:strong|/:weak|/:share|/:v|/:@\\)|/:jj|/:@@|/:bad|/:lvu|/:no|/:ok|/:love|/:<L>|/:jump|/:shake|/:<O>|/:circle|/:kotow|/:turn|/:skip|/:oY|/:#-0|/:hiphot|/:kiss|/:<&|/:&>";
		Pattern p = Pattern.compile(qqfaceRegex);
		Matcher m = p.matcher(content);
		if (m.matches()) {
			result = true;
		}
		return result;
	}
}
