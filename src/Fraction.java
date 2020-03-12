/**
 * Fraction
 */

public class Fraction implements IFraction {

    public Integer numerator;
    public Integer denominator;
    public Integer numeratorResult;
    public Integer denominatorResult;


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

        int denominatorResult = denominator * other.getDenominator();
        int numeratorResult = (other.getDenominator() * numerator) + (denominator * other.getNumerator());

        return new Fraction(trimNumerator(numeratorResult, denominatorResult), trimDenominator(numeratorResult, denominatorResult));
    };

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @Override
    public IFraction minus(IFraction other) {

        int denominatorResult = denominator * other.getDenominator();
        int numeratorResult = numerator * other.getDenominator() - other.getNumerator() * denominator;

        return new Fraction(trimNumerator(numeratorResult, denominatorResult), trimDenominator(numeratorResult, denominatorResult));
    };

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @Override
    public IFraction times(IFraction other) {

        int denominatorResult = denominator * other.getDenominator();
        int numeratorResult = numerator * other.getNumerator();

        return new Fraction(trimNumerator(numeratorResult, denominatorResult), trimDenominator(numeratorResult, denominatorResult));
    };

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @Override
    public IFraction dividedBy(IFraction other) {

        int denominatorResult = denominator * other.getNumerator();
        int numeratorResult = other.getDenominator() * numerator;

        return new Fraction(trimNumerator(numeratorResult, denominatorResult), trimDenominator(numeratorResult, denominatorResult));
    };

    public int trimNumerator(int numerator, int denominator) {
        for (int i = numerator; i > 1; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                numeratorResult = numerator / i;
            }
        }
        return numeratorResult;
    }

    public int trimDenominator(int numerator, int denominator) {
        for (int i = numerator; i > 1; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                denominatorResult = denominator / i;
            }
        }
        return denominatorResult;
    }
}