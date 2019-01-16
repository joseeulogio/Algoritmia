package Algoritmics.practica.data;

import java.util.ArrayList;
import java.util.List;

public class AgruparDocs {
	public static List<Generic> agruparDocs(List<Document> grupoA, String group) {
        List<Generic> genericDocuments = new ArrayList<Generic>();
        Generic genericDocument = new Generic();
        switch(group){
            case "A": 
                genericDocument.setEuCode("D001"); 
                genericDocument.setName("Identificacion Oficial");
                break;
            case "D": 
                genericDocument.setEuCode("D004"); 
                genericDocument.setName("Comprobante de domicilio");
                break;
        }
        genericDocument.setDocument(grupoA);
        genericDocuments.add(genericDocument);
        return genericDocuments;
    }
}
