package com.wechat.service;

import java.util.List;

import com.wechat.base.bean.BusinessException;


/**  
 * @Title: BaseService.java  
 * @Package com.wechat.service  
 * @Description:公共的增删改查service
 * @author yuanliyang
 * @date 2018年5月5日 下午7:06:30  
 * @version V1.0  
*/  
public interface BaseService<T> {
	List<T> selectList(Object o)throws BusinessException;
	T selectByPrimaryKey(Integer id) throws BusinessException;
	Integer insert(T t) throws BusinessException;
	Integer deleteByPrimaryKey(T t) throws BusinessException;
	Integer updateByPrimaryKey(T t) throws BusinessException;
}
