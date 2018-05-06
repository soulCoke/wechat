package com.wechat.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**  
 * @Title: LinkMessage.java  
 * @Package com.wechat.vo  
 * @Description:
 * @author yuanliyang
 * @date 2018年5月6日 下午3:55:21  
 * @version V1.0  
*/  
@Data
@ToString
@EqualsAndHashCode(callSuper=true)
public class LinkMessage extends BaseMessage{
	  // 消息标题
    private String Title;
    // 消息描述
    private String Description;
    // 消息链接
    private String Url;
}
