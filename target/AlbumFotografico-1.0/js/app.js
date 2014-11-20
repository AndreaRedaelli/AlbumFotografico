var albumFotografico = angular.module('albumFotografico', ['ngRoute']);

albumFotografico.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
                when('/login', {
                    templateUrl: 'partials/login-partial.html',
                    controller: 'LoginCtrl'
                }).
                otherwise({
                    redirectTo: '/login'
                });
    }]);

