import java.io.*;
import java.net.*;

class numclient
{
	public static void main(String ars[])throws Exception
	{
	      Socket s=new Socket("localhost",12233);
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
	      BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));

	        System.out.println("Student's Roll No:");
	        String str1=br.readLine();
		System.out.println("Students Name:");
	        String str2=br.readLine();
		System.out.println("Enter Phone No:");
		String str3=br.readLine();
		System.out.println("Enter College Name:");
		String str4=br.readLine();

	        bw.write(str1);
	        bw.newLine();
		bw.flush();
		bw.write(str2);
	        bw.newLine();
		bw.flush();
		bw.write(str3);
	        bw.newLine();
		bw.flush();
		bw.write(str4);
	        bw.newLine();
		bw.flush();
                System.out.println("Message From Server :");
               System.out.println("Status: "+brr.readLine());
br.close();
bw.close();
brr.close();


}


}
		