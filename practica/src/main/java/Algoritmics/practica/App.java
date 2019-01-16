package Algoritmics.practica;

import java.util.ArrayList;
import java.util.List;

import Algoritmics.practica.data.AgruparDocs;
import Algoritmics.practica.data.AislarDocs;
import Algoritmics.practica.data.Document;
import Algoritmics.practica.data.Generic;
import Algoritmics.practica.data.SetData;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Asignando datos
		List<Document> documents = new ArrayList<Document>();
		documents = SetData.setData();

		// indicator = 00
		List<Document> sinGrupo = documents.stream().filter(document -> "00".equals(document.getIndicator()))
				.collect(Collectors.toList());

		// indicator = 01 && groupId = A
		List<Document> grupoA = documents.stream().filter(document -> "01".equals(document.getIndicator()))
				.filter(document -> "A".equals(document.getGroupId())).collect(Collectors.toList());

		// indicator = 01 && groupId = D
		List<Document> grupoD = documents.stream().filter(document -> "01".equals(document.getIndicator()))
				.filter(document -> "D".equals(document.getGroupId())).collect(Collectors.toList());

		// Agrupa y asigna propiedades faltantes
		List<Generic> genericDocs = new ArrayList<Generic>();
		genericDocs.addAll(AislarDocs.aislarDocs(sinGrupo));
		genericDocs.addAll(AgruparDocs.agruparDocs(grupoA, "A"));
		genericDocs.addAll(AgruparDocs.agruparDocs(grupoD, "D"));

		// imprime resultado
		// genericDocs.stream().forEach(System.out::println);
		// System.out.println("----------------------------");
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(genericDocs));
	}
}
