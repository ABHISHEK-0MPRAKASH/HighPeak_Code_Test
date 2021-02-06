package interview;

import java.io.FileWriter;

public class Goodies_sort {
	static Goodie temp;
	public static void goodiecheck(Goodie[] goodieslist, int empno) 
	{
		// sorting starts here
		for (int i = 0; i < goodieslist.length; i++) 
		{
			for (int j = 0; j < goodieslist.length; j++) 
			{

				if (goodieslist[i].getPrice() < goodieslist[j].getPrice()) 
				{
					temp = goodieslist[i];
					goodieslist[i] = goodieslist[j];
					goodieslist[j] = temp;
				}

			}

		}
		// till here the object array has been sorted

		// code for getting required output
		int min_diff = goodieslist[goodieslist.length - 1].getPrice();
		int min_index = 0;

		for (int i = 0; i < goodieslist.length - empno + 1; i++) {
			int diff = goodieslist[empno + i - 1].getPrice() - goodieslist[i].getPrice();

			if (diff <= min_diff) {
				min_diff = diff;
				min_index = i;
			}

		}
		
		
		
		//from here the output is being copied to the file called output.txt
		try {
			FileWriter fw = new FileWriter("D:/New folder/output.txt");
			fw.write("The goodies selected for distribution are: ");
			fw.write(System.getProperty("line.separator"));
			for (int i = min_index; i < min_index + empno; i++) {
				fw.write(goodieslist[i].toString());
				fw.write(System.getProperty("line.separator"));
			}
			fw.write(System.getProperty("line.separator"));

			fw.write("And the difference between the chosen goodie with");
			fw.write(System.getProperty("line.separator"));
			fw.write("highest price and the lowest price is "+min_diff);
			fw.close();
			} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		

	}

}
