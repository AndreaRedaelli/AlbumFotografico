
package it.cspnet.albumfotografico.servizi;

import it.cspnet.albumfotografico.dao.AlbumDao;
import it.cspnet.albumfotografico.model.Album;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("servizi")
@Transactional
public class ServiziImpl implements Servizi {
    @Autowired
    private AlbumDao albumDao;

    public void setAlbumDao(AlbumDao albumDao) {
        this.albumDao = albumDao;
    }
    
    public void creaAlbum(Album album) {
       this.albumDao.save(album);
    }
    
}
