package br.com.jonathan.domain;

public class Payment {
	private String id;

	public Payment() {
		super();
	}
	
	public Payment(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
