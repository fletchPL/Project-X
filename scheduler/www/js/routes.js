angular.module('app.routes', [])

.config(function($stateProvider, $urlRouterProvider) {

  // Ionic uses AngularUI Router which uses the concept of states
  // Learn more here: https://github.com/angular-ui/ui-router
  // Set up the various states which the app can be in.
  // Each state's controller can be found in controllers.js
  $stateProvider
    
  

      .state('tabsController.twojeWizyty', {
    url: '/page2',
    views: {
      'tab1': {
        templateUrl: 'templates/twojeWizyty.html',
        controller: 'twojeWizytyCtrl'
      }
    }
  })

  .state('tabsController.ulubione', {
    url: '/page3',
    views: {
      'tab2': {
        templateUrl: 'templates/ulubione.html',
        controller: 'ulubioneCtrl'
      }
    }
  })

  .state('tabsController.ustawienia', {
    url: '/page4',
    views: {
      'tab3': {
        templateUrl: 'templates/ustawienia.html',
        controller: 'ustawieniaCtrl'
      }
    }
  })

  .state('tabsController', {
    url: '/page1',
    templateUrl: 'templates/tabsController.html',
    abstract:true
  })

  .state('signup', {
    url: '/page5',
    templateUrl: 'templates/signup.html',
    controller: 'signupCtrl'
  })

  .state('login', {
    url: '/page6',
    templateUrl: 'templates/login.html',
    controller: 'loginCtrl'
  })

  .state('dodajUsUg', {
    url: '/page7',
    templateUrl: 'templates/dodajUsUg.html',
    controller: 'dodajUsUgCtrl'
  })

  .state('zarzDzajUsUgami', {
    url: '/page8',
    templateUrl: 'templates/zarzDzajUsUgami.html',
    controller: 'zarzDzajUsUgamiCtrl'
  })

$urlRouterProvider.otherwise('/page1/page2')

  

});