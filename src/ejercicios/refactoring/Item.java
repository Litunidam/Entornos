package ejercicios.refactoring;

public class Item {

	private int quality;
	
	private String name;

	private int sold;
	
	public Item() {
		
	}
	public Item(String name, int quality, int sold) {
		this.quality=quality;
		this.name=name;
		this.sold=sold;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	
	
}
