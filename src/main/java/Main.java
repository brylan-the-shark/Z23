// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
// import java.utils.ArrayList;

public class Main {
  private static int number = 5;
  
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i < number; i++) {
      sum += randInt(0, 100);
    }

    System.out.printf("Sum of %d random numbers: %d\n", number, sum);
  }

  private static int randInt(int min, int max) {
      return (int)((Math.random() * (max - min)) + min);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}