<div data-ng-controller="cartController">
	<ol class="breadcrumb">
		<li><a href="/jpaproject/home">Home</a></li>
		<li><a href="home">Cart</a></li>
		<li class="active">List</li>
	</ol>


	<div class="table-responsive">

		<table class="table">
			<thead class="thead-inverse">
				<tr>
					<th width="5%">Cart Id</th>
					<th width="15%">Amount</th>
					<th width="19%">User</th>
					<th width="20%">Created Date</th>
					<th width="20%">Modified Date</th>
					<th width="11%">Products</th>
				</tr>

			</thead>
			<tbody>

				<tr data-ng-repeat="cart in cartList">
					<td><a data-ng-href="edit?cartId={{cart.id}}">{{cart.id}}</a></td>
					<td data-ng-bind="cart.amount | currency"></td>
					<td data-ng-bind="cart.user.name"></td>
					<td data-ng-bind="cart.audit.createDate  | date:'medium'"></td>
					<td data-ng-bind="cart.audit.updateDate | date:'medium'"></td>
					<td><a data-ng-href="view#?cartId={{cart.id}}">view</a></td>
				</tr>

			</tbody>
		</table>
	</div>
</div>