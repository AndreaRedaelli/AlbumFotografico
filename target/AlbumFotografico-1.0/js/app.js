var albumFotografico = angular.module('albumFotografico', ['ngRoute','ngStorage']);
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
                when('/registrazione', {
                    templateUrl: 'partials/registrazione-partial.html',
                    controller: 'RegistrazioneCtrl'
                }).
                when('/uploadFoto/:nomeAlbum', {
                    templateUrl: 'partials/uploadFoto-partial.html',
                    controller: 'uploadFotoCtrl'
                }).
                when('/visualizzaFoto', {
                    templateUrl: 'partials/visualizzaFoto-partial.html',
                    controller: 'visualizzaFotoCtrl'
                }).        
                otherwise({
                    redirectTo: '/login'

                });
    }]);

