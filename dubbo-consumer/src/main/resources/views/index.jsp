<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>index2</title>
</head>
<script>
	$(document).ready(function() {
		$("#btn1").click(function() {
			$('#test').load('/ajax.txt');
		})
	})
</script>
</head>
<body>
	<h3 id="test">点击按钮，改变这段文本。</h3>
	<button id="btn1" type="button">获得</button>
</body>
</html>