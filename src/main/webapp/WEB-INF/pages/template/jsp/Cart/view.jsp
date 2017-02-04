<div data-ng-controller="cartController" data-ng-init="viewCartLines()">
<ol class="breadcrumb">
	<li><a href="/jpaproject/home">Home</a></li>
	<li><a href="List">List</a></li>
	<li class="active">Cart # {{cartId}}</li>
</ol>

<div>
<a data-ng-href="/jpaproject/Item/List#?cartId={{cartId}}">
<button class="btn btn-primary">Add Product</button>
</a>
<div class="table-responsive">
		<table class="table">
			<thead class="thead-inverse">
				<tr>
					<th width="10%">Id</th>
					<th width="25%">Description</th>
					<th width="25%">Unit Price</th>
					<th width="10%">Quantity</th>
				</tr>

			</thead>
			<tbody>
			<tr data-ng-repeat="cartLine in cartLines">
				<td data-ng-bind="cartLine.id"></td>
				<td data-ng-bind="cartLine.item.description"></td>
				<td data-ng-bind="cartLine.item.price | currency"></td>
				<td data-ng-bind="cartLine.quantity"></td>
			</tr>
			</tbody>
		</table>
	</div>
</div>
</div>
