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
	<link rel="stylesheet" href="/goj/static/css/base.css">
	<link rel="shortcut icon" type="image/x-icon" href="/goj/static/image/icon.jpg" />
	
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	
	<!-- SyntaxHighlighter -->
	<script type="text/javascript" src="/goj/static/js/shCore.js"></script>
	<script type="text/javascript" src="/goj/static/js/shBrushCpp.js"></script>
	<link href="/goj/static/css/shCore.css" rel="stylesheet" type="text/css" />
	<link href="/goj/static/css/shThemeDefault.css" rel="stylesheet" type="text/css" />
	
	<script type="text/javascript">
		SyntaxHighlighter.all()
	</script>
	
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<title>GOJ::Share</title>
</head>
<body>
	<jsp:include page="head.jsp" />
	<div class="container">
		<div class="block block-info">
			<div class="block-container">
				<form action="/goj/share/" method="post" class="form-horizontal">
					<br/>
					<div class="form-group">
						<label class="col-sm-3 control-label">Title :</label>
						<div class="col-sm-5">
							<input type="text" name="title" class="form-control"/>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">Syntax :</label>
						<div class="col-sm-2">
							<select class="form-control" name="syntax">
								<option value="1">C</option>
								<option value="2" selected="selected">C++</option>
								<option value="3">Java</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">Theme :</label>
						<div class="col-sm-2">
							<select class="form-control" name="theme">
								<option value="0" selected="selected">Default</option>
								<option value="1">Eclipse</option>
								<option value="2">Midnight</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">Content :</label>
						<div class="col-sm-8">
							<textarea rows="12" class="form-control" name="content"></textarea>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-3"></div>
						<div class="col-sm-9">
							<button type="submit" class="btn btn-primary">Share!</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>