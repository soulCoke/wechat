package com.wechat.base.bean;

import java.io.Serializable;

/**
 * @Title: ResResponse.java
 * @Package com.wechat.base.bean
 * @Description:
 * @author yuanliyang
 * @date 2018年5月31日 下午6:16:40
 * @version V1.0
 */
public class ResResponse implements Serializable {
    private static final long serialVersionUID = 3923739127956348641L;
    private String code;
    private String msg;
    private Object objs;
    private Integer page;
    private Integer pageSize;
    private Integer totalCount;
    private Object data; // 此处是专门为wdTree准备的

    public ResResponse() {
	super();
    }

    public ResResponse(String code, String msg) {
	super();
	this.code = code;
	this.msg = msg;
    }

    public ResResponse(String code, String msg, Object objs) {
	super();
	this.code = code;
	this.msg = msg;
	this.objs = objs;
    }

    public ResResponse(String code, String msg, Object objs, Integer page, Integer pageSize, Integer totalCount) {
	super();
	this.code = code;
	this.msg = msg;
	this.objs = objs;
	this.page = page;
	this.pageSize = pageSize;
	this.totalCount = totalCount;
    }

    public Integer getPage() {
	return page;
    }

    public void setPage(Integer page) {
	this.page = page;
    }

    public Integer getPageSize() {
	return pageSize;
    }

    public void setPageSize(Integer pageSize) {
	this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
	return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
	this.totalCount = totalCount;
    }

    public String getCode() {
	return code;
    }

    public void setCode(String code) {
	this.code = code;
    }

    public String getMsg() {
	return msg;
    }

    public void setMsg(String msg) {
	this.msg = msg;
    }

    public Object getObjs() {
	return objs;
    }

    public void setObjs(Object objs) {
	this.objs = objs;
    }

    public Object getData() {
	return data;
    }

    public void setData(Object data) {
	this.data = data;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("ResResponse [code=");
	builder.append(code);
	builder.append(", msg=");
	builder.append(msg);
	builder.append(", objs=");
	builder.append(objs);
	builder.append(", page=");
	builder.append(page);
	builder.append(", pageSize=");
	builder.append(pageSize);
	builder.append(", totalCount=");
	builder.append(totalCount);
	builder.append(", data=");
	builder.append(data);
	builder.append("]");
	return builder.toString();
    }

}
