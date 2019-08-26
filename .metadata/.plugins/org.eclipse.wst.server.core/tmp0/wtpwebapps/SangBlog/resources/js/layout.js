/**
 * header.jsp / navigator.jsp / (content.jsp - 각 영역에서 사용)
 */

Layout = {
	
	menuOneClick : function(menuCode) {
		location.href = "/manager/" + menuCode + "/"; 
		
		/*$.ajax({
			type: 'post',
			url: '/manager/menu/menu-two-list',
			data: {
				'id' : id
			},
			success: function(response) {
				alert("성공");
			},
			error: function(request, status, error) {
				alert("code: " + request.status + "\n"
					+ "message: " + request.responseText + "\n" +
					+ "error: " + error);
			}
		});*/
	},
		
	menuTwoClick : function(that) {
		// event.preventDefault();
		var index = that.index();
		
		alert("index: " + index);
		
		// start 코드가 깨끗하지 않다. 메뉴 클릭 시 클래스 on을 추가하는데, 활용할 수 있는 방안 찾아보기....
		$('.menu_1').removeClass('on');
		that.addClass('on');
		
		$('.menu_1 > ul').css("display", "none");
		$('.menu_1 > ul')[index].style.display = "block";
		
		$('.menu_1 > .menu_1_title').css("color", "black");
		$('.menu_1 > .menu_1_title').css("background", "white");
		
		$('.menu_1 > .menu_1_title')[index].style.color = "white";
		$('.menu_1 > .menu_1_title')[index].style.background = "#79AAFF";
		// end 코드가 깨끗하지 않다. 메뉴 클릭 시 클래스 on을 추가하는데, 활용할 수 있 는 방안 찾아보기....
	}
	
		
};