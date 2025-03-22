// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wpisz wartość: ");
    int num1 = scanner.nextInt();


    System.out.println("Wpisz wartość: ");
    int num2 = scanner.nextInt();

    System.out.println("Wpisz wartość: ");
    int num3 = scanner.nextInt();

    int max = Math.max(num1, Math.max(num2, num3));

    System.out.println("Największa liczba to: " + max);

    scanner.close();
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}