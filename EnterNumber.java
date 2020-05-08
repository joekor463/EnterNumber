import java.util.Scanner;
public class EnterNumber {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        //int nums[] = new int[10];
        System.out.println ("Enter 10 digits ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int count = 0;
            for(int i = 1;i<=10;i++){
                System.out.println ("Enter number #"+ i +":");

                int digit = scanner.nextInt();
                scanner.nextLine(); // handle next line character (enter key)
                count = count + digit;
            }
            System.out.println ("Summ ="+ count);
        }
        else {
            System.out.println("Unable to parse year of birth.");}
        scanner.close();
    }


}
