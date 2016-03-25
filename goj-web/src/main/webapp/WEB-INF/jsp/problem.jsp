<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

    <link rel="stylesheet" href="static/css/style.css">
    <link rel="stylesheet" href="static/css/base.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="http://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <title></title>
</head>
<body>
<nav></nav>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
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
                <li class="active"><a href="problemlist.html">Problem</a></li>
                <li><a href="status.html">Status</a></li>
                <li><a href="ranklist.html">Ranklist</a></li>
                <li><a href="contest.html">Contest</a></li>
                <li class="dropdown"></li>
            </ul>
            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Problem Id">
                </div>
                <button type="submit" class="btn btn-default">Search</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">TJK<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="profile.html">Profile</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Exit</a></li>
                    </ul>
                </li>
                <li><a href="#">Logout</a></li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container-fluid -->
</nav>
<div class="container">
    <div class="col-md-8">
        <div class="block block-info">
            <div class="block block-container">
                <h3 class="problem-header">A + B Problem</h3>
                <div class="prob-info">
                    <span>Time Limit: 2000/1000MS (Java/Others) Memory Limit: 128000/64000KB (Java/Others)</span>
                </div>
                <h4>Problem Description</h4>
                <div class="prob-content">Calculate <em>a</em> + <em>b</em>b.</div>
                <h4>Input</h4>
                <div class="prob-content">
                    There are multiple cases.<br/>Ease case contains two integers <em>a</em>, <em>b</em> (1 ≤ a, b ≤ 1000).
                </div>
                <h4>Output</h4>
                <div class="prob-content">
                    Output the result of <em>a</em> + <em>b</em> in a single line.
                </div>
                <h4>Sample Input</h4>
                <div class="prob-content">
                    <pre class="sample">1 1<br/>2 2</pre>
                </div>
                <h4>Sample Output</h4>
                <div class="prob-content">
                     <pre class="sample">2<br/>10</pre>
                </div>
                <h4>Source</h4>
                <div class="prob-content">
                    GOJ
                </div>
                <h4>Manager</h4>
                <div class="prob-content">
                    Taurus
                </div>
            </div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="block block-info block-container">
            <div class="form-group forms-group-sm">
                <label for="pid" class="control-label">Problem</label>
                <input id="pid" type="type" value="1000" class="form-control" readonly="true">
            </div>
            <div class="form-group forms-group-sm">
                <label for="pid" class="control-label">Language</label>
                <select class="form-control input-sm">
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