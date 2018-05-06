package com.wechat.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**  
 * @Title: RespTextMessage.java  
 * @Package com.wechat.po  
 * @Description:
 * @author yuanliyang
 * @date 2018年5月6日 下午3:57:37  
 * @version V1.0  
*/  
@Data
@ToString
@EqualsAndHashCode(callSuper=true)
public class RespTextMessage  extends RespBaseMessage{
	  // 回复的消息内容
    private String Content;
}
