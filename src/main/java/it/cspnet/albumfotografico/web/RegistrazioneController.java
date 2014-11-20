package it.cspnet.albumfotografico.web;

import it.cspnet.albumfotografico.exception.UtenteGiaPresenteException;
import it.cspnet.albumfotografico.model.JsonResult;
import it.cspnet.albumfotografico.model.Utente;
import it.cspnet.albumfotografico.servizi.Servizi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrazioneController {

    @Autowired
    Servizi servizi;

    @RequestMapping(value = "/registrati", method = RequestMethod.POST)
    public JsonResult registrazioneUtente(@RequestBody Utente utente) {
        JsonResult jsr = new JsonResult();
        try {
            servizi.creaUtente(utente);
            jsr.setMessaggio("ok");
        } catch (UtenteGiaPresenteException ex) {
            jsr.setMessaggio("utente gia' presente");
        } finally {
            return jsr;
        }
    }

}
