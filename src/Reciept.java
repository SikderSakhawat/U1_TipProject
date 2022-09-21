import java.util.Scanner;
public class Reciept {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How much is your bill?");
        double totalCash = s.nextDouble();
        System.out.println("How many people are in your party?");
        int numPeople = s.nextInt();
        System.out.println("How much percent in tip will you be giving (please choose a number from 0 to 100) ");
        double tipAmount = s.nextDouble();
        
    }
}
