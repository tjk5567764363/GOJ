<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<!DOCTYPE html>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- 新 Bootstrap 核心 CSS 文件 -->
	<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
	
	<link rel="stylesheet" href="/goj/static/css/style.css">
	<link rel="shortcut icon" type="image/x-icon" href="/goj/static/image/icon.jpg" />
	
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<title>GOJ::Problems</title>
</head>
<body>
	<jsp:include page="head.jsp" />
	<div class="container">
		<div class="block block-info">
			<div class="heading"></div>
			<table class="table table-bordered table-hover">
				<thead>
					<tr>
						<th style="width: 65px;">ID</th>
						<th style="text-align: left;">Title</th>
						<th style="width: 160px;">Source</th>
						<th style="width: 160px;">Ratio(AC/submit)</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${problemList}" var="problem">
						<tr>
							<td>${problem.id}</td>
							<td style="text-align: left;"><a href="/goj/${problem.id}">${problem.title}</a></td>
							<td>${problem.source}</td>
							<c:choose>
								<c:when test="${problem.submit == 0}">
									<td>0.00% (${problem.solved}/${problem.submit})</td>
								</c:when>
								<c:otherwise>
									<td><fmt:formatNumber type="number" value="${problem.solved * 100.0 / problem.submit}" pattern="0.00" maxFractionDigits="2"/>% (${problem.solved}/${problem.submit})</td>
								</c:otherwise>
							</c:choose>
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
</body>
</html>