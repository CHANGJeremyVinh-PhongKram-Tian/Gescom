package metier;

import java.util.*;

public class Categorie {
    public int idCategorie;
    public String libCategorie;
    /* propriétés privées */

    /* getters et setters */

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setLibCategorie(String libCategorie) {
        this.libCategorie = libCategorie;
    }

    public String getLibCategorie() {
        return libCategorie;
    }

    public Categorie(int idCategorie, String libCategorie) {
        setIdCategorie(idCategorie);
        setLibCategorie(libCategorie);
    }


}
