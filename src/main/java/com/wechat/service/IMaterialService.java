package com.wechat.service;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.wechat.base.bean.BusinessException;
import com.wechat.po.Material;

/**
 * <p>
 * 素材表 服务类
 * </p>
 *
 * @author yuanliyang
 * @since 2018-06-01
 */
public interface IMaterialService extends BaseService<Material> {
    
    /**   
     * 上传文件
     * @author yuanliyang  
     * @param files
     * @return        
     */
    boolean insertMaterial(CommonsMultipartFile[] files,String type) throws BusinessException;
}
