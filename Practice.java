package Pa1;
import java.io.*;
public class Practice 
{
	public static void show()
	{
		String input="2025.txt";
		String output="myfile.txt";
		
		
		try(BufferedReader reader = 
		new BufferedReader(new FileReader(input));
	     
				
		BufferedWriter writer = 
				new BufferedWriter(new FileWriter(output)))
		{
			String content;
			
			while((content=reader.readLine())!=null)
			{
				System.out.println(content);
				String reversedLine=new StringBuilder(content).reverse().toString();
				
				System.out.println(reversedLine);
				
				writer.write(reversedLine);
				writer.newLine();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
	Practice.show();
		
	}
}
