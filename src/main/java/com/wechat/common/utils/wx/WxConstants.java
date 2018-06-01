package com.wechat.common.utils.wx;

public interface WxConstants {
    /**======素材类型======*/
    public static enum MaterialType{
	IMAGE("image"),VOICE("voice"),VIDEO("video"),THUMB("thumb");	
	private String value;
	private MaterialType(String value){
	    this.value = value;
	}
	public String getValue() {
	    return value;
	}
    }
}
