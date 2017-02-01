
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div data-ng-controller="itemController">

<ol class="breadcrumb">
	<li><a href="<c:url value="/User/home"/>">Home</a></li>
	<li><a href="<c:url value="/User/List"/>">List</a></li>
	<li class="active">Add Item</li>
</ol>


<div class="container-center ">
<form method="post">
	
	<div class="form-group">
		<input type="number" placeholder="id" class="form-control" data-ng-model="item.id" required/>
	</div>
	
	<div class="form-group">
		<input type="text" placeholder="description" class="form-control" data-ng-model="item.description" required/>
	</div>
	
	<div class="form-group">
		<input type="text" placeholder="price" class="form-control" data-ng-model="item.price" required/>
	</div>
	
	<div class="form-group">
		<input type="text" placeholder="stock" class="form-control" data-ng-model="item.stock" required/>
	</div>
	
	<div class="form-group">
		<input type="submit" class="btn btn-info" name="update" value="update"/>
	</div>
	
</form>
	

</div>


</div>

