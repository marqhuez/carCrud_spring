<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<div class="row">
	<div class="col-sm-12">
	
		<h1 class="text-center my-3">Autók listája</h1>
		
		<a class="float-right btn btn-success my-3" href="new">Új autó felvitele</a>
		<a class="float-right btn btn-info my-3" href="veteranlist">Veterán autók listázása</a>
		
		<table class="table table-hover mb-5">
			<thead>
				<tr>
					<th>Id</th>
					<th>Rendszám</th>
					<th>Márka</th>
					<th>Típus</th>
					<th>Motor térfogata</th>
					<th>Gyártási év</th>
					<th>Műveletek</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="car" items="${cars}">
				<tr>
					<td>${car.id}</td>
					<td>${car.rendszam}</td>
					<td>${car.marka}</td>
					<td>${car.tipus}</td>
					<td>${car.motorTerfogat}</td>
					<td>${car.gyartasiEv}</td>
					<td>
						<a class="btn btn-sm btn-warning" href="edit/${car.id}">Módosítás</a>
						<a class="btn btn-sm btn-danger" href="delete/${car.id}">Törlés</a>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		
		<a class="btn btn-warning" href="javascript:history.go(-1)">Vissza</a>
		
	</div>
</div>

<%@ include file="footer.jsp" %>