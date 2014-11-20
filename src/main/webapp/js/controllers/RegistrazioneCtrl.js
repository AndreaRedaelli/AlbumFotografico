albumFotografico.controller('RegistrazioneCtrl' , function($scope, dataServices, $location,$sessionStorage) {
    var confermaCreazione = function(data){
      $location.path('/login');  
    };
    
    $scope.registrati = function(utente){
        dataServices.registrati(utente,confermaCreazione);
    };
});

