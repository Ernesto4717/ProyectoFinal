myApp.controller("itemController", function springController($scope, $http) {
	$scope.item;

	$scope.send = function() {
		console.log($scope.item);
		$http.post("/jpaproject/item/add", $scope.item).then(
				function success(response) {
					console.log(response.data);
					alert($scope.item);
				});
	};
})