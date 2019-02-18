import java.util.*;

public class NextInt {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int age  = getInt(console, "How old are you? ");
    }
    
    // prompts until a valid number is entered
    public static int getInt(Scanner console, String promopt) {
        System.out.print(promopt);
        while (!console.hasNextInt()) {
            console.next(); //to discard the input
            System.out.println("Not an integer; try again");
            System.out.print(promopt);
        }
        return console.nextInt();
    }
}