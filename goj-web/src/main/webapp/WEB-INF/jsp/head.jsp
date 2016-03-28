<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<nav class="navbar navbar-default">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Home</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li class="active"><a href="/goj/">Problem</a></li>
				<li><a href="/goj/status/">Status</a></li>
				<li><a href="/goj/ranklist/">RankList</a></li>
				<li><a href="/goj/contest/">Contest</a></li>
				<li class="dropdown"></li>
			</ul>
			<form class="navbar-form navbar-left" role="search">
				<div class="form-group">
					<input id="search-problem-id" type="text" class="form-control" placeholder="Problem Id" onkeypress="if(event.keyCode==13) {$('#search-problem-id-btn').attr('href','/goj/'+ $(this).val()); $('#search-problem-id-btn').click();}"/>
				</div>
				<a href="#" id="search-problem-id-btn" class="btn btn-default" onclick="$(this).attr('href','/goj/'+ $('#search-problem-id').val())">Search</a>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="javascrip:;" data-toggle="modal" data-target="#modal-login">Login</a></li>
				<!-- 
				<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">TJK<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="profile.html">Profile</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">Exit</a></li>
					</ul>
				</li>
				<li><a href="#">Logout</a></li>
				 -->
				 <li><a href="javascrip:;" data-toggle="modal" data-target="#modal-regedit">Regedit</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid -->
</nav>

<div class="modal fade" id="modal-login">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title">Login</h4>
			</div>
			<div class="modal-body">
				<div class="container-fluid">
					<form action="#">
						<div class="form-group">
							<label>Account</label>
							<input type="text" class="form-control" placeholder="account"/>
						</div>
						<div class="form-group">
							<label>Password</label>
							<input type="password" class="form-control" placeholder="password"/>
						</div>
					</form>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary">Login</button>
			</div>
		</div>
	</div>
</div>

<div class="modal fade" id="modal-regedit">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title">Regedit</h4>
			</div>
			<div class="modal-body">
				<div class="container-fluid">
					<form action="#">
						<div class="form-group">
							<label>Account</label>
							<input type="text" class="form-control" placeholder="account"/>
						</div>
						<div class="form-group">
							<label>Password</label>
							<input type="password" class="form-control" placeholder="password"/>
						</div>
						<div class="form-group">
							<label>Nickname</label>
							<input type="text" class="form-control" placeholder="nickname"/>
						</div>
					</form>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary">Regedit</button>
			</div>
		</div>
	</div>
</div>
