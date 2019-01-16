package Algoritmics.practica.data;

import java.util.ArrayList;
import java.util.List;

public class AislarDocs {
	 public static List<Generic> aislarDocs(List<Document> sinGrupo) {
	        List<Generic> genericDocuments = new ArrayList<Generic>();
	        for (Document var : sinGrupo) {
	            Generic data = new Generic();
	            List<Document> document = new ArrayList<Document>();
	            document.add(var);
	            data.setDocument(document);
	            switch(var.getGroupId()){
	                case "B": 
	                    data.setEuCode("D002"); 
	                    data.setName("Comprobante de compra");
	                    break;
	                case "C": 
	                    data.setEuCode("D003"); 
	                    data.setName("Estado de cuenta");
	                    break;
	            }
	            genericDocuments.add(data);
	        }
	        return genericDocuments;
	    }
}
