<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- 新 Bootstrap 核心 CSS 文件 -->
	<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
	
	<link rel="stylesheet" href="/goj/static/css/style.css">
	<link rel="stylesheet" href="/goj/static/css/base.css">
	<link rel="shortcut icon" type="image/x-icon" href="/goj/static/image/icon.jpg" />
	
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<title>GOJ::${user.account}</title>
</head>
<body>
	<jsp:include page="head.jsp" />
	<div class="container">
		<div class="col-md-8">
			<div class="block block-info">
				<div class="block block-container">
					<h3>${user.account}</h3>
					<span>${user.nick_name}</span>
					<ul class="user-info form-group">
						<li>Rank:<span></span></li>
						<li>Solved:<span>${user.solved}</span></li>
						<li>Submit:<span>${user.submit}</span></li>
						<li>Email:<span>${user.email}</span></li>
						<li>School:<span>${user.school}</span></li>
						<li>Last Login:<span><fmt:formatDate value="${user.update_time}" pattern="yyyy-MM-dd HH:mm:ss"/></span></li>
						<li>Registered:<span><fmt:formatDate value="${user.create_time}" pattern="yyyy-MM-dd HH:mm:ss"/></span></li>
					</ul>
				</div>
			</div>
		</div>

		<div class="col-md-4">
			<div class="block block-info">
				<div class="block block-container">
					<div class="head">
						List of <span class="success-text">solved</span> problems
					</div>
					<div class="prob-list">
						<a href="/problem?pid=1056" class="pid">1056</a> <a href="/problem?pid=1088" class="pid">1088</a> <a href="/problem?pid=1090" class="pid">1090</a> <a href="/problem?pid=1096" class="pid">1096</a> <a href="/problem?pid=1099" class="pid">1099</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>