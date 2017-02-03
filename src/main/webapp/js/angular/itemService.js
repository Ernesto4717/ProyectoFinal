myApp.controller("itemController", function springController($scope, $http,$window) {
	$scope.item;
	
	$scope.items = [];
	$http({
		method : "GET",
		url : "/jpaproject/Item/ListData"
	}).then(function success(response) {
		$scope.items = response.data;
	});

	$scope.send = function() {
		console.log($scope.item);
		$http.post("/jpaproject/item/add", $scope.item).success(function(response) {
					alert($scope.item);
					$window.location="/jpaproject/item/list";
				});
	};
})