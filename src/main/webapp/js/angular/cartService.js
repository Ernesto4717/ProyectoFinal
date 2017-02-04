myApp.controller("cartController", function cartController($scope, $http,
		$location) {

	$scope.cartList = [];
	$scope.cartLines = [];

	$http({
		method : "GET",
		url : "/jpaproject/Cart/ListData"
	}).then(function success(response) {
		$scope.cartList = response.data;
	});

	$scope.cartId = $location.search().cartId;

	$scope.viewCartLines = function() {
		$http({
			method : "GET",
			url : "/jpaproject/Cart/viewData",
			params : {
				"cartId" : $scope.cartId
			}
		}).then(function success(response) {
			$scope.cartLines = response.data;
		});
	}

});