$(document).ready(function() {
	$.get("static/wcjs/leftNavBar.json", function(data, status) {
		navBar(data);
		blindHPClass()
		contabsInit()
	});
}
)
// 生成菜单
function navBar(data) {
	var html = '';
	for ( var i in data) {
		html += LeftNavBar(data[i], 1)
	}
	$("#side-menu").append(html);
}
// 生成子菜单
function LeftNavBar(data, floor) {
	var html = '';
	html += '<li> '
	if (data.children) {
		html += '<a href="#"> '
		html += '<i class="' + data.icon + '"></i>'
		html += '<span class="nav-label">' + data.title + '</span>'
		html += '<span class="fa arrow"></span>'
		html += '</a>'
		// 进行递归调用
		html += '<ul class="nav nav-' + getEn(floor+1) + '-level">'
		for ( var i in data.children) {
			html += LeftNavBar(data.children[i], floor + 1)
		}
		html += '</ul>'
	} else {
		html += '<a class="J_menuItem" href="' + data.href + '">'
		html += '<i class="' + data.icon + '"></i>'
		html += '<span class="nav-label">' + data.title + '</span>'
		html += '</a>'
	}
	html += '</li>'
	return html;
}
// 获取英文层
function getEn(floor) {
	if (floor == 2) {
		return "second"
	} else if (floor == 3) {
		return "third"
	} else if (floor == 4) {
		return "fourth"
	}
}
