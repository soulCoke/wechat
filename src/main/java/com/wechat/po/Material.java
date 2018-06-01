package com.wechat.po;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 素材表
 * </p>
 *
 * @author yuanliyang
 * @since 2018-06-01
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Material extends BasePo {

    private static final long serialVersionUID = 1L;

    /**
     * 媒体id
     */
    private String mediaId;
    /**
     * 媒体类型
     */
    private String type;
    /**
     * 缩略图id
     */
    private String thumbMediaId;
    /**
     * 创建时间
     */
    private Date createdAt;
    /**
     * 资源url地址
     */
    private String netUrl;
    /**
     * 图片本机地址
     */
    private String abPath;
    /**
     * 状态0存在 1删除
     */
    private Integer status;


}
