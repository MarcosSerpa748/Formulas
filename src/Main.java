public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(6);
        Quadrado q1 = new Quadrado(5);
        Retangulo r1 = new Retangulo(4,13);
        Triangulo t1 = new Triangulo(5,8);

        System.out.println("Área do Circulo:"+c1.formula());
        System.out.println("Área do Quadrado:"+q1.formula());
        System.out.println("Área do Retangulo:"+r1.formula());
        System.out.println("Área do Triângulo:"+t1.formula());
    }
}