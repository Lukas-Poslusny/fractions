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

        int denominatorResult = denominator * other.getDenominator();
        int numeratorResult = (other.getDenominator() * numerator) + (denominator * other.getNumerator());

        for (int i = numeratorResult; i > 1; i--) {
            if (numeratorResult % i == 0 && denominatorResult % i == 0) {
                numeratorResult = numeratorResult / i;
                denominatorResult = denominatorResult / i;
            }
        }

        return new Fraction(numeratorResult, denominatorResult);
    };

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @Override
    public IFraction minus(IFraction other) {

        int denominatorResult = denominator * other.getDenominator();
        int numeratorResult = numerator * other.getDenominator() - other.getNumerator() * denominator;

        for (int i = numeratorResult; i > 1; i--) {
            if (numeratorResult % i == 0 && denominatorResult % i == 0) {
                numeratorResult = numeratorResult / i;
                denominatorResult = denominatorResult / i;
            }
        }

        return new Fraction(numeratorResult, denominatorResult);
    };

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @Override
    public IFraction times(IFraction other) {

        int denominatorResult = denominator * other.getDenominator();
        int numeratorResult = numerator * other.getNumerator();

        for (int i = numeratorResult; i > 1; i--) {
            if (numeratorResult % i == 0 && denominatorResult % i == 0) {
                numeratorResult = numeratorResult / i;
                denominatorResult = denominatorResult / i;
            }
        }

        return new Fraction(numeratorResult, denominatorResult);
    };

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @Override
    public IFraction dividedBy(IFraction other) {

        int denominatorResult = denominator * other.getNumerator();
        int numeratorResult = other.getDenominator() * numerator;

        for (int i = numeratorResult; i > 1; i--) {
            if (numeratorResult % i == 0 && denominatorResult % i == 0) {
                numeratorResult = numeratorResult / i;
                denominatorResult = denominatorResult / i;
            }
        }

        return new Fraction(numeratorResult, denominatorResult);
    };

}
