package zajęcia_04_07_18;

public class zad1_Obiekty {
    public static void main(String[] args) {

        zad1_Trousers trousers1 = new zad1_Trousers ();
        zad1_Trousers trousers2 = new zad1_Trousers ();

        trousers1.type = "Jeans";
        trousers1.size = 42;
        trousers1.colour = "Dark blue";
        trousers1.brand = "H&M";

        trousers2.type = "Chinos";
        trousers2.size = 38;
        trousers2.colour = "Red";
        trousers2.brand = "Zara";

        System.out.println("Pierwsze spodnie:");
        System.out.println("Typ: " + trousers1.type +", rozmiar: " + trousers1.size +", kolor: "
                + trousers1.colour +", marka: "+ trousers1.brand + ".");
        System.out.println("Drugie spodnie:");
        System.out.println("Typ: " + trousers2.type +", rozmiar: "+ trousers2.size +", kolor: "
                + trousers2.colour +", marka: "+ trousers2.brand + ".");

    }
}
