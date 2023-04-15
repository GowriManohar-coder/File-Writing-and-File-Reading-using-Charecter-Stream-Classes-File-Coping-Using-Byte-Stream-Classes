import java.io.*;  
public class DataRead {  
    public static void main(String[] args) { 
    	InputStreamReader isr = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader(isr);
        try {
        	System.out.println("Enter the file path to read data:-");
        	String filepath = br.readLine();
            Reader reader = new FileReader(filepath);  
            int data = reader.read();  
            while (data!= -1) {  
                System.out.print((char)data);  
                data = reader.read();
            }  
            reader.close();
            br.close();
        } catch (Exception ex) {  
            System.out.println(ex.getMessage());  
        }  
    }  
}  