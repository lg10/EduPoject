<%--
  Created by IntelliJ IDEA.
  User: zahui
  Date: 2019-11-07
  Time: 下午 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>

<head>
    <title>Title</title>
    <link rel="stylesheet" href="<%=basePath%>layui/css/layui.css">
    <script type="text/javascript" src="<%=basePath%>layui/jquery.js"></script>
    <script type="text/javascript" src="<%=basePath%>layui/layui.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/login.js"></script>
</head>
<body>
<div class="layui-container">
    <div class="layui-row">
        <div class="layui-col-md12">&nbsp;</div>
        <div class="layui-col-md5"><img src="<%=basePath%>img/LoginBg.png"></div>
        <div class="layui-col-md5 layui-col-md-offset2" >
            <h2 class="layui-col-md-offset2">SSM教务管理系统</h2>
            <form class="layui-form">
                <div class="layui-form-item">
                    <label class="layui-form-label">用户&nbsp;&nbsp;I&nbsp;&nbsp;D</label>
                    <div class="layui-input-block">
                        <input type="text" id="tid" name="tid" required  lay-verify="required" placeholder="请输入工号" autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label">登录密码</label>
                    <div class="layui-input-block">
                        <input type="password" id="password" name="password" required  lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <input type="button" class="layui-btn layui-col-md-offset5" lay-submit lay-filter="submitBtn" value="登录">
                        <button type="reset" class="layui-btn layui-btn-danger">重置</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<style type="text/css">
    body{background-image: url("<%=basePath%>img/bg.jpg");background-repeat: no-repeat;background-size: 100%;}
    .layui-col-md5{padding-top: 268px;}
    h2{text-align: center;padding-bottom: 50px;padding-top: 55px;font-size: 35px;font-family: '微软雅黑'}
</style>
</body>
</html>
