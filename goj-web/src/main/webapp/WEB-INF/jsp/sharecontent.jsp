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
	<script type="text/javascript" src="/goj/static/js/shBrushJava.js"></script>
	<link href="/goj/static/css/shCore.css" rel="stylesheet" type="text/css" />
	
	<c:choose>
		<c:when test="${share.theme == 0}">
			<link href="/goj/static/css/shThemeDefault.css" rel="stylesheet" type="text/css" />
		</c:when>
		<c:when test="${share.theme == 0}">
			<link href="/goj/static/css/shThemeEclipse.css" rel="stylesheet" type="text/css" />
		</c:when>
		<c:when test="${share.theme == 0}">
			<link href="/goj/static/css/shThemeMidnight.css" rel="stylesheet" type="text/css" />
		</c:when>
		<c:otherwise>
			<link href="/goj/static/css/shThemeDefault.css" rel="stylesheet" type="text/css" />
		</c:otherwise>
	</c:choose>
	
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
				<div class="col-md-2"></div>
				<div class="col-md-8">
					<c:choose>
						<c:when test="${share.syntax == 1 || share.syntax == 2}">
							<pre class="brush: cpp">
						</c:when>
						<c:when test="${share.syntax == 3}">
							<pre class="brush: java">
						</c:when>
						<c:otherwise>
							<pre>
						</c:otherwise>
					</c:choose>
					${share.content}
					</pre>
				</div>
				<div class="col-md-2"></div>
			</div>
		</div>
	</div>
</body>
</html>