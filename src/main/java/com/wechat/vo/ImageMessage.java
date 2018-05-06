package com.wechat.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**  
 * @Title: ImageMessage.java  
 * @Package com.wechat.vo  
 * @Description:
 * @author yuanliyang
 * @date 2018年5月6日 下午3:53:54  
 * @version V1.0  
*/ 
@Data
@ToString
@EqualsAndHashCode(callSuper=true)
public class ImageMessage extends BaseMessage{
	   // 图片链接
    private String PicUrl;
}
