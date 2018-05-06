package com.wechat.po;

import lombok.Data;
import lombok.ToString;


/**  
 * @Title: RespBaseMessage.java  
 * @Package com.wechat.po  
 * @Description:
 * @author yuanliyang
 * @date 2018年5月6日 下午3:50:20  
 * @version V1.0  
*/  
@Data
@ToString
public class RespBaseMessage {
	  // 接收方帐号（收到的OpenID）
    private String ToUserName;
    // 开发者微信号
    private String FromUserName;
    // 消息创建时间 （整型）
    private long CreateTime;
    // 消息类型（text/music/news）
    private String MsgType;
    // 位0x0001被标志时，星标刚收到的消息
    private int FuncFlag;
}
