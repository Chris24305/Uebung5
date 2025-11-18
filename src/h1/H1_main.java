package h1;

public class H1_main {
	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int copyOfCell, i;
		i = 0;
		while (i < myArray.length / 2) {
			copyOfCell = myArray[myArray.length - 1 - i];
			myArray[myArray.length - 1 - i] = myArray[i];
			myArray[i] = copyOfCell;
			i++;
		}
	/*	i = 0;
		while (i <= myArray.length - 1) {
			System.out.println(myArray[i]);
			i++;
		}*/
	}
}
