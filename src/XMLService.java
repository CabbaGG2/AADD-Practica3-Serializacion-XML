import javax.xml.parsers.SAXParser;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class XMLService {
    private static final String XML_FILE = "autores.xml";

    public SAXParser crearXML(String autor, String codigo, String nombre, String titulo, String titulo2, String codigo2, String nombre2, String titulo3, String titulo4) throws IOException, XMLStreamException {
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        try {
             XMLStreamWriter writer = factory.createXMLStreamWriter((new FileWriter(XML_FILE)));

            writer.writeStartDocument("1.0");
            writer.writeStartElement("autores");
            writer.writeStartElement("autor");
            writer.writeAttribute("codigo", codigo);
            writer.writeStartElement("nombre");
            writer.writeCharacters(nombre);
            writer.writeEndElement();
            writer.writeStartElement("titulo");
            writer.writeCharacters(titulo);
            writer.writeEndElement();
            writer.writeStartElement("titulo2");
            writer.writeCharacters(titulo2);
            writer.writeEndElement();
            writer.writeEndElement();
            writer.writeStartElement("autor");
            writer.writeAttribute("codigo", codigo2);
            writer.writeStartElement("nombre");
            writer.writeCharacters(nombre2);
            writer.writeEndElement();
            writer.writeStartElement("titulo");
            writer.writeCharacters(titulo3);
            writer.writeEndElement();
            writer.writeStartElement("titulo2");
            writer.writeCharacters(titulo4);
            writer.writeEndElement();
            writer.writeEndElement();
            writer.writeEndDocument();
            writer.flush();
            writer.close();
            System.out.println("Archivo 'autores.xml' creado con exito.");
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
