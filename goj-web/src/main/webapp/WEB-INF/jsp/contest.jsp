<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<title></title>
</head>
<body>
	<jsp:include page="head.jsp" />
	<div class="container">
		<div class="col-md-2">
			<div class="list-group">
				<a href="#" class="list-group-item active">Information</a> 
				<a href="#" class="list-group-item">Problems</a> 
				<a href="#" class="list-group-item">Status</a> 
				<a href="#" class="list-group-item">Ranklist</a>
			</div>
		</div>
		<div class="col-md-10">
			<div class="block block-info">
				<div>
					<table class="table table-bordered table-hover">
						<thead>
							<tr>
								<th style="width: 65px;"></th>
								<th style="width: 65px;">#</th>
								<th style="width: 65px;">ID</th>
								<th style="text-align: left;">Title</th>
								<th style="width: 160px;">AC/Submit</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${problemList}" var="problem">
								<tr>
									<td>
										<c:if test="${problem.isSolved == 1}">
											<span class="glyphicon glyphicon-ok"></span>
										</c:if>
									</td>
									<td>${problem.contestNo}</td>
									<td><a href="/goj/${problem.id}">${problem.id}</a></td>
									<td style="text-align: left;"><a href="/goj/${problem.id}">${problem.title}</a></td>
									<c:choose>
										<c:when test="${problem.submit == 0}">
											<td>0.00% (${problem.solved}/${problem.submit})</td>
										</c:when>
										<c:otherwise>
											<td>${problem.solved}/${problem.submit}</td>
										</c:otherwise>
									</c:choose>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div style="display:none;"></div>
				<div style="display:none;"></div>
				<div style="display:none;"></div>
			</div>
		</div>
	</div>
</body>
</html>