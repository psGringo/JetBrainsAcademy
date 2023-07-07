import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalCountDesks = 0;
        for (int i = 0; i < 3; i++) {
            int countPersons = scanner.nextInt();
            int countDesks = countPersons / 2;
            int remainder = countPersons % 2;
            
            totalCountDesks += (countDesks + remainder);
        }

        System.out.println(totalCountDesks);
    }
}
