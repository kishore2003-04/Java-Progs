package first;
import java.util.*;

public class week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number(1-7) to show a day in week:");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("The day is: Monday");
                break;
            case 2:
                System.out.println("The day is: Tuesday");
                break;
            case 3:
                System.out.println("The day is: Wednesday");
                break;
            case 4:
                System.out.println("The day is: Thursday");
                break;
            case 5:
                System.out.println("The day is: Friday");
                break;
            case 6:
                System.out.println("The day is: Saturday");
                break;
            case 7:
                System.out.println("The day is: Sunday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
                break;
        }
    }
}
