public class Quadrado implements Formulas {
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double formula() {
        return this.lado*lado;
    }
}
