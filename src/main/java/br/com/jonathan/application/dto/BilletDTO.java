package br.com.jonathan.application.dto;

public class BilletDTO {
	private String billetId;
	private String barCode;

	public BilletDTO() {
		super();
	}

	public BilletDTO(String billetId, String barCode) {
		this.billetId = billetId;
		this.barCode = barCode;
	}

	public String getBilletId() {
		return billetId;
	}

	public void setBilletId(String billetId) {
		this.billetId = billetId;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
}
