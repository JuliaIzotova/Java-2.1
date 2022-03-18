public class Main {
    public static void main(String[] args) {

        // Входные данные
        int ticketPrice = 1_000;
        int milePrice = 20;

        // Решениe

        int milesEarned  = (int) ticketPrice / milePrice;

        System.out.println("Накопленные мили:");
        System.out.println(milesEarned);
    }
}



