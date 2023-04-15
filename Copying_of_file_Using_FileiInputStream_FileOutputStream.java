import java.io.*;
public class Copying_of_file_Using_FileiInputStream_FileOutputStream {

	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("enter the source file path that need to be copied");
			var source = br.readLine();
			System.out.println("enter the destination file path where it need to be copied ");
			var target = br.readLine();
			File src = new File(source);
			File tar = new File(target);
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(tar);
			byte data[] = new byte[512];
			while(fis.read(data)!=-1) {
				fos.write(data);
			}
		   fis.close();
		   fos.close();
		   System.out.println("The file is copied successfully");
		}
		catch (Exception e) {}
	}

}
