
//"Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio."


public class Main {
    public static void main(String[] args) {
        int numero = 4;
        dividiPerZero(numero);
    }

    public static void dividiPerZero(int numTest) {
        try {
            int div = numTest / 0;
            System.out.println("divisione" + div);
        } catch (ArithmeticException e) {
            System.out.println("Il numero non può essere diviso per 0 " + e);
        }
    }
}
