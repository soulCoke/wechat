package com.wechat.vo;

import lombok.Data;
import lombok.ToString;


/**  
 * @Title: BaseMessage.java  
 * @Package com.wechat.vo  
 * @Description:
 * @author yuanliyang
 * @date 2018年5月6日 下午3:53:40  
 * @version V1.0  
*/  
@Data
@ToString
public class BaseMessage {
	
	// 开发者微信号
    private String ToUserName;
    // 发送方帐号（一个OpenID）
    private String FromUserName;
    // 消息创建时间 （整型）
    private Long CreateTime;
    // 消息类型（text/image/location/link）
    private String MsgType;
    // 消息id，64位整型
    private Long MsgId;
}
