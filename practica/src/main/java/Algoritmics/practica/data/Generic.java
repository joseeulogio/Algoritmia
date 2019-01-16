package Algoritmics.practica.data;

import java.util.List;

public class Generic {
	private String euCode;
    private String name;
    private List<Document> document;
	public String getEuCode() {
		return euCode;
	}
	public void setEuCode(String euCode) {
		this.euCode = euCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Document> getDocument() {
		return document;
	}
	public void setDocument(List<Document> document) {
		this.document = document;
	}
	@Override
	public String toString() {
		return "Generic [euCode=" + euCode + ", name=" + name + ", document=" + document + "]";
	}
    
    
}
