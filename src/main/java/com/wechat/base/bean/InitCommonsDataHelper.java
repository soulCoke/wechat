package com.wechat.base.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.wechat.base.bean.redis.RedisCacheUtil;
import com.wechat.po.WxAccount;


/**  
 * @Title: InitCommonsDataHelper.java  
 * @Package com.wechat.base.bean  
 * @Description:
 * @author yuanliyang
 * @date 2018年5月6日 下午2:10:59  
 * @version V1.0  
*/  
@Component
public class InitCommonsDataHelper {
	private final static Logger logger = LoggerFactory.getLogger(InitCommonsDataHelper.class);



	/**  
	 * @Title: init  
	 * @Description:
	 * @author yuanliyang
	 * @date 2018年5月6日 下午2:11:23 
	 * @param     参数  
	 * @return void    返回类型  
	 * @throws  
	*/  
	public void init() {
		logger.info("初始化数据>>>>>>>>>>>>>>>开始>>>>>>>>>>>>>>>>>");
		WxAccount wa = new WxAccount();
		wa.setAccount("soulCoke");
		wa.setAppid("wxd63c9118c9916dfa");
		wa.setAppsecret("5997ae0d150e6ce8d343052c1819b6ba");
		wa.setToken("soulCoke");
		RedisCacheUtil.set(wa.getAccount(), wa);
		/*try {
			
		} catch (BusinessException e) {
			e.printStackTrace();
		}*/
		logger.info("初始化数据>>>>>>>>>>>>>>>结束>>>>>>>>>>>>>>>>>");
	}

}
