<div data-ng-controller="springController">
	<ol class="breadcrumb">
		<li><a href="<c:url value="/User/home"/>">Home</a></li>
		<li class="active">User List</li>
	</ol>
	<div class="form group">
		<input type="search" placeholder="search by name" data-ng-model="name">
		<button type="button" class="btn-sm btn-default" data-ng-click="search()">
			<span class="glyphicon glyphicon-search"></span>
		</button>
	</div>
	<table class="table">
		<thead class="thead-inverse">
			<tr>
				<th width="5%">Username</th>
				<th width="10%">Name</th>
				<th width="10%">Role</th>
				<th width="10%">Active</th>
				<th width="11%">Delete</th>
			</tr>
		</thead>

		<tr data-ng-repeat="user in userList">
			<td><a
				data-ng-href="/User/edit?username={{user.username}}&status=">{{user.username}}</a></td>
			<td data-ng-bind="user.name"></td>
			<td data-ng-bind="user.role.description"></td>
			<td data-ng-bind="user.status"></td>
			<td data-ng-show="user.status=='S'">Delete</td>
		</tr>
		</tbody>
	</table>
</div>
