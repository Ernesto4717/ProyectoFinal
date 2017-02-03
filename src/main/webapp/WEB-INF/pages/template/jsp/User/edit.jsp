<div data-ng-controller="springController" data-ng-init="edit()">

	<ol class="breadcrumb">
		<li><a href="/jpaproject/home">Home</a></li>
		<li><a href="home">User</a></li>
		<li><a href="List">List</a></li>
		<li class="active">Edit</li>
	</ol>


	<div class="container-center ">
		<form class="form-horizontal">

			<div class="form-group">
				<div class="col-sm-4">
					<label for="Username" class="sr-only">Username</label> <input
						type="text" class="form-control input-group-lg reg_name"
						name="username" data-ng-model="user.username" readonly="readonly">
				</div>
				<div class="col-sm-4">
					<label for="password" class="sr-only"></label> <input
						type="password" class="form-control input-group-lg"
						name="password" placeholder="Password:*" data-ng-model="user.password">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-8">
					<label for="name" class="sr-only">Name:*</label> <input type="text"
						class="form-control input-group-lg reg_name" name="name"
						data-ng-model="user.name">
				</div>
			</div>


			<div class="form-group">
				<div class="col-sm-6 container-button">
					<input type="submit" name="update" value="Update" data-ng-click="send()"
						class="btn btn-info">
				</div>

			</div>


		</form>


	</div>
</div>



