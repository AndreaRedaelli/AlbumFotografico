
package it.cspnet.albumfotografico.model;

import java.io.File;

public class FileJson {
    
    private File file;
    private String nomeAlbum;

    public FileJson() {
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }
    
}

