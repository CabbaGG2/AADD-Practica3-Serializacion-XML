import java.io.*;

public class SerializarService {

    public void SerializarProducto(Producto producto) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("serial");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(producto);
            System.out.println("Objeto guardado en 'serial' con exito.");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        }
    }

    public void SerializarProducto(ProductoTransient producto) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("serialT");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(producto);
            System.out.println("Objeto guardado en 'serial' con exito.");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        }
    }

    public Producto DeserializarProducto(String ruta) throws IOException, ClassNotFoundException, FileNotFoundException {
        try (FileInputStream fis = new FileInputStream(ruta);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Producto producto = (Producto) ois.readObject();
            System.out.println("Objeto cargado desde '" + ruta + "' con exito.");
            return producto;
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: " + e.getMessage());

        }
        return null;
    }

    public ProductoTransient DeserializarProductoT(String ruta) throws IOException, ClassNotFoundException, FileNotFoundException {
        try (FileInputStream fis = new FileInputStream(ruta);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            ProductoTransient producto = (ProductoTransient) ois.readObject();
            System.out.println("Objeto cargado desde '" + ruta + "' con exito.");
            return producto;
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: " + e.getMessage());

        }
        return null;
    }



}
