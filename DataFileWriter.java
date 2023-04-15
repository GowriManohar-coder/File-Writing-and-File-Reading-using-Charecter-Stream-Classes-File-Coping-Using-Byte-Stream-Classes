import java.io.*;

public class DataFileWriter {  
    public static void main(String args[]){    
         try{
        	 InputStreamReader isr = new InputStreamReader(System.in);
        		BufferedReader br = new BufferedReader(isr);
        		System.out.println("please enter the file path with file name as extention");
        		String filepath=br.readLine();
           FileWriter fw=new FileWriter(filepath);
   		   System.out.println("please enter some data to store in the file");
   		   String data=br.readLine();
   		   fw.write(data);   
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}  