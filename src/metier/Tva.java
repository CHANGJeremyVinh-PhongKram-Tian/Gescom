package metier;

import java.util.*;

public class Tva {
    private int idTva;
    private double tauxTva;
    /* propriétés privées */

    public Tva(int idTva, double tauxTva) {
        /* Affectations */
        setIdTva(idTva);
        setTauxTva(tauxTva);
    }

    /* getters et setters */

    public void setIdTva(int idTva) {
        this.idTva = idTva;
    }
    public void setTauxTva(double tauxTva) {
        this.tauxTva = tauxTva;
    }
    public int getIdTva() {
        return idTva;
    }
    public double getTauxTva() {
        return tauxTva;
    }
}
