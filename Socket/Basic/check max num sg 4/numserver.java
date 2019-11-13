import java.io.*;
import java.net.*;

class numserver
{
	public static void main(String ars[])throws Exception
	{
		ServerSocket s1=new ServerSocket(12233);
		System.out.println("Server wating for client .....");
		Socket s=s1.accept();
		
		System.out.println("Client accepted");
		BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));


		int a,b,c,max;
		a=Integer.parseInt(brr.readLine());
		b=Integer.parseInt(brr.readLine());
		c=Integer.parseInt(brr.readLine());
		max=a;
		if(max<b)
		max=b;
		if(max<c)
		max=c;
                bw.write(String.valueOf(max));
		bw.newLine();
		bw.flush();

		
	}
}