<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
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
        <button type="submit" class="btn btn-default">Submit</button>
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
          </ul>
        </li>
      </ul>
</nav>

<div class="row">
	<div class="col-lg-1"></div>
	<div class="col-lg-10">
		<ul class="nav nav-tabs" role="tablist">
 			 <li role="presentation"><a href="news.jsp">最新资讯</a></li>
 			 <li role="presentation" class="active"><a href="international.jsp">国际新闻</a></li>
 			 <li role="presentation"><a href="domestic.jsp">国内新闻</a></li>
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
        <h3>外交部回应“特朗普蔡英文通电话”</h3>
        <p>外交部发言人耿爽就美国当选总统特朗普同台湾地区领导人蔡英文通电话答记者问</p>
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
        <h3>美国众议院通过新国防授权法案 将扩军21000名</h3>
        <p>据美国《华盛顿邮报》报道，美国众议院于昨日以压倒性多数通过了《2017财年国防授权法案》。</p>
        <p><a href="#" class="btn btn-primary" role="button">详情</a> 
           <a href="#" class="btn btn-default" role="button">讨论</a>
           <a href="#" class="btn btn-default" role="button">发表看法</a></p>
      </div>
    </div>
  	</div>
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/g3.jpg" alt="...">
      <div class="caption">
        <h3>意大利明天修宪公投，为啥会震撼整个欧洲？</h3>
        <p>因党派斗争加上经济发展疲软，经常会出现某些立法法案被两院“踢皮球”，长期通不过的现象。直接后果是意大利政府更迭频繁。</p>
        <p><a href="#" class="btn btn-primary" role="button">详情</a> 
           <a href="#" class="btn btn-default" role="button">讨论</a>
           <a href="#" class="btn btn-default" role="button">发表看法</a></p>
      </div>
    </div>
  	</div>
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/g4.jpg" alt="...">
      <div class="caption">
        <h3>“干政门”独立检察官：将面对面调查朴槿惠</h3>
        <p>负责牵头调查韩国总统亲信干政事件的独立检察官朴英洙2号在接受媒体采访时表示，将不拘泥于检方调查的结果，从头开始调查案件。</p>
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
      <img src="img/g5.jpg" alt="...">
      <div class="caption">
        <h3>就仲裁案进行中菲对话？ 菲外长：可能一辈子都不会</h3>
        <p>菲律宾媒体Update Philippines12月2日报道称，菲律宾外交部长亚赛表示，不会根据南海仲裁案裁决与中国进行双边对话。</p>
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
        <h3>果敢指挥官：原定与缅政府的会谈取消 希望中国调停</h3>
        <p>缅北军事冲突持续，缅甸和平委员会主席丁苗温原计划与四个地方武装组织代表会谈，但会谈今天下午确定取消。</p>
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
        <h3>中美关系走向如何？澳前总理声称：球在特朗普这边</h3>
        <p>面对世界秩序变化，中国极其务实的反应 如今，中国政策分析人士竭力想弄清中美关系的今后走向。</p>
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
        <h3>波兰官方宣布耶稣加冕为波兰国王</h3>
        <p>11月19日，在波兰克拉科夫神恩大教堂内，在波兰总统的见证下，神父们宣布耶稣为波兰国王。</p>
        <p><a href="#" class="btn btn-primary" role="button">详情</a> 
           <a href="#" class="btn btn-default" role="button">讨论</a>
           <a href="#" class="btn btn-default" role="button">发表看法</a></p>
      </div>
    </div>
  	</div>
  	
</div>

</body>
</html>
