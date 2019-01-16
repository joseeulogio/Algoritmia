package Algoritmics.practica.data;

import java.util.ArrayList;
import java.util.List;

public class SetData {
	public static List<Document> setData() {
        List<Document> documents = new ArrayList<Document>();
        // Documento 1
        Document documentData1 = new Document();
        documentData1.setIndicator("01");
        documentData1.setGroupId("A");
        documentData1.setName("INE");
        documents.add(documentData1);

        // Documento 2
        Document documentData2 = new Document();
        documentData2.setIndicator("00");
        documentData2.setGroupId("B");
        documentData2.setName("Ticket de compra");
        documents.add(documentData2);

        // Documento 3
        Document documentData3 = new Document();
        documentData3.setIndicator("01");
        documentData3.setGroupId("A");
        documentData3.setName("Pasaporte");
        documents.add(documentData3);

        // Documento 4
        Document documentData4 = new Document();
        documentData4.setIndicator("00");
        documentData4.setGroupId("C");
        documentData4.setName("Estado de cuenta");
        documents.add(documentData4);

        // Documento 5
        Document documentData5 = new Document();
        documentData5.setIndicator("01");
        documentData5.setGroupId("A");
        documentData5.setName("Cedula profesional");
        documents.add(documentData5);

        // Documento 6
        Document documentData6 = new Document();
        documentData6.setIndicator("01");
        documentData6.setGroupId("D");
        documentData6.setName("Recibo de luz");
        documents.add(documentData6);

        // Documento 5
        Document documentData7 = new Document();
        documentData7.setIndicator("01");
        documentData7.setGroupId("D");
        documentData7.setName("Recibo de telefono");
        documents.add(documentData7);

        return documents;
    }
}
