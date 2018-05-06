package com.wechat.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.base.bean.redis.RedisCacheUtil;

/**  
 * @Title: RedisController.java  
 * @Package com.wechat.web.controller  
 * @Description:
 * @author yuanliyang
 * @date 2018年5月6日 上午10:22:22  
 * @version V1.0  
*/  
@Controller
public class RedisController {

	
	/**  
	 * @Title: setValue  
	 * @Description:
	 * @author yuanliyang
	 * @date 2018年5月6日 上午10:22:26 
	 * @param @param request
	 * @param @param key
	 * @param @param value
	 * @param @return    参数  
	 * @return String    返回类型  
	 * @throws  
	*/  
	@RequestMapping(value="/setValue")
	@ResponseBody
	public String setValue(HttpServletRequest request,String key,String value){
		RedisCacheUtil.set(key, value, null, null);
		return key+"设置成功！";
	}
	
	/**  
	 * @Title: getValue  
	 * @Description:
	 * @author yuanliyang
	 * @date 2018年5月6日 上午10:44:36 
	 * @param @param request
	 * @param @param key
	 * @param @return    参数  
	 * @return String    返回类型  
	 * @throws  
	*/  
	@RequestMapping(value="/getValue")
	@ResponseBody
	public String getValue(HttpServletRequest request,String key){
		String value = RedisCacheUtil.get(key, String.class);
		return key+":"+value;
	}
}
