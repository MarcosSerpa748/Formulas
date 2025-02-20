public class Retangulo implements Formulas {
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double formula() {
        return this.base*this.altura;
    }
}
