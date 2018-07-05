package zajęcia_04_07_18;


import java.util.Locale;

public class zad2_Cars_ver2 {
        public static void main(String[] args) {
            Locale.setDefault(new Locale("en", "US"));

            zad2_Car car1 = new zad2_Car("BMW", "M5", 2007, 2.6); //marka, model, rocznik, pojemność silnika
            zad2_Car car2 = new zad2_Car("Opel", "Vectra", 2004, 1.8);

            System.out.println("Samochód 1:");
            System.out.printf("Marka: %s" + ", model: %s" +
                    ", rocznik: %d" + ", pojemność: %.1f.\n", car1.brand, car1.model, car1.year, car1.capacity);
            System.out.println("Samochód 2:");
            System.out.printf("Marka: %s" + ", model: %s" +
                    ", rocznik: %d" + ", pojemność: %.1f.\n", car2.brand, car2.model, car2.year, car2.capacity);
        }
    }

