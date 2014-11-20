package it.cspnet.albumfotografico.web;

import it.cspnet.albumfotografico.model.Album;
import it.cspnet.albumfotografico.model.JsonResult;
import it.cspnet.albumfotografico.servizi.Servizi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AlbumController {
    @Autowired
    private Servizi servizi;

    public void setServizi(Servizi servizi) {
        this.servizi = servizi;
    }
    
    @RequestMapping(name = "/creaAlbum", method = RequestMethod.POST)
    public @ResponseBody
    JsonResult creaAlbum(@RequestBody Album album) {
       
        JsonResult jsonResult = new JsonResult();
        
        //crea la directory dell album 
        //che si troverà nella directory personale dell utente
        servizi.creaAlbum(album);
        
        
        
        
        return jsonResult;
    }
}
