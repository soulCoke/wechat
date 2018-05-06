package com.wechat.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.base.bean.redis.RedisCacheUtil;
import com.wechat.common.utils.SignUtil;
import com.wechat.po.WxAccount;
import com.wechat.service.WxService;

/**
 * @Title: WeChatContrller.java
 * @Package com.wechat.web.controller
 * @Description:
 * @author yuanliyang
 * @date 2018年5月6日 下午3:39:46
 * @version V1.0
 */
@Controller
public class WeChatContrller extends BaseController {

	private static Logger log = LoggerFactory.getLogger(WeChatContrller.class);
	@Autowired
	private WxService wxService;

	/**
	 * @Title: checkSignature
	 * @Description:接入管理
	 * @author yuanliyang
	 * @date 2018年5月6日 下午3:40:13
	 * @param @param signature
	 * @param @param nonce
	 * @param @param timestamp
	 * @param @param echostr
	 * @param @param account
	 * @param @return 参数
	 * @return String 返回类型
	 * @throws
	 */
	@RequestMapping(value = "/{account}/message", method = RequestMethod.GET)
	@ResponseBody
	public String checkSignature(
			@RequestParam(name = "signature", required = false) String signature,
			@RequestParam(name = "nonce", required = false) String nonce,
			@RequestParam(name = "timestamp", required = false) String timestamp,
			@RequestParam(name = "echostr", required = false) String echostr,
			@PathVariable String account) {
		log.info("get有消息来了！");
		// 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
		log.info("接收参数:" + "===========signature:" + signature
				+ "===========timestamp:" + timestamp + "===========nonce:"
				+ nonce);
		Boolean flag = false;
		WxAccount ap = RedisCacheUtil.get(account, WxAccount.class);
		try {
			flag = SignUtil.checkSignature(ap.getToken(), signature, timestamp,
					nonce);
		} catch (Exception e) {
			flag = false;
		}
		if (flag) {
			log.info("接入成功");
			return echostr;
		}
		log.error("接入失败");
		return "";
	}

	/**
	 * @Title: weChatMsg
	 * @Description:处理公众号信息
	 * @author yuanliyang
	 * @date 2018年5月6日 下午3:40:28
	 * @param @param req
	 * @param @param rep
	 * @param @param account
	 * @param @return 参数
	 * @return String 返回类型
	 * @throws
	 */
	@RequestMapping(value = "/{account}/message", method = RequestMethod.POST)
	@ResponseBody
	public String weChatMsg(HttpServletRequest req, HttpServletResponse rep,@PathVariable String account) {
		WxAccount ap = RedisCacheUtil.get(account, WxAccount.class);
		String respMessage = wxService.processMsg(req, ap);
		//log.info("返回结果:"+respMessage);
		return respMessage;
	}
}
