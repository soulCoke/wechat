<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>H+ 后台主题UI框架 - css动画</title>
<meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
<meta name="description"
	content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

<%@include file="bootstrap_resource.jsp"%>
<script src="<%=basePath%>static/wcjs/material.js"></script>
<!-- <script>
$(document).ready(function() {
	load_data();
})
//加载数据
function load_data(){
	console.info("加载成功");
	$('#data_table').bootstrapTable({  
	    columns: [  
	        { field: 'name', title: '学生编号' },  
	        { field: 'sname', title: '学生姓名' },  
	        { field: 'ssex', title: '性别' },  
	        { field: 'sbirthday', title: '生日' },  
	        { field: 'class', title: '课程编号' },  
	    ],  
	    url:"/wechat/static/js/demo/bootstrap_table_test2.json"  
	});  
}
</script> -->
</head>

<body class="gray-bg">

	<div class="col-sm-12">

		<!-- Example Card View -->
		<div class="example-wrap">
			<h2 class="example-title">素材管理</h2>
			<div class="btn-group hidden-xs" id="exampleToolbar" role="group">
				<button type="button" class="btn btn-outline btn-default">
					<i class="glyphicon glyphicon-plus" aria-hidden="true"></i>
				</button>
				<button type="button" class="btn btn-outline btn-default">
					<i class="glyphicon glyphicon-heart" aria-hidden="true"></i>
				</button>
				<button type="button" class="btn btn-outline btn-default">
					<i class="glyphicon glyphicon-trash" aria-hidden="true"></i>
				</button>
			</div>
			<div class="example">
				<table id="data_table">

				</table>
			</div>
		</div>
		<!-- End Example Card View -->
	</div>

</body>

</html>
