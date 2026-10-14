public class licens {
    public static void main(String[] args) {
        int age = 15;
        boolean hasLicence = true;
        if (age >= 16 && hasLicence) {
            System.out.println("Can drive");
        } else {
            System.out.println("Get a licence first");
        }
    }else{
        System.out.println("Too younge");
    }
}
