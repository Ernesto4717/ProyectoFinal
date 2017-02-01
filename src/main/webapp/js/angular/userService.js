myApp.controller("springController", function springController($scope,$http,
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
	}
}).factory("userService", function() {
	console.log("userService")

	return function() {

	};
});