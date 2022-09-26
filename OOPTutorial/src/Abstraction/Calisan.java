package Abstraction;

public abstract class Calisan {
	private String isim;
	private String telNo;
	private String ePosta;

	public Calisan(String isim, String telNo, String ePosta) {
		this.isim = isim;
		this.telNo = telNo;
		this.ePosta = ePosta;
	}
	
	public abstract void giris();
	
	public abstract void cikis(); 
		
	

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

}
