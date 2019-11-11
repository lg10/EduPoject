$(function(){
    layui.use(['form','jquery','layer'],function () {// 加载form，jquery，layer组件
        var form = layui.form,
            jquery = layui.jquery,
            layer = layui.layer

        form.on('submit(submitBtn)',function (obj) {
            $.ajax({
                url:'/EduPoject/TeacherLoginAction/login.html',
                type:'POST',
                data:$('.layui-form').serialize(),
                success:function (data) {
                    if (data == "success"){
                        layer.msg('登录成功',{time:2000,icon:1,end:function () {
                                window.location.href="/EduPoject/pages/back/index.jsp"
                            }})
                    }else if (data == "failure"){
                        layer.msg('用户名或密码错误',{time:2000,icon:2})

                    }else if (data == "null-error"){
                        layer.msg('用户名或密码不能为空',{time:2000,icon:2})

                    }
                }
            })
        })
    })
})