<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Input prompt</title>
<link rel="stylesheet" type="text/css" href="style/global.css" />
<script type="text/javascript" src="script/jquery-1.8.3.js"></script>
<style type="text/css">
#apple {
	width: 80%;
	margin: 200px auto;
	text-align: left;
}

#keyword {
	width: 393px;
}

#prompt {
	list-style-type: none;
	list-style-position: inside;
	width: 392px;
	border: 1px solid #BEBEBE;
	padding-left: 3px;
	margin-left: 2px;
	margin-top: 0px;
	display: none;
}
</style>

<script type="text/javascript">
$(document).ready(function(){
	$("li").live("mouseover", function(){
		$(this).css("background-color", "#66B3FF");
		$(this).css("cursor", "pointer");
	});
	$("li").live("mouseleave", function(){
		$(this).css("background-color", "");
	});
	
	
	$("#keyword").on("input", function(){
		var val = $(this).val(),
		$prompt = $("#prompt");
		if (val == "") {
			$prompt.hide();
			return false;
		}
		
		$.ajax({
			url: '<%=request.getContextPath()%>' + "/prompt.action",
			data: {
				word: val
			},
			dataType: "json",
			method: "GET",
			success: function(json) {
				$prompt.empty();
				if (json.msg.length == 0) {
					return false;
				}
				var html = "";
				$.each(json.msg, function(i, data){
					html = html + "<li>" + data + "</li>";
				});
				$prompt.append(html);
				$prompt.show();
			},
			error: function(XHR) {
				alert(XHR.responseText);
			}
		});
		
	});
});
</script>
</head>
<body>
	<div id="apple">
		<form action="">
			<input type="text" id="keyword"> 
			<input type="submit" value="Query">
		</form>
		<ul id="prompt"></ul>
	</div>
</body>
</html>