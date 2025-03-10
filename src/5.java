import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    int randomNumber = rand.nextInt(10); // Generate a random number between 0 and 10
    System.out.println(randomNumber);
  }
}
