package com.wechat.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**  
 * @Title: LocationMessage.java  
 * @Package com.wechat.vo  
 * @Description:
 * @author yuanliyang
 * @date 2018年5月6日 下午3:58:21  
 * @version V1.0  
*/  
@Data
@ToString
@EqualsAndHashCode(callSuper=true)
public class LocationMessage  extends BaseMessage{
	 // 地理位置维度
    private String Location_X;
    // 地理位置经度
    private String Location_Y;
    // 地图缩放大小
    private String Scale;
    // 地理位置信息
    private String Label;
}
