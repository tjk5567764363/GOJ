<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<!-- 新 Bootstrap 核心 CSS 文件 -->
	<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
	
	<link rel="stylesheet" href="/goj/static/css/style.css">
	
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<title></title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
					<tr>
						<td>85772</td>
						<td>904766993</td>
						<td>1735</td>
						<td class="accepted">Accepted</td>
						<td>---</td>
						<td>---</td>
						<td>C++</td>
						<td>---</td>
						<td>2015-12-10 17:30:24</td>
					</tr>
					<tr>
						<td>85771</td>
						<td>904766993</td>
						<td>1735</td>
						<td class="accepted">Accepted</td>
						<td>---</td>
						<td>---</td>
						<td>C++</td>
						<td>418 B</td>
						<td>2015-12-10 17:24:10</td>
					</tr>
					<tr>
						<td>85770</td>
						<td>904766993</td>
						<td>1726</td>
						<td class="wrong">Wrong Answer</td>
						<td>---</td>
						<td>---</td>
						<td>C++</td>
						<td>500 B</td>
						<td>2015-12-10 17:03:15</td>
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