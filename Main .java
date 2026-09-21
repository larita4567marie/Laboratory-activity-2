public class Main {

    public static void main(String[] args) {

        // Vehicle 1
        Vehicle vehicle1 = new Vehicle();
        vehicle1.brand = "Toyota";
        vehicle1.model = "Corolla";
        vehicle1.year = 1998;

        // Vehicle 2
        Vehicle vehicle2 = new Vehicle();
        vehicle2.brand = "Honda";
        vehicle2.model = "Civic";
        vehicle2.year = 2015;

        // Vehicle 3
        Vehicle vehicle3 = new Vehicle();
        vehicle3.brand = "Ford";
        vehicle3.model = "Mustang";
        vehicle3.year = 2020;

        // Vehicle 1
        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        System.out.println();

        // Vehicle 2
        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());

        System.out.println();

        // Vehicle 3
        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
    }
}