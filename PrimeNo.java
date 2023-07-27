//Coding Ninja

public class PrimeNo {
	public static String isPrime(int num) {
		//Your code goes here

		String flag = "YES";
		if(num == 1){
			return "NO";
			
		}
		for(int i = 2; i<Math.sqrt(num); i++){
			if(num % i == 0){
				flag = "NO";
                break;
			}
			
		}
       return flag;
		
	 }
	
}
