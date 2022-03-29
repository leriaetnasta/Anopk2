package pk3;

public class Etudiant implements Comparable<Etudiant> {
    private String nom, prenom, cin;
    private int cne;
    public  Etudiant(String nom,String prenom,String cin,int cne){
        this.nom=nom;
        this.prenom=prenom;
        this.cin=cin;
        this.cne=cne;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setCne(int cne) {
        this.cne = cne;
    }

    public String getNom() {
        return nom;
    }

    public int getCne() {
        return cne;
    }

    public String getCin() {
        return cin;
    }

    public boolean equals(Object obj){
        if(obj instanceof Etudiant ){
            Etudiant etudiant = (Etudiant) obj;
            return this.cin==etudiant.cin;

        }
        return false;


    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", cin='" + cin + '\'' +
                ", cne=" + cne +
                '}';
    }
    @Override
    public int hashCode(){
        return this.cin.hashCode();
    }

    @Override
    public  int compareTo(Etudiant etd) {
        return this.cin.compareTo(etd.cin);
    }



}
