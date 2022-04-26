package activitives;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double seconds = 1000000000;
		double mercuryseconds = 0.2408467;
		double venusseconds = 0.61519726;
		double earthseconds = 31557600;
		double marsseconds = 1.8808158;
		double jupiterseconds = 11.862615;
		double saturnseconds = 29.447498;
		double uranusseconds = 84.016846 ;
		double neptuneseconds = 164.79132;
		
		System.out.println("Age of mercury:"+ seconds/earthseconds/mercuryseconds);
		System.out.println("Age of venus:"+ seconds/earthseconds/venusseconds);
		System.out.println("Age of earth:"+ seconds/earthseconds);
		System.out.println("Age of mars:"+ seconds/earthseconds/marsseconds);
		System.out.println("Age of jupiter:"+ seconds/earthseconds/jupiterseconds);
		System.out.println("Age of saturn:"+ seconds/earthseconds/saturnseconds);
		System.out.println("Age of uranus:"+ seconds/earthseconds/uranusseconds);
		System.out.println("Age of neptune:"+ seconds/earthseconds/neptuneseconds);
		
		
		

	}

}
