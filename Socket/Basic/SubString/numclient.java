import java.io.*;
import java.net.*;

class numclient
{
	public static void main(String ars[])throws Exception
	{
	      Socket s=new Socket("localhost",12234);
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
	      BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));

		System.out.println("Enter  String 1: ");
	        String str1=br.readLine();
		System.out.println("Enter String 2: ");
		String str2=br.readLine();
	        bw.write(str1);
	        bw.newLine();
		bw.flush();
		bw.write(str2);
	        bw.newLine();
		bw.flush();
		System.out.println("Message From Server :");
		System.out.println(brr.readLine());
             
br.close();
bw.close();
brr.close();
s.close();

}


}
		