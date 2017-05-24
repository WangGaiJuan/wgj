$(document).ready(function(){
    function GetJsonData() {
        var json ={
            "userName":$("#userName").val(),
            "password":$("#password").val(),
            "age":$("#age").val(),
            "cellphone":$("#cellphone").val()
        };
        return json;
    }

    $("#regist").click(function() {
        $.ajax({
            type: "POST",
            url: "/user/register.do",
            //contentType: "application/json; charset=utf-8",
            data:JSON.stringify(GetJsonData()),
            //dataType: "json",
            success: function (date,message,x) {
                if (message = 0) {
                    alert("ok");
                    self.location='login.html';
                }
            },
            error: function (message) {
                alert("no");
            }
        });
    });

});


