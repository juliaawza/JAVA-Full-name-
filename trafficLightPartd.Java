public class TrafficLight {
    public static void main(String[] args) {
        String colour = "red";

        switch (colour) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Prepare to stop");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid colour");
        }
    }
} 
