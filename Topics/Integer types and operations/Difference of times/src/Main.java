import java.util.Scanner;

class Main {
  private static int readSeconds(Scanner scanner) {
      int h = scanner.nextInt() * 60 * 60;
      int m = scanner.nextInt() * 60;
      int s = scanner.nextInt();

      return h + m + s;
  }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(-(readSeconds(scanner) - readSeconds(scanner)));
    }
}