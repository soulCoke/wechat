<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<link rel="shortcut icon" href="<%=basePath%>static/favicon.ico">
<link href="<%=basePath%>static/css/bootstrap.min.css" rel="stylesheet">
<link href="<%=basePath%>static/css/font-awesome.min.css" rel="stylesheet">
<link href="<%=basePath%>static/css/animate.min.css" rel="stylesheet">
<link href="<%=basePath%>static/css/style.min.css" rel="stylesheet">

<script src="<%=basePath%>static/js/jquery.min.js"></script>
<script src="<%=basePath%>static/js/bootstrap.min.js"></script>
<script src="<%=basePath%>static/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="<%=basePath%>static/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<script src="<%=basePath%>static/js/plugins/layer/layer.min.js"></script>
<script src="<%=basePath%>static/js/hplus.min.js"></script>
<script src="<%=basePath%>static/js/contabs.min.js"></script>
<script src="<%=basePath%>static/js/plugins/pace/pace.min.js"></script>
<script src="<%=basePath%>static/wcjs/leftNavBar.js"></script>