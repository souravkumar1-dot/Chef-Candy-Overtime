import java.io.*;
import java.util.*;

public class ChefsCandyOvertime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); // Target candies
        int Y = sc.nextInt(); // Actual candies sold

        int earnings;

        if (Y <= X) {
            earnings = Y;
        } else {
            earnings = X + (Y - X) * 2;
        }

        System.out.println(earnings);
    }
}

