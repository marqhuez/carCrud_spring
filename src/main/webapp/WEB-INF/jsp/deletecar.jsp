<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<div class="row">
	<div class="col-sm-12">
		<form class="text-center" action="" method="post">
		
			<h1 class="text-center my-3">Biztosan törli az autót?</h1>
			<h3 class="text-center my-3">Azonosító: ${car.id}</h3>
			
			<a class="btn btn-warning" href="javascript:history.go(-1)">Vissza</a>
			<button class="btn btn-danger" type="submit">Töröl</button>
		
		</form>
	</div>
</div>

<%@ include file="footer.jsp" %>