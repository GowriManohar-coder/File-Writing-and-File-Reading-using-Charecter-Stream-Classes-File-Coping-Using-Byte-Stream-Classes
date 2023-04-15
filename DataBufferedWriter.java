import java.io.*;  
public class DataBufferedWriter {  
public static void main(String[] args) throws IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	System.out.println("please enter the file path with file name as extention");
	String filepath=br.readLine();
    FileWriter writer = new FileWriter(filepath);  
    BufferedWriter buffer = new BufferedWriter(writer); 
	System.out.println("please enter some data to store in the file");
	String data=br.readLine();
    buffer.write(data);  
    buffer.close();
    writer.close();
    System.out.println("Success");  
    }  
}  