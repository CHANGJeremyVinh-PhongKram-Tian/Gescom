package metier;

import java.util.*;

public class Ligne {
    private int qteCommande;
    private Article article;
   /* propriétés privées */
   
   /* getters et setters */

    public void setQteCommande(int qteCommande) {
        this.qteCommande = qteCommande;
    }
    public int getQteCommande() {
        return qteCommande;
    }
    public void setArticle(Article article) {
        this.article = article;
    }
    public Article getArticle() {
        return article;
    }

    public Ligne (Article unArticle, int qteCommande){
        /* Affectations */
        setQteCommande(qteCommande);
        setArticle(unArticle);
    }
}