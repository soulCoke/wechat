package com.wechat.service.impl;

import com.sun.tools.javac.util.List;
import com.wechat.base.bean.BusinessException;
import com.wechat.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T> {

	@Override
	public List<T> selectList(Object o) throws BusinessException {
		return null;
	}

	@Override
	public T selectByPrimaryKey(Integer id) throws BusinessException {
		return null;
	}

	@Override
	public Integer insert(T t) throws BusinessException {
		return null;
	}

	@Override
	public Integer deleteByPrimaryKey(T t) throws BusinessException {
		return null;
	}

	@Override
	public Integer updateByPrimaryKey(T t) throws BusinessException {
		return null;
	}

}
