package com.wechat.persistence;

import java.util.List;

import com.wechat.base.bean.BusinessException;

/**  
 * @Title: BaseMapper.java  
 * @Package com.wechat.persistence  
 * @Description:公共的增删改查
 * @author yuanliyang
 * @date 2018年5月5日 下午7:05:20  
 * @version V1.0  
*/  
public interface BaseMapper<T> {
	List<T> selectList(Object o)throws BusinessException;
	T selectByPrimaryKey(Integer id) throws BusinessException;
	Integer insert(T t) throws BusinessException;
	Integer deleteByPrimaryKey(T t) throws BusinessException;
	Integer updateByPrimaryKey(T t) throws BusinessException;
}
