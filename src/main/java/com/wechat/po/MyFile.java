package com.wechat.po;

import lombok.Data;
import lombok.ToString;

/**  
 * @Title: MyFile.java  
 * @Package com.wechat.po  
 * @Description:文件类
 * @author yuanliyang
 * @date 2018年6月1日 下午4:06:50  
 * @version V1.0  
*/  
@Data
@ToString
public class MyFile {
    private String abPath;//绝对路径
    private String urlPath;//网络路径
    private String name;//文件名称
    private String exitName;//文件后缀名
    
}
