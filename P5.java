public class P5{
	public static void main(String [] args){

		int lastNum = 9; 
		//Goes through numbers from 1 - 9
		for (int i = 1; i <= lastNum; i++){
			//Forms the required pattern. 1, 22, 333, 4444
			for (int a = 1; a <= i; a++){
				//Prints numbers. 1, 22 under each other
				System.out.print(i + "");
			}
			//prints all the numbers
			System.out.println();
		} 
	}
}