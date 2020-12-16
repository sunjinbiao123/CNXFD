<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用例管理</title>
<link href="${ctx}/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body class="body1">
 <div class="div1">
  <image src="${ctx}/images/logo.png" class="image1"></image>
  <image src="${ctx}/images/slogan.png" class="image2"></image>
  <image src="${ctx}/images/admin.png" style="float:right;width:28px;margin-right:50px;margin-top:6px">
   <div  class="admin"  style="float:left;margin-left:480px">
  	<ul class="level">
  		<li>Admin
  			<ul class=tow>
  				<li ><a href="#">修改密码</a></li>
  				<li><a href="#">退出</a></li>
  			</ul>
  		</li>
  	</ul>
  
  </div>

 </div>
 <div class="div2">
 </div>
 <div class="left" style="background: #f0f9fd;">
  <div class="homepage">
   <image src="${ctx}/images/shou.png" class="i3"></image>
   <div class="shouye"><a href="${ctx}/home.jsp">首页</a></div>
  </div>
  <div class="X1">
  </div>
  <div class="homepage">
   <div class="shouye1"><a href="${ctx}/project.jsp">项目管理</a></div>
  </div>
   <div class="X1">
  </div>
  <div class="homepage">
   <div class="shouye1"><a href="${ctx}/port.jsp">接口管理</a></div>
  </div>
   <div class="X1">
  </div>
  <div class="homepage">
   <div class="shouye1"><a href="${ctx}/usecase.jsp">用例管理</a></div>
  </div>
   <div class="X1">
  </div>
  <div class="homepage">
   <div class="shouye1"><a href="${ctx}/usecases.jsp">用例集管理</a></div>
  </div>
   <div class="X1">
  </div>
 </div>
<div class="right">
  <div class="top">
    <input type="text" id="url" value="请输入项目名"/>
    <input type="submit" value="搜索" id="button1"/>
  </div>
  <table class="table1">
   <tr bgcolor=#f5f5f5 height="45">
    <th>
    <form method="post" action="">
    <input type="checkbox" name="num1">
    </form>
    </th>
    <th>序号</th>
    <th>用例名</th>
    <th>请求方法</th>
    <th>URL</th>
    <th>参数语言</th>
    <th>用例集</th>
    <th>创建者</th>
    <th>创建日期</th>
    <th>操作</th>
   </tr>
   </tr>
	<tr>
		<td><input type="checkbox" name="num1"></td>
		<td value="sort">${id}</td>
		<td>${casename}</td>
		<td>${reqway}</td>
		<td>${url}</td>
		<td>${sumway}</td>
		<td>${cases}</td>
		<td>${owner}</td>
		<td>${data}</td>
		<td>
			<a>编辑</a>
			<button>删除</button>
		</td>
		
	</tr>
   </table>
   <input type="button" id="all" value="全选">
   <input type="button" id="Fall" value="反选">
   <div  class="operation">
  	<ul calss="op1">
  		<li id="li1" style="font-size:15px">更多操作
  			<ul>
  				<li><a href="#">批量删除</a></li>
  				<li><a href="#">批量执行</a></li>
  			</ul>
  		</li>
  	</ul>
  
  </div>
  </div>
    
</body>
</html>