// JavaScript Document
//运动框架
function sportFrame(obj,json,fun){
	
	clearInterval(obj.timer);
	
	obj.timer=setInterval(function(){
		
		var Stop=true;
		
		for ( var name in json)
		{
			var val=0;
			
			//判断是不是透明度
			if(name=='opacity')
			{
				val=Math.round(parseFloat(cssStyle(obj,name))*100);
			}
			else
			{
				val=parseInt(cssStyle(obj,name));
			}
			
			//缓冲的速度
			var speed=(json[name]-val)/10;
			speed=speed>0?Math.ceil(speed):Math.floor(speed);
			if(val!=json[name])
			{
				Stop=false;		
				if(name=='opacity')
				{
					obj.style.filter='alpha(opacity:'+val+')';  //IE
					obj.style.opacity=(val+speed)/100;     
				}
				else
				{
					cssStyle(obj,name,val+speed+'px');
				}
			}
		}
		//判断是否到达目的点
		if(Stop)
		{
			clearInterval(obj.timer);
			if(fun)
			{fun();}		
		}			
		},30);
}

//样式设置和获取
function cssStyle(obj,prop,value)
{
	if(arguments.length==2)
	{
			if(obj.currentStyle)
			{
				return obj.currentStyle[prop];	
			}
			else
			{
				return getComputedStyle(obj,false)[prop];	
			}	
	}
	else
	{
			if(arguments.length==3)
			{
				obj.style[prop]=value;	
			}	
	}
	
}
