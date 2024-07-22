class Movie
{
	private String movieName;
	private double price;
	private String movieCatagory;
	private String language;
	private int noofTickets;
	int seats=150;
	
	public void setMovieName(String movieName)
	{
		this.movieName=movieName;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setMovieCatagory(String movieCatagory)
	{
		this.movieCatagory=movieCatagory;
	}
	public void setLanguage(String language)
	{
		this.language=language;
	}
	public void setNoofTickets(int noofTickets)
	{
		this.noofTickets=noofTickets;
	}
	public String getMovieName()
	{
		return movieName;
	}
	public double getPrice()
	{
		return price;
	}
	public String getMovieCatagory()
	{
		return movieCatagory;
	}
	public String getLanguage()
	{
		return language;
	}
	public int getNoofTickets()
	{
		return noofTickets;
	}
	public double getTotalPrice()
	{
		return price*noofTickets;
	}
	public int getAvailableTickets()
	{
		return seats-noofTickets;
	}
}
public class MovieIndustry {

	public static void main(String[] args) {
		Movie m=new Movie();
		m.setMovieName("KGF-2");
		m.setPrice(150);
		m.setMovieCatagory("Fighting PAN India");
		m.setLanguage("Kannada, Hindi, English");
		m.setNoofTickets(5);
		System.out.println("Name - "+m.getMovieName());
		System.out.println("Price - "+m.getPrice());
		System.out.println("Catagory - "+m.getMovieCatagory());
		System.out.println("Language - "+m.getLanguage());
		System.out.println("No of Tickets - "+m.getNoofTickets());
		System.out.println("Total price - "+m.getTotalPrice());
		System.out.println("Available Ticket - "+m.getAvailableTickets());

	}

}
