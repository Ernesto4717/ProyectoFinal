myApp.controller("springController", function springController($scope,$http) {
	$scope.item;
	$scope.item.id;
	$scope.item.price;
	$scope.item.stock;
	$scope.item.description;
	
	$scope.send(function(){
		console.log($scope.item);
		http.post("/jpaproject/Item/add/" , {params: {item: $scope.item}})
	});
	
})