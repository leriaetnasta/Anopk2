public class Externe {

    private int i= 5;
    private static int b= 0;
    // instancier une classe interne statique n'a pas besoin d'une instanciation de la classe externe
    // la classe interne statique n'a pas l'access a tt les attributs de la classe externe uniquement les elements statiques
    private Interne interne= new Interne();
    public static class Interne{
        public void afficher(){
            System.out.println(b);
        }

    }

    public static void main(String[] args) {
        Externe.Interne interne= new Interne();
    }
}
