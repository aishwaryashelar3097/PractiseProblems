import java.util.Scanner;

//  find the occurrences
// of character x in the infinite
// repeated string upto length n
class CountOccurences
{
// Function to count the character 'a'
static int countChar(String str, char x)
{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the string");
	char o = sc.next().charAt(0);
	sc.nextLine();
	int count = 0;
	int n = 9;
	for (int i = 0; i < str.length(); i++)
		if (str.charAt(i) == x)
			count++;

	// atleast k repetition are required
	int repetitions = n / str.length();
	count = count * repetitions;

	// if n is not the multiple of the
	// string size check for the remaining
	// repeating character.
	for (int i = 0;
			i < n % str.length(); i++)
	{
		if (str.charAt(i) == x)
			count++;
	}

	return count;
}

// Driver code
public static void main(String args[])
{
	String str = "aaabbsdss";
	System.out.println(countChar(str, 'a'));
}
}
