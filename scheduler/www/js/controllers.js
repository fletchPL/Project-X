angular.module('app.controllers', [])
  
.controller('menuCtrl', function ($scope, $stateParams, $rootScope) {


})
   
.controller('twojeWizytyCtrl', function ($scope, $stateParams, $rootScope,$ionicPopup) {
	
	if($rootScope.loginD.login != "user"){
	$ionicPopup.alert({
                    template: "Nie ma takiego użytkownika",	
				    buttons: [
							{ text: '<b>Rozumiem<b>', 
								type: 'button-assertive',
								
								}
							
						 ]
                });
	}		

})
   
.controller('ulubioneCtrl', function ($scope, $stateParams, $rootScope, DbConnection) {
		
	DbConnection.call
})
  // laczenie z baza  
.controller('rejestracjaCtrl', function($scope, $http) {
    $scope.signup = function () {
    var request = $http({
        method: "post",
        url: "http://localhost/signup.php",
        crossDomain : true,
        headers: {'Content-Type': 'application/x-www-form-urlencoded'},
        data: {
            username: $rootScope.userdata.username,
            email: $rootScope.userdata.email,
            password: $rootScope.userdata.password
        },
    });
        request.success(function(data) {
        if(data == "1"){
         $rootScope.responseMessage = "Account Created Successfully!";
        }
        if(data == "2"){
         $rootScope.responseMessage = "Can not Create Account";
        }
        else if(data == "0") {
         $rootScope.responseMessage = "Email Already Exists"
        }  
    });
}
});
   
   
.controller('ustawieniaCtrl', function ($scope, $stateParams, $rootScope) {


	

})
      
.controller('signupCtrl', function ($scope, $stateParams, $rootScope) {

})
   
.controller('loginCtrl', function ($scope, $stateParams, $rootScope, $ionicPopup) {
$rootScope.loginD ={};
$rootScope.loginD.login = "";
$rootScope.loginD.password = "";
$scope.wrongLoginPassword = "zle haslo";

})

.controller('dodajUsUgCtrl', function ($scope, $stateParams, $rootScope) {

})
   
.controller('zarzDzajUsUgamiCtrl', function ($scope, $stateParams, $rootScope) {

})
 