public class Quadrado extends Area{

    private int lado;

    public Quadrado(int lado) {
        super();
    }

    @Override
    public void calcularArea(int lado) {
        int area = lado*lado;
        System.out.println(this.lado);
        System.out.println("Area do quadrado é: "+ area);

    }
}

