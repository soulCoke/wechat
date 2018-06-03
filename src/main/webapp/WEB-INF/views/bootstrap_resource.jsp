<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<link rel="<%=basePath%>static/shortcut icon" href="favicon.ico">
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="<%=basePath%>static/css/font-awesome.min.css" rel="stylesheet">
<link href="<%=basePath%>static/css/plugins/bootstrap-table/bootstrap-table.min.css" rel="stylesheet">
<link href="<%=basePath%>static/css/animate.min.css" rel="stylesheet">
<link href="<%=basePath%>static/css/style.min.css" rel="stylesheet">

<script src="<%=basePath%>static/js/jquery.min.js"></script>
<script src="<%=basePath%>static/js/bootstrap.min.js"></script>
<script src="<%=basePath%>static/js/content.min.js"></script>
<script src="<%=basePath%>static/js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
<script src="<%=basePath%>static/js/plugins/bootstrap-table/bootstrap-table-mobile.min.js"></script>
<script src="<%=basePath%>static/js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
<script src="<%=basePath%>static/js/demo/bootstrap-table-demo.min.js"></script>