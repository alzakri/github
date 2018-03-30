
public class Palindrom {
	
	
	
	public static long nbPalindromLeq(int d) {

		long nbP;
		if((d%2)==0)
			nbP=(long) (2*(Math.pow(10, d/2))-1);
		else
			nbP=(long) (11*(Math.pow(10, (d-1)/2))-1);
		
		if(d>30 && d<37)
			 nbP--;
		 
		
		return nbP;
		
			
	}
	
}

