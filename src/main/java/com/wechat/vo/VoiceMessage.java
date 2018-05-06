package com.wechat.vo;

import lombok.Data;
import lombok.ToString;

/**  
 * @Title: VoiceMessage.java  
 * @Package com.wechat.vo  
 * @Description:
 * @author yuanliyang
 * @date 2018年5月6日 下午4:00:07  
 * @version V1.0  
*/  
@Data
@ToString
public class VoiceMessage {
    // 媒体ID
    private String MediaId;
    // 语音格式
    private String Format;

}
