public class TicketPrice {
    public static void main(String[] args) {
        int age = 16;
        int ticketPrice;

        if (age < 12) {
            ticketPrice = 5;
        } else if (age < 18) {
            ticketPrice = 8;
        } else {
            ticketPrice = 12;
        }

        System.out.println("Ticket price: $" + ticketPrice);
    }
}
