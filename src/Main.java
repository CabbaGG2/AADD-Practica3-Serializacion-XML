import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalArgumentException {
        Producto p1 = new Producto("Manzana", 100, 0.5);
        SerializarService serializarService = new SerializarService();
        serializarService.SerializarProducto(p1);

        Producto p2 = serializarService.DeserializarProducto("serial");
        System.out.println(p2.toString());

        ProductoTransient p3 = new ProductoTransient("Pera", 50, 1.5);
        serializarService.SerializarProducto(p3);

        ProductoTransient p4 = (ProductoTransient) serializarService.DeserializarProductoT("serialT");
        System.out.println(p4);
    }
}
