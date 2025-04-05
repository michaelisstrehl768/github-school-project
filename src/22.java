import java.util.Scanner;

public class SchoolProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter the number of your classes:");
        int classes = scanner.nextInt();
        
        for (int i = 1; i <= classes; i++) {
            System.out.println("\n" + name + " class: " + i);
            
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 2 || j == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  * ");
                }
                
                if (i > 1 && i != classes) {
                    for (int k = 1; k <= 5 - i; k++) {
                        System.out.print("* ");
                        
                        if ((k + i) % 2 == 0 || (k + i) >= 5) {
                            break;
                        }
                    }
                } else {
                    for (int k = 1; k <= 4 - i; k++) {
                        System.out.print("  * ");
                    }
                }
                
                if (i > 1 && i != classes) {
                    System.out.print("* ");
                    
                    if ((i + j) % 2 == 0 || (i + j) >= 5) {
                        break;
                    }
                } else {
                    System.out.print("  * ");
                }
            }
        }
        
        scanner.close();
    }
}
