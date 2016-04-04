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
	<title>GOJ::${contest.title}</title>
</head>
<body>
	<jsp:include page="head.jsp" />
	<div class="container">
		<div class="col-md-2">
			<div class="list-group">
				<a href="javascript:;" class="list-group-item active">Overview</a> 
				<a href="javascript:;" class="list-group-item">Problem</a> 
				<a href="javascript:;" class="list-group-item">Status</a> 
				<a href="javascript:;" class="list-group-item">Ranklist</a>
			</div>
		</div>
		<div class="col-md-10">
			<div class="block block-info">
				<div id="overview">
					<input type="hidden" value="${contest.id}" id="contest-id" />
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
											<span class="glyphicon glyphicon-ok" style="color: green;"></span>
										</c:if>
									</td>
									<td>${problem.contestNo}</td>
									<td><a href="/goj/${problem.id}">${problem.id}</a></td>
									<td style="text-align: left;"><a href="javascript:;" data="${problem.id}" class="problem-title">${problem.title}</a></td>
									<td>${problem.solved} / ${problem.submit}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div id="problem" style="display:none;">
					<div class="col-md-8">
						<div class="block block-info">
							<div class="block block-container">
								<h3 class="problem-header">${problem.title}</h3>
								<div class="prob-info">
									<span>Time Limit: 2000/1000MS (Java/Others) Memory Limit: 128000/64000KB (Java/Others)</span>
								</div>
								<h4>Problem Description</h4>
								<div class="prob-content">
									${problem.description}
								</div>
								<h4>Input</h4>
								<div class="prob-content">
									${problem.input}
								</div>
								<h4>Output</h4>
								<div class="prob-content">
									${problem.output}
								</div>
								<h4>Sample Input</h4>
								<div class="prob-content">
									<pre class="sample">${problem.sample_input}</pre>
								</div>
								<h4>Sample Output</h4>
								<div class="prob-content">
									<pre class="sample">${problem.sample_output}</pre>
								</div>
								<h4>Source</h4>
								<div class="prob-content">${problem.source}</div>
								<h4>Manager</h4>
								<div class="prob-content">${problem.manager}</div>
							</div>
						</div>
					</div>
					<div class="col-md-4">
						<div class="block block-info block-container">
							<form action="/goj/status/${problem.id}" method="post">
								<input type="hidden" name="type" value="1" />
								<div class="form-group forms-group-sm">
									<label for="pid" class="control-label">Problem</label>
									<input id="pid" type="text" value="${problem.id}" class="form-control" readonly="readonly">
								</div>
								<div class="form-group forms-group-sm">
									<label for="pid" class="control-label">Language</label> 
									<select class="form-control input-sm" name="language">
										<option value="1">C</option>
										<option value="2" selected="selected">C++</option>
										<option value="3">Java</option>
									</select>
								</div>
								<div class="form-group forms-group-sm">
									<label for="pid" class="control-label">Source Code</label>
									<textarea id="code" rows="15" class="form-control" name="source_code"></textarea>
								</div>
								<div class="form-group">
									<button type="submit" class="btn btn-default">Submit</button>
								</div>
							</form>
						</div>
					</div>
				</div>
				<div id="status" style="display:none;"></div>
				<div id="ranklist" style="display:none;"></div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="/goj/static/contest.js"></script>
</body>
</html>