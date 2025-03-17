import java.io.*;
public class PracticeProblem {

	public static String getName(int line, String file){
		BufferedReader fr = null;
		String out = "";
		
		try{
			fr = new BufferedReader(new FileReader(file));
			if (line <=3){
			for (int i=0; i<line; i++){
				if ((out=fr.readLine())!=null){
					out = out.replaceAll("\\d","");
				}
			}
		}
		} 
		catch (IOException e){}

		finally {
			try{
				if (fr!=null){
					fr.close();
				}
			}
			catch (IOException e){}
		}
		return out.trim();
	}
	
}
