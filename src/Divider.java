import java.util.*;
/**
 * Created by sashachechelnitska on 9/18/17.
 */
public class Divider {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter your number: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println("Dividers:");
        for (int i = 1; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                System.out.println(i);
                if (i != input / i)
                    System.out.println(input / i);
            }
        }
    }
}