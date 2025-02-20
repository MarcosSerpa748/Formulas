public class Triangulo implements Formulas {
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    @Override
    public double formula() {
        return this.base*this.altura/2;
    }
}
