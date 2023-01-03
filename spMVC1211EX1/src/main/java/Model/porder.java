package Model;

public class porder {
	private Integer Id;
	private String name;
	private Integer Lcd;
	private Integer Ram;
	private Integer sum;
	public porder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public porder(String name, Integer lcd, Integer ram) {
		super();
		this.name = name;
		Lcd = lcd;
		Ram = ram;
		sum=Lcd*4999+Ram*1280;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLcd() {
		return Lcd;
	}
	public void setLcd(Integer lcd) {
		Lcd = lcd;
	}
	public Integer getRam() {
		return Ram;
	}
	public void setRam(Integer ram) {
		Ram = ram;
	}
	public Integer getSum() {
		sum=Lcd*4999+Ram*1280;
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "porder [Id=" + Id + ", name=" + name + ", Lcd=" + Lcd + ", Ram=" + Ram + ", sum=" + sum + "]";
	}
	
	

}