<div data-ng-controller="springController">

	<ol class="breadcrumb">
		<li><a href="<c:url value="/User/home"/>">Home</a></li>
		<li><a href="<c:url value="/User/List"/>">List</a></li>
		<li class="active">Add Item</li>
	</ol>


	<div class="container-center ">
		<form method="post">

			<div class="form-group">
				<input type="number" placeholder="id" class="form-control"
					data-ng-model="user.username" required />
			</div>

			<div class="form-group">
				<input type="text" placeholder="description" class="form-control"
					data-ng-model="user.password" required />
			</div>

			<div class="form-group">
				<input type="text" placeholder="price" class="form-control"
					data-ng-model="user.name" required />
			</div>

			<div class="form-group">
				<input type="submit" class="btn btn-info" data-ng-click="send()" />
			</div>

		</form>


	</div>


</div>