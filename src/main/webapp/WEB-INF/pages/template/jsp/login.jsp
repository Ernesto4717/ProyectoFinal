
<div data-ng-controller="loginController">

	<ol class="breadcrumb">
		<li><a href="<c:url value="/home"/>">Home</a></li>
		<li class="active">Login</li>
	</ol>


	<div class="container-center ">
		<form method="post">

			<div class="form-group">
				<input type="number" placeholder="id" class="form-control"
					data-ng-model="item.id" required />
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

