import java.io.*;  
public class DataFileReader {  
    public static void main(String args[]){
    	InputStreamReader isr = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader(isr);
    try {	
    	System.out.println("enter the file path to read:-");
    	String filepath = br.readLine();
          FileReader fr=new FileReader(filepath);    
          int data = fr.read();   
          while(data!=-1) {  
          System.out.print((char)data); 
          data = fr.read();
          }
          fr.close(); 
          br.close();
       }catch (Exception ex) {  
           System.out.println(ex.getMessage());  
       }    
    }    
}    