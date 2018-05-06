package com.wechat.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**  
 * @Title: MenuMessage.java  
 * @Package com.wechat.vo  
 * @Description:
 * @author yuanliyang
 * @date 2018年5月6日 下午3:58:59  
 * @version V1.0  
*/  
@Data
@ToString
@EqualsAndHashCode(callSuper=true)
public class MenuMessage  extends BaseMessage{
	 private String EventKey;

}
