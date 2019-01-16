package Algoritmics.practica.data;

public class Document {
	private String name;
	private String indicator;
	private String groupId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	@Override
	public String toString() {
		return "Document [name=" + name + ", indicator=" + indicator + ", groupId=" + groupId + "]";
	}

}