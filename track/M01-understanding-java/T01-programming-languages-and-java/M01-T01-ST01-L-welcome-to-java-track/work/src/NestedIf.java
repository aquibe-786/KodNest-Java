public class NestedIf {
    public static void main(String[] args) {
        boolean hasTicket = true;
        int age = 20;

        if (hasTicket) {
            if (age >= 18) {
                System.out.println("Watch movie");
            } else {
                System.out.println("Too young");
            }
        } else {
            System.out.println("Buy ticket");
        }
    }
}
