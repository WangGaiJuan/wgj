$(document).ready(function(){
    function GetJsonData() {
        var json ={
            "userName":$("#userName").val(),
            "password":$("#password").val()
        };
        return json;
    }

    $("#login").click(function() {
        $.ajax({
            type: "POST",
            url: "user/login.do",
            contentType: "application/json; charset=utf-8",
            data:JSON.stringify(GetJsonData()),
            dataType: "json",
            success: function (message) {
                if (message = 0) {
                    alert("ok");
                    self.location='index.html';
                }
            },
            error: function (message) {
                alert("no");
            }
        });
    });

});


