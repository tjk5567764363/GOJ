<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	<title>GOJ::Problem ${problem.id}</title>
</head>
<body>
	<jsp:include page="head.jsp" />
	<div class="container">
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
				<div class="form-group forms-group-sm">
					<label for="pid" class="control-label">Problem</label> <input id="pid" type="type" value="${problem.id}" class="form-control" readonly="true">
				</div>
				<div class="form-group forms-group-sm">
					<label for="pid" class="control-label">Language</label> <select class="form-control input-sm">
						<option value="1">C</option>
						<option value="2" selected="true">C++</option>
						<option value="3">Java</option>
					</select>
				</div>
				<div class="form-group forms-group-sm">
					<label for="pid" class="control-label">Source Code</label>
					<textarea id="code" rows="15" class="form-control"></textarea>
				</div>
				<div class="form-group">
					<a href="#" class="btn btn-default">Submit</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>