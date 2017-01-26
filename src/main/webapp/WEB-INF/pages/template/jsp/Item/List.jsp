
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div data-ng-controller="springController">
	<ol class="breadcrumb">
		<li><a href="<c:url value="/User/home"/>">Home</a></li>
		<li class="active">User List</li>
	</ol>
	<table class="table">
		<thead class="thead-inverse">
			<tr>
				<th width="5%">Id</th>
				<th width="21%">Description</th>
				<th width="10%">Price</th>
				<th width="10%">Stock</th>
			</tr>
		</thead>

		<c:forEach var="item" items="${items}">
			<tr>
				<td><a href="<c:url value="/user/edit?userName=${item.id}"/>">${item.id}</a></td>
				<td>${item.description}</td>
				<td>${item.price}</td>
				<td>${item.stock}</td>
			</tr>
		</c:forEach>
		
		</tbody>
	</table>
</div>
