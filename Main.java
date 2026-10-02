public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Toyota", "Corolla", 1998);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 2015);
        Vehicle vehicle3 = new Vehicle("Ford", "Mustang", 2020);


        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        System.out.println();

        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());

        System.out.println();

        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());



        System.out.println();
        System.out.println("===== setYear() Tests =====");

        boolean result1 = vehicle1.setYear(2000);
        System.out.println("setYear(2000): " + result1);
        System.out.println("Year: " + vehicle1.getYear());
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        boolean result2 = vehicle1.setYear(1885);
        System.out.println("setYear(1885): " + result2);
        System.out.println("Year remains: " + vehicle1.getYear());

        boolean result3 = vehicle1.setYear(2027);
        System.out.println("setYear(2027): " + result3);
        System.out.println("Year remains: " + vehicle1.getYear());

        System.out.println();
        System.out.println("===== Constructor Tests =====");
        Vehicle vehicle4 = new Vehicle("Test", "Vehicle", 1885);
        System.out.println("New vehicle with year 1885");
        System.out.println("Initial year is " + vehicle4.getYear());

             Vehicle vehicle5 = new Vehicle("Test", "Vehicle", 2027);
        System.out.println("New vehicle with year 2027");
        System.out.println("Initial year is " + vehicle5.getYear());
    }
}