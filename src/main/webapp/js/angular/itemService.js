myApp.controller("itemController", function springController($scope, $http,$window) {
	$scope.item;

	$scope.send = function() {
		console.log($scope.item);
		$http.post("/jpaproject/item/add", $scope.item).success(function(response) {
					alert($scope.item);
					$window.location="/jpaproject/item/list";
				});
	};
})