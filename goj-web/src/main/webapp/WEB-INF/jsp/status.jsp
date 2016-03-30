<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<title>GOJ::Status</title>
</head>
<body>
	<jsp:include page="head.jsp" />
	<div class="container">
		<div class="block block-info">
			<div class="heading"></div>
			<table class="table table-bordered table-hover">
				<thead>
					<tr>
						<th>RunID</th>
						<th>User</th>
						<th>Problem</th>
						<th>Verdict</th>
						<th>Time</th>
						<th>Memory</th>
						<th>Language</th>
						<th>Length</th>
						<th>Submit Time</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${statusList}" var="status">
						<tr>
							<td>${status.id}</td>
							<td>${status.user_id}</td>
							<td><a href="/goj/${status.problem_id}">${status.problem_id}</a></td>
							<c:choose>
								<c:when test="${status.verdict == 1}">
									<td class="accepted">Accepted</td>
								</c:when>
								<c:when test="${status.verdict == 0}">
									<td class="wrong">Wrong Answer</td>
								</c:when>
								<c:when test="${status.verdict == 2}">
									<td class="queuing">Queuing</td>
								</c:when>
								<c:when test="${status.verdict == 3}">
									<td class="wrong">Compile_Error</td>
								</c:when>
								<c:otherwise>
									<td class="error">Error</td>
								</c:otherwise>
							</c:choose>
							<c:choose>
								<c:when test="${status.time != null}">
									<td>${status.time}</td>
								</c:when>
								<c:otherwise>
									<td>---</td>
								</c:otherwise>
							</c:choose>
							<c:choose>
								<c:when test="${status.memory != null}">
									<td>${status.memory}</td>
								</c:when>
								<c:otherwise>
									<td>---</td>
								</c:otherwise>
							</c:choose>
							<c:choose>
								<c:when test="${status.language == 1}">
									<td>C</td>
								</c:when>
								<c:when test="${status.language == 2}">
									<td>C++</td>
								</c:when>
								<c:when test="${status.language == 3}">
									<td>Java</td>
								</c:when>
								<c:otherwise>
									<td>---</td>
								</c:otherwise>
							</c:choose>
							<td>${status.length}B</td>
							<td><fmt:formatDate value="${status.create_time}" pattern="yyyy-MM-dd HH:mm:ss" type="date" dateStyle="long"/></td>
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