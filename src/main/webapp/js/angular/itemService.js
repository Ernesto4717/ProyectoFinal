myApp.controller("itemController", function springController($scope, $http,
		$window,$location) {
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
		$http.post("/jpaproject/Item/add", $scope.item).success(
				function(response) {
					alert($scope.item);
					$window.location = "/jpaproject/Item/List";
				});
	};
	$scope.edit = function() {

		$http({
			method : "GET",
			url : "/jpaproject/Item/editData",
			params : {
				"itemId" : $location.search().itemId
			}
		}).then(function success(response) {
			$scope.item = response.data;
		});
	}

});