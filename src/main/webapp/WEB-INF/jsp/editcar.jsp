<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<div class="row">
	<div class="col-sm-12">
	
		<h1 class="text-center my-3">Autóadatok módosítása</h1>
		
		<form class="form-group" action="" method="post">
		
			<label>Rendszám</label>
			<input class="form-control my-2" type="text" name="rendszam" value="${car.rendszam}" required>
			
			<label>Márka</label>
			<input class="form-control my-2 mb-4" type="text" value="${car.marka}" name="marka">
			
			<label>Típus</label>
			<input class="form-control my-2 mb-4" type="text" value="${car.tipus}" name="tipus">
			
			<label>Motor térfogat</label>
			<input class="form-control my-2 mb-4" type="number" value="${car.motorTerfogat}" name="motorTerfogat">
			
			<label>Gyártási év</label>
			<input class="form-control my-2 mb-4" type="number" name="gyartasiEv" value="${car.gyartasiEv}" required>
			
			<a class="btn btn-warning" href="javascript:history.go(-1)">Vissza</a>
			
			<button class="btn btn-success" type="submit">Mentés</button>
			
		</form>
	</div>
</div>
	
<%@ include file="footer.jsp" %>