var albumFotografico = angular.module('albumFotografico', ['ngRoute']);

albumFotografico.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
                when('/login', {
                    templateUrl: 'partials/login-partial.html',
                    controller: 'LoginCtrl'
                }).
                when('/home', {
                    templateUrl: 'partials/home-partial.html',
                    controller: 'HomeCtrl'
                }).
                otherwise({
                    redirectTo: '/home'
                });
    }]);

