package fedEx;

public class FIbonacci {

	public static void print (String message){
		System.out.println(message);
	}

	//FInd the first 10 numbers in the Fibonacci sequence
	public static void main (String[] args){

		int START_AT = 0;
		int END_AT = 10;
		int currentlyAt = START_AT;

		int prevNum = 0;
		int curNum = 0;
		int newNum = 0;

		for (currentlyAt++; currentlyAt <= END_AT; currentlyAt ++){
			if (curNum == 0){
				print(curNum + "");
				curNum = 1;
				print(curNum + "");
			} else {
				newNum = curNum + prevNum;
				print (newNum + "");
				prevNum = curNum;
				curNum = newNum;
			}
		}

	}
}
