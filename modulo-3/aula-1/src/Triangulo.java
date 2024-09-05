public class Triangulo implements AreaCalculavel {
    private double lado1;
    private double lado2;
    private double lado3;


    @Override
    public double CalcularArea() {
        double perimetro = lado1 + lado2 + lado3;
        return Math.sqrt(perimetro*(perimetro-lado1)*(perimetro-lado2)*(perimetro-lado3));
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
}
