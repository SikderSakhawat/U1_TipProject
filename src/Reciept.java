import java.util.Scanner;
public class Reciept {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How much is your bill?");
        double totalCash = s.nextDouble(); // shows the current bill amount, without tip
        System.out.println("How many people are in your party?");
        int numPeople = s.nextInt(); // gives the number of people who will be paying for the bill
        System.out.println("How much percent in tip will you be giving (please choose a number from 0 to 100) ");
        double tipAmount = s.nextDouble(); // gives the % of tip needed
        double billPerPerson = totalCash / numPeople;
        // shows the amount of cash each person will pay, not including tip
        double tipPerPerson = billPerPerson * (tipAmount/100);
        // gives the amount of tip each person will pay
        double totalPerPerson = tipPerPerson + billPerPerson;
        // gives the total amount each person has to pay with tip
        double billWithTip = totalPerPerson * numPeople;
        // gives the total amount needed to pay for the bill, with tip
        double totalTip = billWithTip - totalCash; // gives the total bill with tip
        String design = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

        // OUTPUT BELOW
        System.out.println(design);
        System.out.printf("Total Cash: $"+ "%.2f" + "\n", totalCash);
        System.out.printf("Your bill with tip is: $" + "%.2f" + "\n", billWithTip);
        System.out.printf("Bill per person, without tip: $" + "%.2f" + "\n",billPerPerson);
        System.out.printf("Total tip: $" + "%.2f" + "\n", totalTip);
        // everything above outputs anything pertaining to the total bill or tip
        System.out.println();
        System.out.println("Number of people: " + numPeople); // tells you number of people
        System.out.println();
        System.out.println("Percentage of tip given: " + tipAmount + "%");
        System.out.printf("Amount of tip per person: $" + "%.2f" + "\n", tipPerPerson);
        System.out.printf("Total bill per person: $" + "%.2f" + "\n", totalPerPerson);
        // everything above outputs anything pertaining to the cost and tip per person
        System.out.println(design);
    }
}
