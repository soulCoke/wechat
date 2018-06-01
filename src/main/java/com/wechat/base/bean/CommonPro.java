package com.wechat.base.bean;

/**  
 * @Title: BusinessCommonPro.java  
 * @Package com.wechat.base.bean  
 * @Description:公共属性配置
 * @author yuanliyang
 * @date 2018年5月31日 下午3:31:18  
 * @version V1.0  
*/  
public class CommonPro {
    private static Long maxImageSize;//图片最大尺寸
    private static String fileUploadBasePath;//文件的绝对地址
    
    private static String wxAllImageType="PNG/JPE/JPG/GIF";//支持PNG\JPEG\JPG\GIF格式 2M
    private static String wxAllVoiceType="AMR/MP3";//微信支持AMR\MP3格式 2M
    private static String wxAllVideoType="MP4";//微信支持MP4格式 10MB
    private static String wxAllThumbType="JPG";//微信缩略图类型，只有64KB
    
    
    public static String getWxAllImageType() {
        return wxAllImageType;
    }

    public static void setWxAllImageType(String wxAllImageType) {
        CommonPro.wxAllImageType = wxAllImageType;
    }

    public static String getWxAllVoiceType() {
        return wxAllVoiceType;
    }

    public static void setWxAllVoiceType(String wxAllVoiceType) {
        CommonPro.wxAllVoiceType = wxAllVoiceType;
    }

    public static String getWxAllVideoType() {
        return wxAllVideoType;
    }

    public static void setWxAllVideoType(String wxAllVideoType) {
        CommonPro.wxAllVideoType = wxAllVideoType;
    }

    public static String getWxAllThumbType() {
        return wxAllThumbType;
    }

    public static void setWxAllThumbType(String wxAllThumbType) {
        CommonPro.wxAllThumbType = wxAllThumbType;
    }

    public static String getFileUploadBasePath() {
        return fileUploadBasePath;
    }

    public static void setFileUploadBasePath(String fileUploadBasePath) {
        CommonPro.fileUploadBasePath = fileUploadBasePath;
    }

    public static Long getMaxImageSize() {
        return maxImageSize;
    }

    public static void setMaxImageSize(Long maxImageSize) {
        CommonPro.maxImageSize = maxImageSize;
    }
    
    
    
}
