$(document).ready(function() {
	load_data();
})
// 加载数据
function load_data() {
	$("#data_table").bootstrapTable({ // 对应table标签的id
		url : "/wechat/static/js/demo/bootstrap_table_test2.json", // 获取表格数据的url
		cache : false, // 设置为 false 禁用 AJAX 数据缓存， 默认为true
		striped : true, // 表格显示条纹，默认为false
		pagination : true, // 在表格底部显示分页组件，默认false
		pageList : [ 10, 20 ], // 设置页面可以显示的数据条数
		pageSize : 10, // 页面数据条数
		pageNumber : 1, // 首页页码
		search : !0,
		pagination : !0,
		showRefresh : !0,
		showToggle : !0,
		showColumns : !0,
		iconSize : "outline",
		toolbar : "#exampleToolbar",
		iconSize : "outline",
		icons : {
			refresh : "glyphicon-repeat",
			toggle : "glyphicon-list-alt",
			columns : "glyphicon-list"
		},
		// sidePagination: 'server', // 设置为服务器端分页
		queryParams : function(params) { // 请求服务器数据时发送的参数，可以在这里添加额外的查询参数，返回false则终止请求

			return {
				pageSize : params.limit, // 每页要显示的数据条数
				offset : params.offset, // 每页显示数据的开始行号
				sort : params.sort, // 要排序的字段
				sortOrder : params.order, // 排序规则
				dataId : $("#dataId").val()
			// 额外添加的参数
			}
		},
		sortName : 'id', // 要排序的字段
		sortOrder : 'desc', // 排序规则
		columns : [ {
			checkbox : true, // 显示一个勾选框
			align : 'center' // 居中显示
		}, {
			field : 'name', // 返回json数据中的name
			title : '名称', // 表格表头显示文字
			align : 'center', // 左右居中
			valign : 'middle' // 上下居中
		}, {
			field : 'star',
			title : 'Star',
			align : 'center',
			valign : 'middle'
		}, {
			field : 'license',
			title : '许可',
			align : 'center',
			valign : 'middle'
		}, {
			field : 'url',
			title : "url",
			align : 'center',
			valign : 'middle',
			width : 160, // 定义列的宽度，单位为像素px
		/*
		 * formatter: function (value, row, index) { return '<a
		 * href="'+value+'">'+value+'</a>'; }
		 */
		} ],
		onLoadSuccess : function() { // 加载成功时执行
			console.info("加载成功");
		},
		onLoadError : function() { // 加载失败时执行
			console.info("加载数据失败");
		}

	});
}