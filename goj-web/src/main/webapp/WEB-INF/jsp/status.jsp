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
							<td>
								<a href="javascript:;" onclick="$('#modal-code').modal('toggle');$('#modal-code-pre').text($('#hidden-${status.id}').text())"> <c:choose>
										<c:when test="${status.language == 1}">
											C
										</c:when>
										<c:when test="${status.language == 2}">
											C++
										</c:when>
										<c:when test="${status.language == 3}">
											Java
										</c:when>
										<c:otherwise>
											<td>---</td>
										</c:otherwise>
									</c:choose>
								</a>
								<pre hidden="true" id="hidden-${status.id}"><c:out value="${status.source_code}" escapeXml="true"></c:out></pre>
							</td>
							<td>${status.length}B</td>
							<td><fmt:formatDate value="${status.create_time}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
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

	<div class="modal fade" id="modal-code">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">Code</h4>
				</div>
				<div class="modal-body">
					<pre id="modal-code-pre"></pre>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>