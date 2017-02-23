function hqWXQM(shareImg,fContent,shareTitle,urlStr){
	var urlfix=location.href.split('?')[0];
	var urlend=location.href.split('?')[1];
	var urltemp='';
	var ftype='';
	//http://m.fangxinbao.com/wx/zxxq-184356725-100029.html
	if(urlStr.indexOf('-')!=-1){
		var str=urlStr.split("-");//str[0] =http://m.fangxinbao.com/wx/zxxq 
		var strr=str[0];
		strr=strr.substring(strr.lastIndexOf("/")+1,strr.length);//zxxq 
		if(strr=='zxxq'){//热门资讯
			ftype=1;
		}else if(strr=='artixq'){//心情笔记
			ftype=2;
		}else if(strr=='khhdxq'){//活动召集
			ftype=5;
		}else if(strr=='zpxq'){//诚聘英才
			ftype=3;
		}
		if(ftype!=''){
			var hh=str[2].split(".");// str[2]=100029.html
			var entityId=str[1];//184356725
			var salesmanId=hh[0];//100029
		}
	}
	if(urlend){
		var temp=urlend.replace(/[&]+/g,'@');
		//alert(urlfix+"====="+urlend+"======"+temp);
		urltemp="http://m.fangxinbao.com/customShare.action?homeUrl="+urlfix+"&urlend="+temp;
	}else{
		urltemp="http://m.fangxinbao.com/customShare.action?homeUrl="+urlfix;
	}
	 		$.ajax({      
					type: "POST",     
					url: urltemp,      
					data: {}, 
					async:false,      
					success: function (data) {
						var dataObj=eval("("+data+")");
						var status=dataObj.status;
						if(status=='1'){
							var appid=dataObj.appID;
							var timestamp=dataObj.timestamp;
							var nonceStr=dataObj.nonceStr;
							var signature=dataObj.signature;
							//alert(appid+"========="+timestamp+"========="+nonceStr+"========="+signature);
							wx.config({
						        debug: false, //
						        appId: appid, // 必填，公众号的唯一标识
						        timestamp: timestamp, // 必填，生成签名的时间戳
						        nonceStr: nonceStr, // 必填，生成签名的随机串
						        signature:signature,// 必填，签名，见附录1
						        jsApiList: [
						        	'showOptionMenu',
						            'onMenuShareTimeline',
						            'onMenuShareAppMessage',
						            'onMenuShareQQ'
						        ] // 必填，需要使用的JS接口列表，所有JS接口列表见附录2
						    });
							wx.ready(function () {    
			       				wx.showOptionMenu();
						        wx.onMenuShareTimeline({
						            title: shareTitle, // 分享标题
						            link: urlStr, // 分享链接
						            imgUrl:shareImg,
						            success: function () {
							        	if(ftype==1 || ftype==2|| ftype==3|| ftype==5){
							        		$.ajax({
							        			url: "http://m.fangxinbao.com/webShareLog.action?entityId="+entityId+"&salesmanId="+salesmanId+"&ftype="+ftype,
							        			type:'post',  
							        			dataType:'json',
							        			cache: false,
							        			async:false,
							        			success: function(){
							        			//alert("分享成功！");
							        		}
							        		});
							        	}
							        	
						            },
						            cancel: function (res) {
						               // alert('已取消');
						            },
						            fail: function (res) {
						                //alert('wx.onMenuShareTimeline:fail: '+JSON.stringify(res));
						            }
						        });
						        wx.onMenuShareAppMessage({
						            title: shareTitle, // 分享标题
						            link: urlStr, // 分享链接
						            imgUrl:shareImg,
						            desc: fContent, // 分享描述
						            success: function () {
						               if(ftype==1 || ftype==2|| ftype==3|| ftype==5){
							        		$.ajax({
							        			url: "http://m.fangxinbao.com/webShareLog.action?entityId="+entityId+"&salesmanId="+salesmanId+"&ftype="+ftype,
							        			type:'post',  
							        			dataType:'json',
							        			cache: false,
							        			async:false,
							        			success: function(){
							        			//alert("分享成功！");
							        		}
							        		});
							        	}
						            },
						            cancel: function (res) {
						               // alert('已取消');
						            },
						            fail: function (res) {
						                //alert('wx.onMenuShareTimeline:fail: '+JSON.stringify(res));
						            }
						        });
						        wx.onMenuShareQQ({
								    title: shareTitle, // 分享标题
								    desc: fContent, // 分享描述
								    link: urlStr, // 分享链接
								    imgUrl: shareImg, // 分享图标
								    success: function () { 
								       // 用户确认分享后执行的回调函数
						        		if(ftype==1 || ftype==2|| ftype==3|| ftype==5){
							        		$.ajax({
							        			url: "http://m.fangxinbao.com/webShareLog.action?entityId="+entityId+"&salesmanId="+salesmanId+"&ftype="+ftype,
							        			type:'post',  
							        			dataType:'json',
							        			cache: false,
							        			async:false,
							        			success: function(){
							        		//	alert("分享成功！");
							        		}
							        		});
							        	}
								    },
								    cancel: function () { 
								       // 用户取消分享后执行的回调函数
								    }
								});
					     	});
						     wx.error(function (res) {
						        //alert('wx.error: '+JSON.stringify(res));
						    });
						}
					}
			}); 
	 	}