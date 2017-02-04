<div data-ng-controller="itemController">
<ol class="breadcrumb">
	<li><a href="/jpaproject/home">Home</a></li>
	<li><a href="/jpaproject/Item/home">Item</a></li>
	<li class="active">List</li>
</ol>
<table class="table">
	<thead class="thead-inverse">
		<tr>
			<th width="5%">Id</th>
			<th width="20%">Description</th>
			<th width="15%">Price</th>
			<th width="10%">Stock</th>
			<th width="15%">Add to cart</th>
		</tr>
	</thead>
	<tbody>
		<tr data-ng-repeat="item in items">
			<td><a data-ng-href="/jpaproject/Item/edit#?itemId={{item.id}}">{{item.id}}</a></td>
			<td data-ng-bind="item.description"></td>
			<td data-ng-bind="item.price | currency"></td>
			<td data-ng-bind="item.stock"></td>
			<td><button type="button" data-ng-click="createCartLine(item.id)" class="btn btn-primary btn-lg btn-block" data-ng-disabled="!cartId">Add</button></td>
		</tr>

	</tbody>
</table>
</div>