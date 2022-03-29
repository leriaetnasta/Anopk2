package pk4;

import java.util.Comparator;

public class Employe {
    private String nom;
    private double salaireBase;
    private int nbAnnee;
    public double calculerSalaire(){
        return salaireBase*(1+ (double)nbAnnee/10);
    }
    Employe(String n, double s, int a){
        nom=n;
        salaireBase=s;
        nbAnnee=a;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", salaireBase=" + salaireBase +
                ", nbAnnee=" + nbAnnee +
                "nv salaire=" + calculerSalaire()+
                '}';
    }

    public static void main(String[] args) {
        Employe employe= new Employe("loubna", 999999, 3);
        // class annonyme
        Employe directeur = new Employe("lou", 456789, 4){
            @Override
            public double calculerSalaire(){
                return super.calculerSalaire() + 15000;
            }
        };

        System.out.println(directeur);
         // on ne peut pas instantier une interface on passe par une classe annonyme
        Comparator<Employe> comparateur = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                double res= o1.calculerSalaire()-o2.calculerSalaire(),
                if (res>0) {
                    return 1;
                }else if(res==0){
                    return 0;
                }
                return -1;

            }
        };

    }
}
