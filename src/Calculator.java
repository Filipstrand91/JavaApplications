import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Skriv två tal");
		Scanner scan = new Scanner(System.in);
		double nbr1 = scan.nextDouble();
		double nbr2 = scan.nextDouble();
		double sum = nbr1 + nbr2;
		double sum1 = nbr1 - nbr2;
		double sum2 = nbr1 * nbr2;
		double sum3 = nbr1 / nbr2;
		System.out.println("Summan av talen är " + sum);
		System.out.println("Skillnaden mellan talen är " + sum1);
		System.out.println("Produkten av talen är " + sum2);
		System.out.println("Kvoten av talen är " + sum3);
		scan.close();
		// varför scan.close?
	}
}
