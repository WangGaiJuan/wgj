$(document).ready(function(){
	$("#save").on("click", function () {  
                var params = $("#ff").serializeArray();  
                var j = {};  
                for (var item in params) {  
                    j[params[item].name] = params[item].value;  
                }  
  
                $.ajax({  
                    url:'index.html',  
                    data:JSON.stringify(j),  
                    type:'post',  
                    dataType:'json',  
                    headers:{  
                        Accept:"application/json",  
                        "Content-Type":"application/json"  
                    },  
                    processData:false,  
                    cache:false  
                }).done(function (data) {  
                        });  
  
            }); 
});