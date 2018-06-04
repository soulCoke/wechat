<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>H+ 后台主题UI框架 - css动画</title>
<meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
<meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

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
				<button type="button" class="btn btn-outline btn-default" data-toggle="modal" data-target="#myModal">
					<i class="glyphicon glyphicon-plus" aria-hidden="true"></i>
				</button>
				<button type="button" class="btn btn-outline btn-default">
					<i class="glyphicon glyphicon-edit" aria-hidden="true"></i>
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


	<div class="ibox ">
		<div class="ibox-title">
			<h5>H+ 模态窗口</h5>

		</div>
		<div class="ibox-content">
			<p>
				创建自定义的H+模态窗口可通过添加
				<code>.inmodal</code>
				类来实现。
			</p>
			<div class="text-center">
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">打开示例窗口</button>
			</div>
			<div class="modal inmodal" id="myModal" tabindex="-1" role="dialog" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content animated fadeIn">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">
								<span aria-hidden="true">&times;</span><span class="sr-only">关闭</span>
							</button>
							<i class="fa fa-laptop modal-icon"></i>
							<h4 class="modal-title">添加素材</h4>
							<small class="font-bold">请选择素材类型 
						</div>
						<div class="modal-body">
							
							<div class="form-group">
								<label>Email</label> <input type="email" placeholder="请输入您的Email" class="form-control">
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>
							<button type="button" class="btn btn-primary">保存</button>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
</body>

</html>
