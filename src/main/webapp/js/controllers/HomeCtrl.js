albumFotografico.controller('HomeCtrl' , function($scope, dataServices, $location,$sessionStorage) {
    var confermaCreazione = function(data){
        toastr.success("Album creato con successo");
    };
    $scope.creaAlbum= function(album){
        album.utente=$sessionStorage.utente;
        dataServices.creaAlbum(album,confermaCreazione);
    };
   
});

