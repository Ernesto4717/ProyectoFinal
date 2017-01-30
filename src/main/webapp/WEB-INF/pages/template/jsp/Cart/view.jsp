
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<ol class="breadcrumb">
	<li><a href="<c:url value="/Cart/home"/>">Home</a></li>
	<li><a href="<c:url value="/Cart/List"/>">List</a></li>
	<li class="active">Cart lines</li>
</ol>

<div>
<div class="table-responsive">

		<table class="table">
			<thead class="thead-inverse">
				<tr>
					<th width="10%">Id</th>
					<th width="25%">Description</th>
					<th width="25%">Unit Price</th>
					<th width="10%">Quantity</th>
					<th width="15%">Create date</th>
					<th width="15%">Update date</th>
				</tr>

			</thead>
			<tbody>
			<c:forEach var="cartLine" items="${cartLines}">
			<tr>
				<td>${cartLine.id}</td>
				<td>${cartLine.item.description}</td>
				<td>${cartLine.item.price}</td>
				<td>${cartLine.quantity}</td>
				<td>${cartLine.cart.audit.createDate}</td>
				<td>${cartLine.cart.audit.updateDate}</td>
			</tr>
		</c:forEach>
			</tbody>
		</table>
	</div>
</div>
