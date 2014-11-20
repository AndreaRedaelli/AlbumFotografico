gestioneProdotti.factory('dataServices', function($http) {
    var creaAlbum = function(album, confermaCreazione) {

        $http.post('creaAlbum.do', album).
                success(function(data, status, headers, config) {
                    confermaCreazione(data);
                })
    };
    return {
        creaAlbum: creaAlbum
    };








});

