import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //asks for bill value//
        System.out.print("What's the bill? ");
        double bill = scanner.nextDouble();

        //asks for tip percentage value//
        System.out.print("Tip percentage? ");
        double tipPercent = scanner.nextDouble();

        //asks for amount of people//
        System.out.print("How many people? ");
        int people = scanner.nextInt();

        TipCalculator tip = new TipCalculator(people,tipPercent, bill);
        System.out.println("The total tip amount is $" + String.format("%.2f", tip.tipAmount()));
        System.out.println("The total bill is $" + String.format("%.2f" , tip.totalBill()));
        System.out.println("The tip per person is $" + String.format("%.2f", tip.perPersonTipAmount()));
        System.out.println("The total amount per person is $" + String.format("%.2f", tip.perPersonTotalCost()));

    }
}
