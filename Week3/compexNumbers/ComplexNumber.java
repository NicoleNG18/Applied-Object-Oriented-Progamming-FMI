package compexNumbers;

public class ComplexNumber {
    private double imaginaryPart;
    private double realPart;

    public ComplexNumber(double imaginaryPart, double realPart) {
        setImaginaryPart(imaginaryPart);
        setRealPart(realPart);
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public ComplexNumber add(ComplexNumber rhs) {
        return new ComplexNumber(
                this.realPart + rhs.getRealPart(),
                this.imaginaryPart + rhs.getImaginaryPart()
        );
    }

    public double getAngle() {
        return Math.atan2(imaginaryPart, realPart);
    }

    public double getMagnitude() {
        return Math.sqrt((realPart * realPart) + (imaginaryPart * imaginaryPart));
    }
}
