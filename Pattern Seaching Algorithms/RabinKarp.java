public class RabinKarp 
{ 
	public final static int d = 10; 
	
	static void rabinKarp(String text, String pattern, int q) 
	{ 
		int m = pattern.length(); 
		int n = text.length(); 
		
		int i,j;
		int p=0; // hash value for pattern
		int t=0; // hash value for text
		
		int h = 1; 
	
		// The value of h would be "pow(d, M-1)%q" 
		for (i = 0; i < m-1; i++) 
			h = (h*d)%q; 
	
		//Calculating the hash value of the pattern and the first window of the text
		for (i = 0; i < m; i++) 
		{ 
			p = (d*p + pattern.charAt(i))%q; 
			t = (d*t + text.charAt(i))%q; 
		} 
	
		 //Sliding the pattern over the text one by one
		for (i = 0; i <= n - m; i++) 
		{ 
			//Check the hash value of the current window of text and pattern
        	//If the hash values match then check for the characters one by one
			if ( p == t ) 
			{ 
				for (j = 0; j < m; j++) 
				{ 
					if (text.charAt(i+j) != pattern.charAt(j)) 
						break; 
				} 

				if (j == m) 
					System.out.println("Pattern found at index " + (i+1)); 
				
				
			} 
			
			// Calculating the hash value for the next window of text:
        	// Remove the trailing digit and adding the leading digit
	
			if ( i < n-m ) 
			{ 
				//in case we get a negative value of t, convert it into a positive value
				t = (d*(t - text.charAt(i)*h) + text.charAt(i+m))%q; 
				if (t < 0) 
					t = (t + q); 
			} 
		} 
	} 
	
	public static void main(String[] args) 
	{ 
		String text = "ABCCDDAEFG"; 
		String pattern = "CDD"; 
		int q = 13;
		rabinKarp(text, pattern, q); 
	} 
}