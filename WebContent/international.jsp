<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="com.news.oa.model.MessBoar" %>
<%@page import="com.news.oa.dao.*" %>

<html>
   <head>  
    <title>�����۵�</title>
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
      <a class="navbar-brand" href="main.jsp">��ҳ</a>
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="main.jsp">���ս���</a></li>
        <li><a href="news.jsp">������Ѷ</a></li>
        <li><a href="leavemessage.jsp">�ҵļ���</a></li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">ע��</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">${sessionScope.name}<span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="personage.jsp">�ҵ�����</a></li>
            <li><a href="#">�ҵķ���</a></li>
            <li><a href="#">�˺�����</a></li>
            <li><a href="#">�˳�</a></li>
          </ul>
          </ul>
        </li>
      </ul>
</nav>

<div class="row">
	<div class="col-lg-1"></div>
	<div class="col-lg-10">
		<ul class="nav nav-tabs" role="tablist">
 			 <li role="presentation"><a href="news.jsp">������Ѷ</a></li>
 			 <li role="presentation" class="active"><a href="international.jsp">��������</a></li>
 			 <li role="presentation"><a href="domestic.jsp">��������</a></li>
 			 <li role="presentation"><a href="war.jsp">��������</a></li>
 			 <li role="presentation"><a href="recreation.jsp">��������</a></li>
		</ul>
	</div>
	<div class="col-lg-1"></div>
</div>
<div class="row col-lg-10" style="margin:15px auto;float:none;">
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/g2.jpg" alt="...">
      <div class="caption">
        <h3>�⽻����Ӧ�������ղ�Ӣ��ͨ�绰��</h3>
        <p>�⽻�������˹�ˬ��������ѡ��ͳ������̨ͬ������쵼�˲�Ӣ��ͨ�绰�������</p>
        <p><a href="#" class="btn btn-primary" role="button">����</a> 
           <a href="#" class="btn btn-default" role="button">����</a>
           <a href="#" class="btn btn-default" role="button">������</a></p>
      </div>
    </div>
  	</div>
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/g2.jpg" alt="...">
      <div class="caption">
        <h3>��������Ժͨ���¹�����Ȩ���� ������21000��</h3>
        <p>����������ʢ���ʱ�����������������Ժ��������ѹ���Զ���ͨ���ˡ�2017���������Ȩ��������</p>
        <p><a href="#" class="btn btn-primary" role="button">����</a> 
           <a href="#" class="btn btn-default" role="button">����</a>
           <a href="#" class="btn btn-default" role="button">������</a></p>
      </div>
    </div>
  	</div>
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/g3.jpg" alt="...">
      <div class="caption">
        <h3>������������ܹ�Ͷ��Ϊɶ��������ŷ�ޣ�</h3>
        <p>���ɶ������Ͼ��÷�չƣ�����������ĳЩ������������Ժ����Ƥ�򡱣�����ͨ����������ֱ�Ӻ�����������������Ƶ����</p>
        <p><a href="#" class="btn btn-primary" role="button">����</a> 
           <a href="#" class="btn btn-default" role="button">����</a>
           <a href="#" class="btn btn-default" role="button">������</a></p>
      </div>
    </div>
  	</div>
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/g4.jpg" alt="...">
      <div class="caption">
        <h3>�������š��������٣��������������Ȼ�</h3>
        <p>����ǣͷ���麫����ͳ���Ÿ����¼��Ķ���������Ӣ�2���ڽ���ý��ɷ�ʱ��ʾ�����������ڼ췽����Ľ������ͷ��ʼ���鰸����</p>
        <p><a href="#" class="btn btn-primary" role="button">����</a> 
           <a href="#" class="btn btn-default" role="button">����</a>
           <a href="#" class="btn btn-default" role="button">������</a></p>
      </div>
    </div>
  	</div>
</div>

<div class="row col-lg-10" style="margin:15px auto;float:none;">
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/g5.jpg" alt="...">
      <div class="caption">
        <h3>���ٲð������зƶԻ��� ���ⳤ������һ���Ӷ�����</h3>
        <p>���ɱ�ý��Update Philippines12��2�ձ����ƣ����ɱ��⽻����������ʾ����������Ϻ��ٲð��þ����й�����˫�߶Ի���</p>
        <p><a href="#" class="btn btn-primary" role="button">����</a> 
           <a href="#" class="btn btn-default" role="button">����</a>
           <a href="#" class="btn btn-default" role="button">������</a></p>
      </div>
    </div>
  	</div>
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/g2.jpg" alt="...">
      <div class="caption">
        <h3>����ָ�ӹ٣�ԭ�����������Ļ�̸ȡ�� ϣ���й���ͣ</h3>
        <p>�山���³�ͻ����������ƽίԱ����ϯ������ԭ�ƻ����ĸ��ط���װ��֯�����̸������̸��������ȷ��ȡ����</p>
        <p><a href="#" class="btn btn-primary" role="button">����</a> 
           <a href="#" class="btn btn-default" role="button">����</a>
           <a href="#" class="btn btn-default" role="button">������</a></p>
      </div>
    </div>
  	</div>
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/g2.jpg" alt="...">
      <div class="caption">
        <h3>������ϵ������Σ���ǰ�������ƣ��������������</h3>
        <p>�����������仯���й�������ʵ�ķ�Ӧ ����й����߷�����ʿ������Ū��������ϵ�Ľ������</p>
        <p><a href="#" class="btn btn-primary" role="button">����</a> 
           <a href="#" class="btn btn-default" role="button">����</a>
           <a href="#" class="btn btn-default" role="button">������</a></p>
      </div>
    </div>
  	</div>
  	<div class="col-lg-3">
    <div class="thumbnail">
      <img src="img/g2.jpg" alt="...">
      <div class="caption">
        <h3>�����ٷ�����Ү�ռ���Ϊ��������</h3>
        <p>11��19�գ��ڲ��������Ʒ����������ڣ��ڲ�����ͳ�ļ�֤�£���������Ү��Ϊ����������</p>
        <p><a href="#" class="btn btn-primary" role="button">����</a> 
           <a href="#" class="btn btn-default" role="button">����</a>
           <a href="#" class="btn btn-default" role="button">������</a></p>
      </div>
    </div>
  	</div>
  	
</div>

</body>
</html>
