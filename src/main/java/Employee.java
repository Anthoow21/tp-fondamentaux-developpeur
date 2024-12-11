/**
* Représente un employé dans une entreprise.
*/
public class Employee {

    private String nom;
    private int id;
    private String position;
    // TODO: Ajoutez les attributs ici (nom, id, position).

    public Employee(String nom, int id, String position)  {
        this.nom = nom;
        this.id = id;
        this.position = position
    }
    // TODO: Ajoutez un constructeur pour initialiser les attributs.

    public String getNom() {
        return this.nom;
    }

    public int getId() {
        return this.id;
    }

    public String getPosition() {
        return this.position;
    }
    // TODO: Ajoutez des méthodes pour récupérer les valeurs des attributs (getters).

    @Override
    public String toString() {
        return "L'employe s'appelle " + this.nom + ", son identifiant est " + this.id + "et sa position dans l'entreprise est " + this.position;
    }
    // TODO: Ajoutez une méthode toString() pour représenter un employé en texte.
}
    