public class Circulo extends Area{

    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = 3.14*(raio*raio);
        System.out.println("Area do circulo: "+area);
    }

    @Override
    public void calcularArea(int lado) {

    }
}
