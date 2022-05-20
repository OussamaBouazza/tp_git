public class Soustraction implements Calcul{

    @Override
    public int calculer(int a, int b){
         return a-b ;
    }

    public static void main(String[] args) {
        Soustraction s =new Soustraction();
        System.out.println(s.calculer(4,5));
        System.out.println(s.calculer(6,5));

    }
}
