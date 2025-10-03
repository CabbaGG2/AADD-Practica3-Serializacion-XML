import java.io.Serializable;

public class Producto implements Serializable {
    private String nombre;
    private  int num1;
    private double num2;

    public Producto(String nombre, int num1, double num2) {
        this.nombre = nombre;
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setCantidad(int cantidad) {
        this.num2 = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + num1 +
                ", cantidad=" + num2 +
                '}';
    }
}
