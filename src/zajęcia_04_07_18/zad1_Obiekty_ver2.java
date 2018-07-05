package zajęcia_04_07_18;

public class zad1_Obiekty_ver2 {
    public static void main(String[] args) {

        zad1_Trousers_ver2 trousers1 = new zad1_Trousers_ver2("Jeans", 42, "Dark blue", "H&M");
        zad1_Trousers_ver2 trousers2 = new zad1_Trousers_ver2("Chinos", 38, "Red", "Zara");

        System.out.println("Pierwsze spodnie:");
        System.out.println("Typ: " + trousers1.type +", rozmiar: " + trousers1.size +", kolor: "
                + trousers1.colour +", marka: "+ trousers1.brand + ".");
        System.out.println("Drugie spodnie:");
        System.out.println("Typ: " + trousers2.type +", rozmiar: "+ trousers2.size +", kolor: "
                + trousers2.colour +", marka: "+ trousers2.brand + ".");
    }
}
