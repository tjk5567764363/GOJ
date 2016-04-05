<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
	<title>GOJ::Contest</title>
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
					<c:forEach items="${contestList}" var="contest">
						<tr>
							<td>${contest.id}</td>
							<td style="text-align: left;">
								<c:choose>
									<c:when test="${contest.type == 1}">
										<a href="javascript:;" class="getcontest" id="${contest.id}">${contest.title}</a>
									</c:when>
									<c:otherwise>
										<a href="/goj/contest/${contest.id}">${contest.title}</a>
									</c:otherwise>
								</c:choose>
							</td>
							<td><fmt:formatDate value="${contest.start_time}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
							<td>${contest.duration}</td>
							<c:choose>
								<c:when test="${contest.type == 1}">
									<td class="wrong">Private</td>
								</c:when>
								<c:otherwise>
									<td class="accepted">Public</td>
								</c:otherwise>
							</c:choose>
							<td>${contest.manager}</td>
						</tr>
					</c:forEach>
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
	
	<div class="modal fade" id="modal-password">
		<div class="modal-dialog modal-sm">
			<form action="/goj/contest/" id="f" method="post">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title">Password</h4>
					</div>
					<div class="modal-body">
						<input class="form-control" type="password" name="password" id="contentpwd" />
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">OK</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<script type="text/javascript" src="/goj/static/js/contest.js"></script>
</body>
</html>