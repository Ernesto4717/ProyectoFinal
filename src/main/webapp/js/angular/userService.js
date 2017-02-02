myApp.controller("springController", function springController($scope,$http,$window,
		userService) {
	$scope.userList = [];
	$http({
		method : "GET",
		url : "/jpaproject/User/ListData"
	}).then(function success(response) {
		$scope.userList = response.data;
	});
	
	$scope.search=function(){
		console.log($scope.name);
		$http.get("/jpaproject/User/Lists/" , {params: {name: $scope.name}})
		.then(function success(response) {
			console.log(response.data);
			$scope.userList = response.data;
		});
	};
	
	$scope.user;

	$scope.send = function() {
		console.log($scope.user);
		$http.post("/jpaproject/User/add", $scope.user).success(function(response) {
					alert("El usuario a sido creado");
					$window.location="/jpaproject/User/List";
				});
	};
	
}).factory("userService", function() {
	console.log("userService")

	return function() {

	};
});