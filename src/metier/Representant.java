package metier;

import java.util.*;

public class Representant {
    private int idRepresentant;
    private String prenom;
    private String nom;
    private List<Client> lesClients;
    /* propriétés privées */

    public Representant(int idRepresentant, String prenom, String nom, List<Client> lesClients) {
        /* Affectations */
        setIdRepresentant(idRepresentant);
        setPrenom(prenom);
        setNom(nom);
        setLesClients(lesClients);
        setLesClients(lesClients);
    }

    /**
     * Recherche un Client sur son id dans la 
     * liste des clients. 
     * Retourne le Client si trouvé, sinon retourne null
     * @param idClient
     * @return Client
     */
    public Client getClientById(int idClient) {
        /* A compléter */
        for (Client client : getLesClients()) {
            if (client.getIdClient()==idClient){
                return client;
            }
        }
        return null;/* A compléter */
    }

    /* getters et setters */

    public void setIdRepresentant(int idRepresentant) {
        this.idRepresentant = idRepresentant;
    }
    public int getIdRepresentant() {
        return idRepresentant;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
    public void setLesClients(List<Client> lesClients) {
        this.lesClients = lesClients;
    }
    public List<Client> getLesClients() {
        return lesClients;
    }

}
