package refactorjava;

public class Movie {
	
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private String _title;
	private int _priceCode;
	private Price _price;
	
	public Movie(String title, int priceCode) {
		try {
			_title = title;
			setPriceCode(priceCode);
		} catch (Exception e) {
			throw Exception("Not found");
		}
		
	}
	
	public int getPriceCode() {
		return _price.getPriceCode();
	}
	
	public void setPriceCode(int arg) {
		switch(arg) {
			case REGULAR:
				_price = new RegularPrice();
				break;
			case CHILDRENS:
				_price = new ChildrensPrice();
				break;
			case NEW_RELEASE:
				_price = new NewReleasePrice();
				break;
			default:
				throw new IllegalArgumentException("In correct Price code");
		}
	}
	
	public String getTitle() {
		return _title;
	}
	
	public double getCharge(int daysRented) {
		return _price.getCharge(daysRented);
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		return _price.getFrequentRenterPoints(daysRented);
	}
	
}
