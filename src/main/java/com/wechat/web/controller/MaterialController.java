package com.wechat.web.controller;

import java.io.IOException;

import me.chanjar.weixin.common.exception.WxErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.hutool.core.util.StrUtil;

import com.wechat.base.bean.AuthorizationInterceptor;
import com.wechat.base.bean.BusinessException;
import com.wechat.base.bean.ResConstants;
import com.wechat.base.bean.ResResponse;
import com.wechat.service.IMaterialService;

/**
 * @Title: MaterialController.java
 * @Package com.wechat.web.controller
 * @Description:
 * @author yuanliyang
 * @date 2018年5月31日 下午2:57:17
 * @version V1.0
 */
@Controller
public class MaterialController extends BaseController {

    public static void main(String[] args) {
	System.out.println(System.getProperty("os.name"));
	System.out.println("YWiJQcpX_qwNgdTpYDCtKZmTtTXgGH75byb2uuMuQHM9jWLQrioPFbIitcVhuhBu".length());
    }

    @Autowired
    IMaterialService materialService;
 
    @RequestMapping(value = "/uploadMaterial")
    @ResponseBody
    public void uploadMaterial(@RequestParam("files") CommonsMultipartFile[] files, String type, ResResponse res) throws BusinessException, WxErrorException, IOException {
	if(StrUtil.isBlank(type)){
	    throw new BusinessException(ResConstants.PARAM_NOT_NULL.getCode(),ResConstants.PARAM_NOT_NULL.getMsg()+":type");
	}
	logger.info("==素材上传开始==");
	materialService.insertMaterial(files, type);
	logger.info("==素材上传结束==");
	AuthorizationInterceptor.responseException(response, res);
	return;
    }
}
