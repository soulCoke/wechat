package com.wechat.po;

import lombok.Data;
import lombok.ToString;

/**  
 * @Title: Article.java  
 * @Package com.wechat.po  
 * @Description:
 * @author yuanliyang
 * @date 2018年5月6日 下午3:49:58  
 * @version V1.0  
*/  
@Data
@ToString
public class Article {
	// 图文消息名称
    private String Title;
    // 图文消息描述
    private String Description;
    // 图片链接，支持JPG、PNG格式，较好的效果为大图640*320，小图80*80，限制图片链接的域名需要与开发者填写的基本资料中的Url一致
    private String PicUrl;
    // 点击图文消息跳转链接
    private String Url;
}
