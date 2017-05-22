$(document).ready(function(){
	$.ajax({
        type: "post",//数据发送的方式（post 或者 get）
        url: "/user/register.do",//要发送的后台地址
        data: {"username":'s',"password":'s',"age":'12',"cellphone":'123'},//要发送的数据（参数）格式为{'val1':"1","val2":"2"}
        dataType: "json",//后台处理后返回的数据格式
        success: function (data) {//ajax请求成功后触发的方法
            alert('请求成功');
        },
        error: function (msg) {//ajax请求失败后触发的方法
            alert(msg);//弹出错误信息
        }
    });
});


