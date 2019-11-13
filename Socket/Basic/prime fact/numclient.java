import java.io.*;
import java.net.*;

class numclient
{
	public static void main(String ars[])throws Exception
	{
	        Socket s=new Socket("localhost",12233);
	        BufferedReader brr=new BufferedReader(new InputStreamReader(System.in));      
	        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println("Enter a Number to check: ");
	        String str=brr.readLine();
	        bw.write(str);
	        bw.newLine();
		bw.flush();
                System.out.println("Message From Server:");
		System.out.println(br1.readLine());

brr.close();
br1.close();
bw.close();
s.close();	
}
}
		