package com.wechat.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import me.chanjar.weixin.common.bean.result.WxMediaUploadResult;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.wechat.base.bean.BusinessException;
import com.wechat.base.bean.CommonPro;
import com.wechat.base.bean.ResConstants;
import com.wechat.common.utils.FileUtils;
import com.wechat.persistence.MaterialMapper;
import com.wechat.po.Material;
import com.wechat.po.MyFile;
import com.wechat.service.IMaterialService;

/**
 * <p>
 * 素材表 服务实现类
 * </p>
 *
 * @author yuanliyang
 * @since 2018-06-01
 */
@Service
public class MaterialServiceImpl extends BaseServiceImpl<Material> implements IMaterialService {
    @Autowired
    protected WxMpService wxService;
    @Autowired
    protected MaterialMapper materialMapper;

    @Override
    public boolean insertMaterial(CommonsMultipartFile[] files, String type) throws BusinessException {
	try {
	    //下载到本地服务器
	    List<MyFile> fileList = FileUtils.uploadfiles(files, CommonPro.getFileUploadBasePath(), "/material/"+type+"/", new ArrayList<String>());
	    WxMediaUploadResult mediaUpload = null;
	    Material material = null;
	    for (MyFile myFile : fileList) {
		//上传到腾讯服务器
		mediaUpload = wxService.getMaterialService().mediaUpload(type, new File(myFile.getAbPath()));
		material=new Material();
		material.setMediaId(mediaUpload.getMediaId());
		material.setType(mediaUpload.getType());
		material.setThumbMediaId(mediaUpload.getThumbMediaId());
		material.setCreatedAt(new Date());
		material.setAbPath(myFile.getAbPath());
		material.setNetUrl(myFile.getUrlPath());
		materialMapper.insert(material);
	    }
	} catch (WxErrorException e) {
	    throw new BusinessException(ResConstants.UPLOAD_FILE_EXCEPTION);
	}
	return true;
    }

}
