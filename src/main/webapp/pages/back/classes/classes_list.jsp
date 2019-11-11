<%--
  Created by IntelliJ IDEA.
  User: zahui
  Date: 2019-11-09
  Time: 下午 3:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>后台</title>
    <link rel="stylesheet" href="<%=basePath%>layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <!--头部导航-->
    <jsp:include page="../plugins/top.jsp"/>

    <!--菜单导航-->
   <jsp:include page="../plugins/left.jsp"/>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <div class="layui-col-md2">&nbsp;</div>
            <div class="layui-col-md5">
                <table class="layui-table" id="list" lay-filter="test"></table>
            </div>
        </div>
    </div>



    <!--底部导航-->
    <jsp:include page="../plugins/footer.jsp"/>
</div>
<script type="text/javascript" src="<%=basePath%>layui/jquery.js"></script>
<script type="text/javascript" src="<%=basePath%>layui/layui.js"></script>
<script type="text/javascript" src="<%=basePath%>js/classes_list.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
</script>
</body>

</html>
