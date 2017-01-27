<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<ol class="breadcrumb">
	<li><a href="<c:url value="/Cart/home"/>">Home</a></li>
	<li><a href="<c:url value="/Cart/List"/>">List</a></li>
	<li class="active">Bootstrap 3</li>
</ol>

<div>
<div class="table-responsive">

		<table class="table">
			<thead class="thead-inverse">
				<tr>
					<th width="25%">CartLine Id</th>
					<th width="25%">Ship To</th>
					<th width="25%">Item Description</th>
					<th width="25%">Quantity</th>
				</tr>

			</thead>
			<tbody>
			<c:forEach var="cartLine" items="${cartLines}">
			${cartLine.item.price }
			<tr>
				<td>${cartLine.id}</td>
				<td>${cartLine.cart.cartDetails.shipTo.Name}</td>
				<td>${cartLine.item.description}</td>
				<td>${cartLine.quantity}</td>
			</tr>
		</c:forEach>
			</tbody>
		</table>
	</div>
</div>
