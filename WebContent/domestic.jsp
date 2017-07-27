<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.news.oa.model.MessBoar" %>
<%@page import="com.news.oa.dao.*" %>

<html>
   <head>  
    <title>今日论点</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css" type="text/css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
   <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
   <script src="js/bootstrap.min.js"></script>
   <link rel="stylesheet" type="text/css" href="style.css">
  </head>
  
  <body>
<nav class="navbar navbar-inverse" role="navigation">
    <div class="container-fluid">
    
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="main.jsp">首页</a>
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="main.jsp">今日焦点</a></li>
        <li><a href="news.jsp">更多资讯</a></li>
        <li><a href="leavemessage.jsp">我的见解</a></li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">搜索</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">注销</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">${sessionScope.name}<span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="personage.jsp">我的资料</a></li>
            <li><a href="#">我的发言</a></li>
            <li><a href="#">账号设置</a></li>
            <li><a href="#">退出</a></li>
          </ul>
        </li>
      </ul>
</nav>

<div class="row">
	<div class="col-lg-1"></div>
	<div class="col-lg-10">
		<ul class="nav nav-tabs" role="tablist">
 			 <li role="presentation"><a href="news.jsp">最新资讯</a></li>
 			 <li role="presentation"><a href="international.jsp">国际新闻</a></li>
 			 <li role="presentation" class="active"><a href="domestic.jsp">国内新闻</a></li>
 			 <li role="presentation"><a href="war.jsp">军事新闻</a></li>
 			 <li role="presentation"><a href="recreation.jsp">娱乐新闻</a></li>
		</ul>
	</div>
	<div class="col-lg-1"></div>
</div>


<div class="row col-lg-10" style="margin:15px auto;float:none;">
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/g2.jpg" alt="...">
      <div class="caption">
        <h3>Thumbnail label</h3>
        <p>...</p>
        <p><a href="#" class="btn btn-primary" role="button">详情</a> 
           <a href="#" class="btn btn-default" role="button">讨论</a>
           <a href="#" class="btn btn-default" role="button">发表看法</a></p>
      </div>
    </div>
  	</div>
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/z1.jpg" alt="...">
      <div class="caption">
        <h3>中国实现首次产出量子非局域性 曾是不解之谜</h3>
        <p>近日，我国科研人员在量子力学基础研究中取得重要进展，他们在世界上第一次利用量子互文性产生量子非局域性，为把量子计算和量子通讯研究融为一体打下坚实基础。</p>
        <p><a href="#" class="btn btn-primary" role="button">详情</a> 
           <a href="#" class="btn btn-default" role="button">讨论</a>
           <a href="#" class="btn btn-default" role="button">发表看法</a></p>
      </div>
    </div>
  	</div>
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/z2.jpg" alt="...">
      <div class="caption">
        <h3>王毅：今年中菲关系华丽转身 南海问题重回正确轨道</h3>
        <p>据外交部网站消息，外交部长王毅3日在2016年国际形势与中国外交研讨会开幕式上表示，今年中国在周边方向最引人瞩目的一项成果毫无疑问就是中菲关系实现转圜。</p>
        <p><a href="#" class="btn btn-primary" role="button">详情</a> 
           <a href="#" class="btn btn-default" role="button">讨论</a>
           <a href="#" class="btn btn-default" role="button">发表看法</a></p>
      </div>
    </div>
  	</div>
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/z3.png" alt="...">
      <div class="caption">
        <h3>王毅答凤凰：台湾方面小动作改变不了一个中国格局</h3>
        <p>12月3日上午，在回答凤凰卫视记者有关蔡英文与特朗普通电话的问题时，外交部长王毅表示：这只是台湾方面搞的一个小动作，根本不可能改变国际社会已经形成的一个中国格局。</p>
        <p><a href="#" class="btn btn-primary" role="button">详情</a> 
           <a href="#" class="btn btn-default" role="button">讨论</a>
           <a href="#" class="btn btn-default" role="button">发表看法</a></p>
      </div>
    </div>
  	</div>
</div>

<div class="row col-lg-10" style="margin:15px auto;float:none;">
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/z4.png" alt="...">
      <div class="caption">
        <h3>中国海警讲述抢救菲渔民始末：顶14级台风救人</h3>
        <p>《环球时报》记者从中国海警方面获悉，2日15时许，就中方日前在黄岩岛海域救起的2名落水菲律宾渔民，中菲双方顺利完成人员交接。</p>
        <p><a href="#" class="btn btn-primary" role="button">详情</a> 
           <a href="#" class="btn btn-default" role="button">讨论</a>
           <a href="#" class="btn btn-default" role="button">发表看法</a></p>
      </div>
    </div>
  	</div>
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/z5.jpg" alt="...">
      <div class="caption">
        <h3>潘石屹：推出房产税十分必要 否则造成巨大浪费</h3>
        <p>SOHO中国董事长潘石屹、SOHO中国首席执行官张欣在麻省理工（MIT）的一次讲座中表示，出台房产税十分必要，否则将造成巨大的浪费。</p>
        <p><a href="#" class="btn btn-primary" role="button">详情</a> 
           <a href="#" class="btn btn-default" role="button">讨论</a>
           <a href="#" class="btn btn-default" role="button">发表看法</a></p>
      </div>
    </div>
  	</div>
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/g2.jpg" alt="...">
      <div class="caption">
        <h3>渐进式延退方案将出台 最终年龄或锁定65岁</h3>
        <p>目前德国和英国纷纷计划把退休年龄延长到69岁，而中国的延迟退休方案尚未对外公布，对于延迟退休最终锁定的年龄，《中国经营报》记者获悉，方案或锁定在65岁。</p>
        <p><a href="#" class="btn btn-primary" role="button">详情</a> 
           <a href="#" class="btn btn-default" role="button">讨论</a>
           <a href="#" class="btn btn-default" role="button">发表看法</a></p>
      </div>
    </div>
  	</div>
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/g2.jpg" alt="...">
      <div class="caption">
        <h3>港媒：中国研发活病毒疫苗 或可消灭任何病毒</h3>
        <p>消息网12月3日报道港媒称，中国科学家或许已经找到创造有效疫苗对付世界最致命病毒的关键——通过打破传统疫苗学的两种禁忌。</p>
        <p><a href="#" class="btn btn-primary" role="button">详情</a> 
           <a href="#" class="btn btn-default" role="button">讨论</a>
           <a href="#" class="btn btn-default" role="button">发表看法</a></p>
      </div>
    </div>
  	</div>
  	
</div>

</body>
</html>
