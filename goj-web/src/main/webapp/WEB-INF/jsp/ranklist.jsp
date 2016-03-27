<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- 新 Bootstrap 核心 CSS 文件 -->
	<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
	
	<link rel="stylesheet" href="/goj/static/css/style.css">
	
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
			<div class="heading"></div>
			<table class="table table-bordered table-hover">
				<thead>
					<tr>
						<th style="width: 60px;">Rank</th>
						<th style="width: 155px;">User</th>
						<th style="width: 155px;">Nickname</th>
						<th>Signature</th>
						<th style="width: 70px;">Solved</th>
						<th style="width: 70px;">Submit</th>
						<th style="width: 70px;">AC_Ratio</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>rrtyui</td>
						<td>Sithope</td>
						<td>风华绝代</td>
						<td>128</td>
						<td>457</td>
						<td>28.01%</td>
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