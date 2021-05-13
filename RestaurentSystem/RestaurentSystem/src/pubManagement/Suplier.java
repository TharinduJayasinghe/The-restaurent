package pub;

public class Suplier {

	private int id;
	private String Name;
	private String company;
	private String brand;
	private String phone;
	
	
	public Suplier(int id, String name, String company, String brand, String phone) {
		super();
		this.id = id;
		Name = name;
		this.company = company;
		this.brand = brand;
		this.phone = phone;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
}
