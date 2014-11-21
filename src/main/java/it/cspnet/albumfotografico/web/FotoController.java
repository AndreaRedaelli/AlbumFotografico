package it.cspnet.albumfotografico.web;

import it.cspnet.albumfotografico.model.FileJson;
import it.cspnet.albumfotografico.model.JsonResult;
import it.cspnet.albumfotografico.servizi.Servizi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FotoController {

    @Autowired
    private Servizi servizi;

    public void setServizi(Servizi servizi) {
        this.servizi = servizi;
    }

    @RequestMapping(value = "/salvafoto", method = RequestMethod.POST)
    public @ResponseBody
    JsonResult salvaFoto(@RequestBody FileJson fileJs) {
       
        JsonResult jsr = new JsonResult();

        return jsr;
    }
}
