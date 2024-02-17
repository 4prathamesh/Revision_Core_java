import java.util.*;
interface StringOperation
{
	void performOperation();

	//void setString(String str);
}
class StringToBinary implements StringOperation
{
	String str;
	void setString(String str)
	{
		this.str=str;
	}
	public void performOperation()
	{
		byte bytes[] = str.getBytes();
		  StringBuilder binary = new StringBuilder();
		  for (byte b : bytes)
		  {
		     int val = b;
		     for (int i = 0; i < 8; i++)
		     {
		        binary.append((val & 128) == 0 ? 0 : 1);
		        val <<= 1;
		     }
		     binary.append(' ');
		  }
		  System.out.println(" OUT PUT: " + binary);
	}
}
class StringToMorseCode implements StringOperation
{
	String str;
	void setString(String str)
	{
		this.str=str;
	}
	public void performOperation()
	{
		char word[]= { 'a', 'b', 'c', 'd', 'e', 'f',
                		'g', 'h', 'i', 'j', 'k', 'l',
                		'm', 'n', 'o', 'p', 'q', 'r',
                		's', 't', 'u', 'v', 'w', 'x',
                		'y', 'z', '1', '2', '3', '4',
                		'5', '6', '7', '8', '9', '0' };
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.",
        					"--.", "....", "..", ".---", "-.-", ".-..",
        					"--", "-.", "---", ".--.", "--.-", ".-.",
                			"...", "-", "..-", "...-", ".--", "-..-", 
                			"-.--", "--..", ".----","..---", "...--", 
                			"....-", ".....", "-....", "--...", "---..",
                			"----."};
        int k=0;
        for(int i=0;i<word.length;i++)
        {
        	char ch=str.charAt(k);
//        	System.out.println(k);
        	if(ch==word[i])
        	{
        		System.out.printf("%s",morse[i]);
        		i=-1;
        		k++;
        		if(k==str.length())
        		{
        			break;
        		}
        	}
        }
	}
}
public class StringOperation_9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		StringToBinary s= new StringToBinary();
		s.setString(str);
		s.performOperation();
		
		StringToMorseCode s1=new StringToMorseCode();
		s1.setString(str);
		s1.performOperation();
//		String s="prathamesh";
//		char ch=s.charAt(0);
//		byte[] a=s.toBinary();
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]);
//		}
	}
}