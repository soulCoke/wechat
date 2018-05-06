package com.wechat.po;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**  
 * @Title: NewsMessage.java  
 * @Package com.wechat.po  
 * @Description:
 * @author yuanliyang
 * @date 2018年5月6日 下午3:50:08  
 * @version V1.0  
*/ 
@Data
@ToString
@EqualsAndHashCode(callSuper=true)
public class NewsMessage extends RespBaseMessage{
	// 图文消息个数，限制为10条以内
    private Integer ArticleCount;
    // 多条图文消息信息，默认第一个item为大图
    private List<Article> Articles;
}
