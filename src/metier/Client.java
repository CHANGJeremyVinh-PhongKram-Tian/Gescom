package metier;

import java.util.*;

public class Client {
    private int idClient;
    private String raisonSociale;
    private ArrayList<Commande> lesCommandes;
    private Categorie categorie;
    private double caClient;


    /* propriétés privées */

    /* getters et setters */

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }
    public void setLesCommandes(ArrayList<Commande> commandes) {
        this.lesCommandes = commandes;
    }
    public ArrayList<Commande> getLesCommandes() {
        return lesCommandes;
    }
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    public Categorie getCategorie() {
        return categorie;
    }

    public double getCaClient() {
        return caClient;
    }

    public Client(int idClient, String raisonSociale, Categorie uneCategorie) {
        setIdClient(idClient);
        setRaisonSociale(raisonSociale);
        setCategorie(uneCategorie);
    }

    /**
     * Ajoute une commande à la liste des commandes
     * du client. Prendre la précaution de vérifier
     * que la liste a bien été instanciée
     * @param uneCommande 
     */
    public void ajouterCommande(Commande uneCommande) {
        if (getLesCommandes() == null){
            setLesCommandes(new ArrayList<Commande>());
        }
        if (!getLesCommandes().contains(uneCommande)) {
            this.lesCommandes.add(uneCommande);
            this.cumulCA();
        }
    }

    /**
     * Affecte la somme des valorisations des commandes
     * au CA du client. Prendre la précaution de 
     * l'initialiser avant de commencer
     */
    public void cumulCA() {

        double caClient=0;

        for (Commande commande : getLesCommandes()) {
            this.caClient+=commande.valoriserCommande();
        }
    }

    /**
     * Recherche une commande sur son numéro en 
     * parcourant la liste des commandes, Retourne
     * une Commande si trouvée, sinon retourne null
     * @param idCommande
     * @return Commande
     */
    public Commande getCommandeById(int idCommande) {
        /* A compléter */
        for (Commande commande: getLesCommandes()){
            if (commande.getIdCommande()==idCommande){
                return commande;
            }
        }
        return null;/* A compléter */
    }

    /**
     * Retire une commande la liste des commandes.
     * Remarque : en supprimant une commande on supprime
     * aussi ses lignes (Composition)
     * @param uneCommande 
     */
    public void supprimerCommande(Commande uneCommande) {
       /* A compléter */
        int idcom=0;
        for (Commande commande:getLesCommandes()){
            if (commande.equals(uneCommande)){
                lesCommandes.remove(commande);
            }
        }
    }


}
