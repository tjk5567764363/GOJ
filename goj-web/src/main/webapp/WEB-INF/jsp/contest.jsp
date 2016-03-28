<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<title></title>
</head>
<body>
	<jsp:include page="head.jsp" />
	<div class="container">
		<div class="block block-info">
			<div class="heading">
				<a style="float: right !important" class="btn btn-default btn-sm" href="/goj/contest/addcontest">Add Contest</a>
			</div>
			<table class="table table-bordered table-hover">
				<thead>
					<tr>
						<th style="width: 65px;">ID</th>
						<th style="text-align: left;">Title</th>
						<th style="width: 180px;">Start Time</th>
						<th style="width: 100px;">Duration</th>
						<th style="width: 100px;">Type</th>
						<th style="width: 125px;">Manager</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<c:forEach items="${contestList}" var="contest">
							<td>${contest.id}</td>
							<td style="text-align: left;">
								<a href="/goj/contest/${contest.id}">${contest.title}</a>
							</td>
							<td>${contest.start_time}</td>
							<td>${contest.length}</td>
							<td>${contest.type}</td>
							<td>${contest.manager}</td>
						</c:forEach>
					</tr>
				</tbody>
				<tfoot>
					<tr>
						<td colspan="9" class="odd">
							<nav>
								<ul class="pagination" style="margin: 0px;">
									<li><a href="#" aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
									</a></li>
									<li><a href="#">1</a></li>
									<li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
									</a></li>
								</ul>
							</nav>
						</td>
					</tr>
				</tfoot>
			</table>
		</div>
	</div>
</body>
</html>