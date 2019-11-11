$(function(){
    layui.use(['table'],function () {// 加载table组件
        var table = layui.table;
        table.render({
            elem:'#list',
            url:'/EduPoject/page/back/classes/ClassesAction/list.html',
            cols:[[
                {field: 'cid', title: 'ID', width:'15%', sort: true},
                {field: 'title', title: '班级名', width:'20%'},
                {field: 'note', title: '班级描述'}
            ]]
        })
    })
})