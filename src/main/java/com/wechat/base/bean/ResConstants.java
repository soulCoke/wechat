package com.wechat.base.bean;


/**  
 * @Title: ResConstants.java  
 * @Package com.wechat.base.bean  
 * @Description:
 * @author yuanliyang
 * @date 2018年5月5日 下午6:58:57  
 * @version V1.0  
*/  
public enum ResConstants {
	// 00开头 正常情况 
    SUCCESS("000000", "操作成功"),
    PARAM_NOT_RIGHT("000001", "入参数值不合法"),
    PARAM_NOT_NULL("000002", "必要参数不能为空"),
    QUERY_DATA_EXCEPTION("000003", "查询数据异常"),
    QUERY_DATA_EXIST("000004", "查询数据存在"),
    QUERY_DATA_NOT_EXIST("000005", "查询数据不存在"),
    ADD_DATA_FAIL("000006", "添加数据失败"),
    UPD_DATA_FAIL("000007", "更新数据失败"),
    DEL_DATA_FAIL("000008", "删除数据失败"),
    
    UNKNOW_ERROR("082067","未知错误"),
    
    IMAGE_IS_OVER_WEIGHT("100000", "图片超过指定大小"),
    FILE_EXT_IS_NOT_SUPPORTED("100002", "不支持类型"),
    UPLOAD_FILE_EXCEPTION("100003", "上传失败"),
    
    ;

    private final String code; // 错误码

    private final String msg; // 错误描述

    private ResConstants(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public String getMsg(String desc) {
        return msg + ":" + desc;
    }
}