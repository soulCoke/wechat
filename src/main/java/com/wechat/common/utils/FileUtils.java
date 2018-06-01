package com.wechat.common.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.wechat.base.bean.CommonPro;
import com.wechat.base.bean.BusinessException;
import com.wechat.base.bean.ResConstants;
import com.wechat.po.MyFile;

/**
 * @Title: FileUtil.java
 * @Package com.wechat.common.utils
 * @Description:文件流操作类
 * @author yuanliyang
 * @date 2018年5月31日 下午3:20:38
 * @version V1.0
 */
public class FileUtils {

    private final static Logger logger = LoggerFactory.getLogger(FileUtils.class);

    /**
     * 文件上传
     * 
     * @author yuanliyang
     * @param files
     *            文件流
     * @param path
     *            文件的基础路径
     * @param subPath
     *            文件的业务路径
     * @param extSubList
     *            返回文件相对路径（剔除图片基础路径）
     * @return list
     * @throws BusinessException
     */
    public static List<MyFile> uploadfiles(CommonsMultipartFile[] files, String path, String subPath, List<String> extSubList) throws BusinessException {
	List<MyFile> fileList = new ArrayList<>();
	MyFile mf = null;
	FileOutputStream os = null;
	InputStream in = null;
	int b = 0;
	String rtPath = null;
	File dir = null;
	String fileName = null;
	String exitName = null;
	SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMdd");
	String nowTimeStr = sDateFormat.format(new Date());
	for (int i = 0; i < files.length; i++) {
	    mf = new MyFile();
	    fileName = files[i].getOriginalFilename();
	    mf.setName(fileName);
	    logger.info("文件上传：fileName---------->" + fileName);
	    if (!files[i].isEmpty()) {
		// 判断文件大小是否超限
		if (files[i].getSize() > CommonPro.getMaxImageSize() * 1024 * 1024) {
		    throw new BusinessException(ResConstants.IMAGE_IS_OVER_WEIGHT.getCode(), String.format(ResConstants.IMAGE_IS_OVER_WEIGHT.getMsg(), CommonPro.getMaxImageSize()));
		}
		exitName = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
		mf.setExitName(exitName);
		if (CollectionUtils.isNotEmpty(extSubList) && !extSubList.contains(exitName)) {
		    throw new BusinessException(ResConstants.FILE_EXT_IS_NOT_SUPPORTED.getCode(), ResConstants.FILE_EXT_IS_NOT_SUPPORTED.getMsg());
		}
		try {
		    rtPath = subPath + nowTimeStr + "/";
		    path += rtPath;

		    dir = new File(path);
		    if (!dir.exists()) {
			dir.mkdirs();
		    }
		    fileName = StringUtils4JM.getPicOpenId() + "." + exitName;
		    path += fileName;
		    rtPath += fileName;	
		    //封装文件对象
		    mf.setName(fileName);
		    mf.setAbPath(path);
		    mf.setUrlPath(rtPath);
		    mf.setExitName(exitName);
		    logger.info("保存完整路径=" + path);
		    logger.info("保存静态资源相对路径=" + rtPath);
		    // 拿到输出流，同时重命名上传的文件
		    os = new FileOutputStream(path);
		    // 拿到上传文件的输入流
		    in = files[i].getInputStream();
		    // 以写字节的方式写文件
		    while ((b = in.read()) != -1) {
			os.write(b);
		    }
		    os.flush();
		    os.close();
		    in.close();
		    fileList.add(mf);
		    path = null;
		} catch (Exception e) {
		    e.printStackTrace();
		    logger.error("上传出错");
		    throw new BusinessException(ResConstants.UPLOAD_FILE_EXCEPTION.getCode(), ResConstants.UPLOAD_FILE_EXCEPTION.getMsg());
		} finally {
		    try {
			if (in != null)
			    in.close();
			if (os != null)
			    os.close();
		    } catch (IOException e) {
			e.printStackTrace();
			logger.error("图片上传，关闭流出错");
			throw new BusinessException(ResConstants.UPLOAD_FILE_EXCEPTION.getCode(), ResConstants.UPLOAD_FILE_EXCEPTION.getMsg());
		    }
		}
	    }
	}
	return fileList;
    }
}
