package _02_Integer_Stack;

public class IntegerStack {
	//1. create a private array of integers
	private int[] array;
	//2. complete the constructor by initializing the member array
	//   to a new array of length 0. This prevents null pointer exceptions.
	public IntegerStack() {
		array = new int[0];
	}
	
	//3. Complete the steps in the push method.
	public void push(int v) {
		//A. create a new array that is one element larger than the member array
		int[] pushArr = new int[array.length+1];
		//B. set the last element of the new array equal to the integer passed into the method
		pushArr[pushArr.length-1] = v;
		//C. iterate through the member array and copy all the elements into the new array
		for (int i = 0; i < array.length; i++) {
			pushArr[i] = array[i];
		}
		//D. set the member array equal to the new array.
		array = pushArr;
	}
	
	//4. Complete the steps in the pop method.
	public int pop() {
		//A. create an integer variable and initialize it to the
		//   last element of the member array.
		int popInt = array[array.length-1];
		//B. create a new array that is one element smaller than the member array
		int[] popArr = new int[array.length-1];
		//C. iterate through the new array and copy every element from the
		//   member array to the new array
		for (int i = 0; i < popArr.length; i++) {
			popArr[i] = array[i];
		}
		//D. set the member array equal to the new array
		array = popArr;
		//E. return the variable you created in step A
		return popInt;
	}
	
	//5. Complete the clear method to set the
	//   member array to a new array of length 0
	public void clear() {
		int[] clearArr = new int[0];
		array = clearArr;
	}
	
	//6. Complete the size method to return 
	//   the length of the member array
	public int size() {
		return array.length;
	}
}
