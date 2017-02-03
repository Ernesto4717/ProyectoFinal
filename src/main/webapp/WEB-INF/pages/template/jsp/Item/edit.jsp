<div data-ng-controller="itemController" data-ng-init="edit()">

	<ol class="breadcrumb">
		<li><a href="/jpaproject/home">Home</a></li>
		<li><a href="home">Item</a></li>
		<li><a href="List">List</a></li>
		<li class="active">Edit</li>
	</ol>


	<div class="container-center ">
		<form method="post">

			<div class="form-group">
				<input type="number" placeholder="id" class="form-control"
					data-ng-model="item.id" readonly />
			</div>

			<div class="form-group">
				<input type="text" placeholder="description" class="form-control"
					data-ng-model="item.description" required />
			</div>

			<div class="form-group">
				<input type="text" placeholder="price" class="form-control"
					data-ng-model="item.price" required />
			</div>

			<div class="form-group">
				<input type="text" placeholder="stock" class="form-control"
					data-ng-model="item.stock" required />
			</div>

			<div class="form-group">
				<input type="submit" class="btn btn-info" data-ng-click="send()" />
			</div>

		</form>


	</div>


</div>