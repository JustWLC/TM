<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="js/jquery/2.0.0/jquery.min.js"></script>
<link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
<script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
<link href="css/back/style.css" rel="stylesheet">
    
    <script type="text/javascript">
    
    	function checkEmpty(id,name) {
			var value=$("#"+id).val();
			if (value.length==0) {
				alert(name+"不能为空");
				$("#"+id)[0].focus();
				return false;
			}
			return true;
		}	
    
    	function checkNumber(id,name) {
    		
			var value=$("#"+id).val();
			if (value.length==0) {
				alert(name+"不能为空");
				$("#"+id)[0].focus();
				return false;
			}
			if(isNaN(value)){
				alert(name+"必须是数字");
				$("#"+id)[0].focus();
				return false;
			}
			return true;
		}
    	
    	function checkInt(id,name) {
			var value=$("#"+id).val();
			if (value.length==0) {
				alert(name+"不能为空");
				$("#"+id)[0].focus();
				return false;
			}
			
			if (parseInt(value)!=value) {
				alert(name+"必须是整数");
				$("#"+id)[0].focus();
				return false;
			}
			return true;
		}
    	
    	$(function () {
			$("a").click(function() {
				var deleteLink=$(this).attr("deleteLink");
				console.log(deleteLink);
				if ("true"==deleteLink) {
					var confirmDelete=confirm("确认删除？");
					if (confirmDelete) {
						return true
					}
					return false;
				}
			});
		})
    </script>
</head>
<body>

