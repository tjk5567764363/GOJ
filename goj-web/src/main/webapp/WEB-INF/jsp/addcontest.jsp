<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- 新 Bootstrap 核心 CSS 文件 -->
	<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
	
	<link rel="stylesheet" href="/goj/static/css/style.css">
	<link rel="stylesheet" href="/goj/static/css/table.css">
	<link rel="stylesheet" href="/goj/static/css/base.css">
	
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<title></title>
</head>
<body>
	<jsp:include page="head.jsp" />
	<form action="/goj/contest/addcontest" method="post">
		<div class="container">
			<div class="col-md-6">
				<div class="block block-info">
					<div class="heading">Add Contest</div>
					<table class="table table-bordered tdcenter">
						<tr>
							<th>Title</th>
							<td><input name="title" class="form-control input-sm" type="text" /></td>
						</tr>
						<tr style="text-align: left;">
							<th>Begin Time</th>
							<td class="form-group-sm form-inline"><input name="start_time" type="date" class="form-control" />&nbsp; <input id="hour" maxlength="2" type="text" value="0" class="form-control width-mini">&nbsp;:&nbsp; <input id="min" maxlength="2" type="text" value="0" class="form-control width-mini"></td>
						</tr>
						<tr style="text-align: left;">
							<th>Length</th>
							<td class="form-group-sm form-inline"><input id="dd" name="duration" maxlength="2" type="text" value="0" class="form-control width-mini">&nbsp;天&nbsp; <input id="hh" maxlength="2" type="text" value="5" class="form-control width-mini">&nbsp;:&nbsp; <input id="mm" maxlength="2" type="text" value="0" class="form-control width-mini"></td>
						</tr>
						<tr>
							<th>Password</th>
							<td class="form-group-sm"><input id="psw" name="password" type="password" value="" class="form-control"> <span class="text-info">Leave blank to make it Public.</span></td>
						</tr>
						<tr>
							<th>Description</th>
							<td><textarea id="desc" name="description" rows="5" class="form-control"></textarea></td>
						</tr>
						<tr>
							<th>Announcement</th>
							<td><textarea id="anc" name="announcement" rows="5" class="form-control"></textarea></td>
						</tr>
					</table>
				</div>
			</div>
			<div class="col-md-6">
				<div class="block block-info">
					<table class="table table-bordered tdcenter">
						<thead>
							<tr>
								<th width="60px"><a id="add" href="javascript:;">+</a></th>
								<th width="100px">Probleam ID</th>
								<th width="60px">NO</th>
								<th>Title</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><a href="javascript:;">x</a></td>
								<td><input type="text" class="form-control input-sm" /></td>
								<td>A</td>
								<td></td>
							</tr>
						</tbody>
					</table>
				</div>
				<a class="btn btn-default">Submit</a>
			</div>
		</div>
	</form>
</body>
</html>