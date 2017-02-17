/**
 * 
 */
package acadglidAssignment;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author nikhil13686
 *
 */
public class VowelCounet {

	/**
	 * Author - Nikhil Sharma
	 * Method Name - main
	 * Params- 
	 * Return Type - void
	 */
	public static void main(String[] args) throws IOException
	{
		try
		{
					FileReader objFileReader;
					int arrVowelCounter[] = {0,0,0,0,0};// initilaizing array counter 0 index for number of 'a', 1 for 'e', 2 for 'i', 3 for 'o' and 4 for 'u' 
					int totalvowels =0;
					int otherCharacters = 0;
					Scanner objScanner = new Scanner(System.in); // scanner object to take user input
					System.out.println("Please enter absolute Path of File you want to read");
					String filePath = objScanner.next(); // Read path of .txt file from user
					System.out.println("Please enter name  of File and proper path where you want to generate copy or just enter file name to create it in default location");
					objFileReader = new FileReader(filePath);
					
					
					int i;
					while((i=objFileReader.read()) != -1) // iterating till end of file
					{
						char ch = (char)i;
						switch(ch)
						{
							case 'a' :
							{
								arrVowelCounter[0]++;
								totalvowels ++;
							}
							break;
							case 'e' :
							{
								arrVowelCounter[1]++;
								totalvowels ++;
							}
							break;
							case 'i' :
							{
								arrVowelCounter[2]++;
								totalvowels ++;
							}
							break;
							case 'o' :
							{
								arrVowelCounter[3]++;
								totalvowels ++;
							}
							break;
							case 'u' :
							{
								arrVowelCounter[4]++;
								totalvowels ++;
							}
							break;
							default :
							{
								otherCharacters++;
							}
						}
						
					}
					System.out.println("\n Count of 'a'---" + arrVowelCounter[0]);
					System.out.println("\n Count of 'e'---" + arrVowelCounter[1]);
					System.out.println("\n Count of 'i'---" + arrVowelCounter[2]);
					System.out.println("\n Count of 'o'---" + arrVowelCounter[3]);
					System.out.println("\n Count of 'u'---" + arrVowelCounter[4]);
					System.out.println("\n Total vowels---" + totalvowels + "\n Total literals---" + otherCharacters);
					objFileReader.close();
					
					objScanner.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
