$(function(){
    layui.use(['form','jquery','layer'],function () {// 加载form，jquery，layer组件
        var form = layui.form,
            jquery = layui.jquery,
            layer = layui.layer

        form.on('submit(submitBtn)',function (obj) {
            $.ajax({
                url:'/EduPoject/page/back/classes/ClassesAction/insert.html',
                type:'POST',
                data:$('.layui-form').serialize(),
                success:function (data) {
                    if (data == "success"){
                        layer.msg('成功',{time:2000,icon:1,end:function () {
                                window.location.href="/EduPoject/pages/back/classes/classes_insert.jsp"
                            }})
                    }else if (data == "failure"){
                        layer.msg('失败',{time:2000,icon:2})

                    }else if (data == "null-error"){
                        layer.msg('不能为空',{time:2000,icon:2})

                    }
                }
            })
        })
    })
})