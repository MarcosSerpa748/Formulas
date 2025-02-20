public class Circulo implements Formulas{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;
    }

    @Override
    public double formula() {
        return Math.PI*(this.raio * this.raio);
    }
}
