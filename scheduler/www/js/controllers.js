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
   
.controller('ulubioneCtrl', function ($scope, $stateParams, $rootScope) {
		

})
   
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
 