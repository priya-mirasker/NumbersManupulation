/*Class to effectively find if a given number is prime 
 * @author Priya Mirasker(priya.mirasker@gmail.com)
 * 
 * */

public class primeNumbers {
	/* Method to return true/false if given number is prime 
	 * @param num - integer number to check 
	 * @return bool - true if number is prime, false if number is not prime. 
	 */
	public boolean findPrime(int num) {	
		boolean bool = true;
		if(num==1|| num==2){
			return bool;
		}
		else{	
			for(int i=2;i<num;i++) {
				if(num%i==0){
					bool = false;
					break;
				}
				else{
					if(i!=num-1)
						continue;
					else
						bool = true;				
				}				
			}
		}
		return bool;		
	}
}
