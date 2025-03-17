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
	


	public static int getAge(int line, String file){
		BufferedReader br = null;
		String out = "";
		
		try{
			br = new BufferedReader(new FileReader(file));
			if (line <=3){
			for (int i=0; i<line; i++){
				if ((out=br.readLine())!=null){
					out = out.replaceAll("[^\\d]","");
					out = out.substring(0,2);
				}
			}
		}
		} 
		catch (IOException e){}

		finally {
			try{
				if (br!=null){
					br.close();
				}
			}
			catch (Exception e){}
		}
		if (out != ""){
		return Integer.parseInt(out);
		}
		else {
			return -1;
		}
	}
}
