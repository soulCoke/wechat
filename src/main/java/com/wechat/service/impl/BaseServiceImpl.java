package com.wechat.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wechat.base.bean.BusinessException;
import com.wechat.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T> {
    protected Logger logger = LoggerFactory.getLogger(getClass());
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
