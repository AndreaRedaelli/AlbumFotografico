gestioneProdotti.factory('dataServices', function($http) {
    var creaAlbum = function(album, confermaCreazione) {

        $http.post('creaAlbum.do', album).
                success(function(data, status, headers, config) {
                    confermaCreazione(data);
                })
    }, 
    registrati = function(utente, confermaRegistrazione) {
        $http.post('registrati.do', utente).
                success(function(data, status, headers, config) {
                    confermaRegistrazione(data);
                });
    },
    login = function(utente,asyncCallbackLogin) {
        $http.post('login.do', utente).
                success(function(data, status, headers, config) {
                    asyncCallbackLogin(data);
        });
    };
    return {
        creaAlbum: creaAlbum,
        registrati: registrati,
        login : login
    };








});

