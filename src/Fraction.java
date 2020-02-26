/**
 * Fraction
 */

public class Fraction implements IFraction {

    public Integer numerator;
    public Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * @return the upper part of the fraction
     */
    @Override
    public Integer getNumerator() {
        return numerator;
    };

    /**
     * @return the bottom part of the fraction
     */
    @Override
    public Integer getDenominator() {
        return denominator;
    };

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @Override
    public IFraction add(IFraction other) {
        int numerator1 = numerator;
        int numerator2 = other.getNumerator();
        int denominator1 = denominator;
        int denominator2 = other.getDenominator();

        int denominatorResult = denominator1 * denominator2;
        int numeratorResult = numerator1*denominator2 + numerator2*denominator1;

        return new Fraction(numeratorResult, denominatorResult);
    };

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @Override
    public IFraction minus(IFraction other) {
        int numerator1 = numerator;
        int numerator2 = other.getNumerator();
        int denominator1 = denominator;
        int denominator2 = other.getDenominator();

        int denominatorResult = denominator1 * denominator2;
        int numeratorResult = numerator1*denominator2 - numerator2*denominator1;

        return new Fraction(numeratorResult, denominatorResult);
    };

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @Override
    public IFraction times(IFraction other) {
        int numerator1 = numerator;
        int numerator2 = other.getNumerator();
        int denominator1 = denominator;
        int denominator2 = other.getDenominator();

        int denominatorResult = denominator1 * denominator2;
        int numeratorResult = numerator1 * numerator2;

        return new Fraction(numeratorResult, denominatorResult);
    };

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @Override
    public IFraction dividedBy(IFraction other) {
        int numerator1 = numerator;
        int numerator2 = other.getNumerator();
        int denominator1 = denominator;
        int denominator2 = other.getDenominator();

        int denominatorResult = denominator1 * numerator2;
        int numeratorResult = denominator2 * numerator1;

        return new Fraction(numeratorResult, denominatorResult);
    };

    /**
     * @param other fraction
     * @return new instance of Ifraction simplified to the lowest possible numbers
     */
    @Override
    public IFraction trimFraction (IFraction other){
        int numerator = other.getNumerator();
        int denominator = other.getDenominator();
        int maxSubNum = 0; // nejvetsi spolecny delitel

        for (int i = 1; i <= denominator || i <= numerator; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                maxSubNum = numerator;
            }
        }
        System.out.println(maxSubNum);

        int numeratorResult = numerator / maxSubNum;
        int denominatorResult = denominator / maxSubNum;

        return new Fraction(numeratorResult, denominatorResult);
    }
}