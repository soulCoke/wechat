package com.wechat.common.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * @Title: StringUtils4JM.java
 * @Package com.wechat.common.utils
 * @Description:
 * @author yuanliyang
 * @date 2018年5月31日 下午3:48:44
 * @version V1.0
 */
public class StringUtils4JM extends StringUtils {
    
    public static String getPicOpenId() {
	return System.currentTimeMillis() + RandomStringUtils.randomNumeric(5);
    }
}