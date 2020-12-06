package str_randon_names;
import java.util.Random;
public class RandomNames 
{
String[] FirstName = {"John","Jack","Stephy","Jenifer","Sheryl"};
String[] LastName = {"Fernadous","Wilson","Edwin","Femin","Whisley"};
int NameNumber;
public RandomNames()
{
	NameNumber= 5;
}
public void GenerateRandom()
{
	Random rd = new Random();
	String firstName = FirstName[rd.nextInt(NameNumber)];
	String lastName = LastName[rd.nextInt(NameNumber)];
	System.out.println(firstName+" "+lastName);
}
public static void main(String[] args)
{
	RandomNames rn = new RandomNames();
	for(int count=0;count<3;count++)
	{
		rn.GenerateRandom();
	}
	System.out.println("***** WE GENERATE RANDOM NAMES SUCESSFULLY *****");
}
}
