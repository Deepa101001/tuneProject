package javaConcept;

import java.util.Random;

public class randomNumProgramm {
	
	public int randomNum()
	{ 
		Random rn = new Random();
		int answer = rn.nextInt(100000) ;
		return answer;
		
	}

	



	public static void main(String args[]) {
		randomNumProgramm randomN = new randomNumProgramm();
		
		int result = randomN.randomNum();
	System.out.println(result);
}
}
