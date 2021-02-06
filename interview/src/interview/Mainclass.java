package interview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//this is the main class 
public class Mainclass {
	
	//this is the main method of the program
	public static void main(String[] args) throws FileNotFoundException 
	{
		//here we try to read from the text file input.txt
		FileInputStream fis = new FileInputStream("D:/New folder/input.txt");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(fis);
		//here we are trying to store the elements in the object array
		int number_of_employees = Integer.parseInt(sc.nextLine().split(": ")[1]);
		Goodie[] goodieslist = new Goodie[10];
		int i = 0;
		while (sc.hasNext()) {
			String[] nameprice = sc.nextLine().split(": ");
			Goodie g1 = new Goodie(nameprice[0], Integer.parseInt(nameprice[1]));
			goodieslist[i] = g1;
			i++;
		}
		//now the values present in the file are copied to the object array

		//in order to get the output we are calling this method 
		Goodies_sort.goodiecheck(goodieslist, number_of_employees);

		

	}
}
