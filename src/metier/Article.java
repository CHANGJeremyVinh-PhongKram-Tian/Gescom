package metier;

import java.util.*;

public class Article {
    private int idArticle;
    private String designation;
    private int qteStock;
    private double prix;
    private Tva tva;
    private Famille famille;
    /* propriétés privées */

    /* getters et setters */

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getDesignation() {
        return designation;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }
    public int getIdArticle() {
        return idArticle;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    public double getPrix() {
        return prix;
    }

    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }
    public int getQteStock() {
        return qteStock;
    }
    public void setTva(Tva tva) {
        this.tva = tva;
    }
    public Tva getTva() {
        return tva;
    }
    public void setFamille(Famille famille) {
        this.famille = famille;
    }
    public Famille getFamille() {
        return famille;
    }


    public Article(int idArticle, String designation, int qteStock, double prix, Tva uneTva, Famille uneFamille) {
        setIdArticle(idArticle);
        setDesignation(designation);
        setQteStock(qteStock);
        setPrix(prix);
        setTva(uneTva);
        setFamille(uneFamille);
    }

}
