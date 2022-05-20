public class Addition implements Calcul {
    @Override
    public int calculer(int a, int b) {
        return a+b;
    }
    

    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println(a.calculer(4,7));
        System.out.println(a.calculer(9,14));
        System.out.println(a.calculer(6,6));
        System.out.println(a.calculer(8,8));
        System.out.println(a.calculer(15,15));

    }
}
