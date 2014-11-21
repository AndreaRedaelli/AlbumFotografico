albumFotografico.controller('uploadFotoCtrl', function ($scope, $routeParams, dataServices, $location, $sessionStorage) {
    var confermaUpload = function (data) {
        if (data.messaggio === "ok") {
            toastr.success("immagine aggiunta con successo");
        }
        else{
            toastr.error("immagine non aggiunta");
        }

    };
    $scope.uploadFile = function(file) {
        dataServices.aggiungiFoto($routeParams.nomeAlbum,file, confermaUpload);
    };
    
});


