$(document).ready(function(){
	//search 部分
	$(".sub").click(function(){
		/*$(".sub").stopPropagation();*/

		if(parseInt($(".tex").css("right"))==0)
		{
			if($(".tex").val()!="")
			{
				window.location.href="index.html";
			}
			else{
				alert("请输入关键词");
			}
		}
		else{
			$(".sear .col-md-6 img").animate({right:'0px'});
			$(".tex").animate({right:'0px'});
		}

		return false;
		
	});

	$(".tex").click(function(){
		return false;
	});

	$("body").click(function(){
		$(".sear .col-md-6 img").animate({right:'-150px'});
		$(".tex").animate({right:'-150px'});

	});

	/*菜单浮现*/
	$(window).on('scroll', function () {
    	var len=$(this).scrollTop();
        if (len >= 141) {
            $(".jump").css('position', 'fixed');
        } 
        else {
            $(".jump").css('position', 'relative');
        }
    });

	/*返回顶部*/
    $(document).bind('scroll',function(){
	    var len=$(this).scrollTop()
	    if(len>=300){
	        $("#backTop").css("display",'block');
	        //$(".menu").css("display",'block');
	    }else{
	    	$("#backTop").css("display",'none');
	    }

	})


});