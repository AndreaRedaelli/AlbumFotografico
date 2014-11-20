
package it.cspnet.albumfotografico.servizi;

import it.cspnet.albumfotografico.exception.UtenteGiaPresenteException;
import it.cspnet.albumfotografico.model.Album;
import it.cspnet.albumfotografico.model.Utente;

public interface Servizi {

    public void creaAlbum(Album album);
    public void creaUtente(Utente utente) throws UtenteGiaPresenteException;
   
}
