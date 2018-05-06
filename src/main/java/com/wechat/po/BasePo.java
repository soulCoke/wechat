package com.wechat.po;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.ToString;

/**  
 * @Title: BasePo.java  
 * @Package com.wechat.po  
 * @Description:po 父类
 * @author yuanliyang
 * @date 2018年5月5日 下午6:31:34  
 * @version V1.0  
*/  
@Data
@ToString
public class BasePo implements Serializable {
	private static final long serialVersionUID = 1L;
	private Date recordCreationtime;
	private Integer recordStatus;
	private String operatorId;
	private String operatorName;
	private Date operateTime;
}
