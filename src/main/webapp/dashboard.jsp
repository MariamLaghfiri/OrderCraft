<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Client</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" integrity="sha384-dpnbvBUNxgHCYqnsaAe4vSapJAL90ltlr1LQHcYG5e9qex8e6R2bIov4eZtWPTDA" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<style type="text/css">
	.padmarg {
		padding: 10px 5px!important;
		margin-top: 50px!important;
	}
	.pm{
		padding: 10px 5px!important;
	}
	.pad{
		padding: 15px;
	}
	</style>
</head>
<body>
	<%@include file="header.jsp" %>
	<div class="container">
		<div class="row pm">
			<table class="col-sm border border-dark padmarg">
		      	<tr><th colspan="3" class="table-active text-center pad">En Attente</th></tr>
			      <c:forEach var="c" items="${model.commandesEnAttente}">	
			      	<tr>
			      		<td>${ c.referance }</td>
			      		<td><a href="ToEnCours.commande?id=${ c.referance }" class="btn btn-dark">à en cours</a></td>
			      		<td><a href="ToTraite.dcommande?id=${ c.referance }" class="btn btn-dark">à traite</a></td>
			      	</tr>
			     </c:forEach>
		     </table>
		    
		     <table class="col-sm border border-dark padmarg">
		      	<tr><th colspan="3" class="table-active text-center pad">En Cours</th></tr>
				<c:forEach var="c" items="${model.commandesEnCours}">	
			      	<tr>
			      		<td>${ c.referance }</td>
			      		<td><a href="ToEnAttente.commande?id=${ c.referance }" class="btn btn-dark">à en attente</a></td>
			      		<td><a href="ToTraite.dcommande?id=${ c.referance }" class="btn btn-dark">à traite</a></td>
			      	</tr>
			      </c:forEach>		      	
			</table>
			    
		    <table class="col-sm border border-dark padmarg">
		      	<tr><th colspan="3" class="table-active text-center pad">Traite</th></tr>
		      	<c:forEach var="c" items="${model.commandesTraite}">	
			      	<tr>
			      		<td>${ c.referance }</td>
			      		<td><a href="ToEnCours.commande?id=${ c.referance }" class="btn btn-dark">à en cours</a></td>
			      		<td><a href="ToEnAttente.dcommande?id=${ c.referance }" class="btn btn-dark">à en attente</a></td>
			   		</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	<!-- Bootstrap JS and dependencies -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"  crossorigin="anonymous"></script>
</body>
</html>
