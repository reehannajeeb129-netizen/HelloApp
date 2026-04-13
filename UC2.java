public class UC1{
       public static void main(String[] args) {
        // Get the name from command-line argument
        if (args.length > 0) {
    String name = args[0];
    System.out.println("Hello, " + name + "!");
} else {
    System.out.println("Please provide a name as a command-line argument.");
}
    }
}