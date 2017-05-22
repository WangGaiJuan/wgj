$(document).ready(function(){

	/*显示隐藏层*/
	$('.arrow').click(function(){
		$('.vis').stop().animate({right:'1100px'},800);
		//$('.vis').fadeOut('1060px');
		$('.hid').stop().animate({left:'0px'},800);
		$('.arrow').css('display','none');
		$('.newarrow').css('display','block');
		$('.vis_jump').css('display','none');
		$('.hid_jump').css('display','block');
	});

	$('.newarrow').click(function(){
		$('.vis').stop().animate({right:'0px'},800);
		$('.hid').stop().animate({left:'1100px'},800);
		$('.newarrow').css('display','none');
		$('.arrow').css('display','block');	
		$('.vis_jump').css('display','block');
		$('.hid_jump').css('display','none');
	});

});