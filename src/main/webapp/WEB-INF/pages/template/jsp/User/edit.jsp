<span data-ng-bind="$location.search()"></span>
<div data-ng-controller="springController" data-ng-init="edit()">

	<ol class="breadcrumb">
		<li><a href="<c:url value="/User/home"/>">Home</a></li>
		<li><a href="<c:url value="/User/List"/>">List</a></li>
		<li class="active">Bootstrap 3</li>
	</ol>


	<div class="container-center ">
		<form class="form-horizontal">

			<div class="form-group">
				<div class="col-sm-4">
					<label for="Username" class="sr-only">Username</label> <input
						type="text" class="form-control input-group-lg reg_name"
						name="username" value="{{user.username}}" readonly="readonly">
				</div>
				<div class="col-sm-4">
					<label for="password" class="sr-only"></label> <input
						type="password" class="form-control input-group-lg"
						name="password" placeholder="Password:*" value="{{user.password}}">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-8">
					<label for="name" class="sr-only">Name:*</label> <input type="text"
						class="form-control input-group-lg reg_name" name="name"
						value="{{user.name}}">
				</div>
			</div>


			<div class="form-group">
				<div class="col-sm-6 container-button">
					<input type="submit" name="update" value="Update"
						class="btn btn-info">
				</div>

			</div>


		</form>


	</div>
</div>



