package pk3;

import java.util.Comparator;

public class ComparateurParCne implements Comparator<Etudiant> {

    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        return o1.getCne()-o2.getCne();
    }
}
