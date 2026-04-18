package rational;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        this(1, 1);
    }

    public Rational(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public Rational(Rational other) {
        this(other.numerator, other.denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            System.err.println("Error: Denominator cannot be zero. Setting to 1.");
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
        simplify();
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private void simplify() {
        if (denominator == 0) return;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        int commonDivisor = gcd(numerator, denominator);
        numerator /= commonDivisor;
        denominator /= commonDivisor;
    }

    public Rational add(Rational other) {
        int newNum = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDen = this.denominator * other.denominator;
        return new Rational(newNum, newDen);
    }

    public Rational subtract(Rational other) {
        int newNum = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDen = this.denominator * other.denominator;
        return new Rational(newNum, newDen);
    }

    public Rational multiply(Rational other) {
        return new Rational(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public Rational divide(Rational other) {
        if (other.numerator == 0) {
            System.err.println("Error: Division by zero.");
            return new Rational(0, 1);
        }
        return new Rational(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}