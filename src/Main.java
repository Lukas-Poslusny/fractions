import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numerator of first fraction: ");
        int numerator_fr1 = sc.nextInt();
        System.out.print("Denominator of first fraction: ");
        int denominator_fr1 = sc.nextInt();
        System.out.print("Numerator of second fraction: ");
        int numerator_fr2 = sc.nextInt();
        System.out.print("Denominator of second fraction: ");
        int denominator_fr2 = sc.nextInt();

        Fraction fr = new Fraction (numerator_fr1, denominator_fr1); 
        Fraction fr2 = new Fraction (numerator_fr2, denominator_fr2); 

        IFraction add = fr.add(fr2);
        IFraction subtract = fr.minus(fr2);
        IFraction multiply = fr.times(fr2);
        IFraction divide = fr.dividedBy(fr2);
        

        System.out.println("Added: \n" + add.getNumerator() + "\n———\n" + add.getDenominator() + "\n");
        System.out.println("Subtracted: \n" + subtract.getNumerator() + "\n———\n" + subtract.getDenominator() + "\n");
        System.out.println("Multiplied: \n" + multiply.getNumerator() + "\n———\n" + multiply.getDenominator() + "\n");
        System.out.println("Divided: \n" + divide.getNumerator() + "\n———\n" + divide.getDenominator() + "\n");
    }
}
