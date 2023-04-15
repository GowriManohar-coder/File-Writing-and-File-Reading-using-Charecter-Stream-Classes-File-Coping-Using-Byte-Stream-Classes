import java.io.*;  
public class DataFileBufferedReader {  
    public static void main(String args[])throws Exception{
    	InputStreamReader isr = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader(isr);
    	System.out.println("enter the file path to read:-");
    	String filepath = br.readLine();
          FileReader fr=new FileReader(filepath);
          BufferedReader br1 = new BufferedReader(fr);
          int data = br1.read();   
          while(data!=-1) {  
          System.out.print((char)data); 
          data = br1.read();
          }
          fr.close(); 
          br.close();
          br1.close();
    }    
}    