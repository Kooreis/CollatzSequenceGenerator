```java
import java.util.Scanner;

public class CollatzSequenceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        while (number != 1) {
            System.out.println(number);
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = 3 * number + 1;
            }
        }
        System.out.println(number);
    }
}
```