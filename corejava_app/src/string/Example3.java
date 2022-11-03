package string;

public class Example3 {

	public static void main(String[] args) {
		
		String s = "Bangalore#Hyderabad#Vizag#Chennai#Hubli#Vijayawada#ATP#Kurnool#Chittor#Bellary";
		
		System.out.println(s);
		
		String s1[] = s.split("#");
		for(int i=0; i<s1.length; i++)
		{
			if(s1[i].startsWith("B"))
			{
				System.out.println(s1[i]);
			}
		}
	}
}
