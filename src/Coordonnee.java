public class Coordonnee {
    private Pair[] trajet = {new Pair(1,3),new Pair(1,4),new Pair(1,5),new Pair(1,6)};
    public static Pair nvPair(int x, int y){
        return new Pair(x,y);
    }
    public static class Pair{
        private int x, y;
        public Pair(int x, int y){
            this.x=x;
            this.y=y;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public static void main(String[] args) {
        Coordonnee.Pair pair= new Pair(2,4);
        Coordonnee.Pair pair1= Coordonnee.nvPair(3,5);
        System.out.println(pair.toString());
        System.out.println(pair1.toString());
    }
}
