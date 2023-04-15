import java.io.*;  
public class DataWriter {  
    public static void main(String[] args) {  
        try { 
        	InputStreamReader isr = new InputStreamReader(System.in);
    		BufferedReader br = new BufferedReader(isr);
    		System.out.println("please enter the file path with file name as extention");
    		String filepath=br.readLine();
            Writer w = new FileWriter(filepath);  
        	System.out.println("please enter some data to store in the file");
        	String data=br.readLine();
            w.write(data);   
            w.close();  
            System.out.println("Done");  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  
