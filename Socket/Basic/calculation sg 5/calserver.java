import java.io.*;
import java.net.*;

class calserver
{
	public static void main(String ars[])throws Exception
	{
		ServerSocket s1=new ServerSocket(12233);
		System.out.println("Server wating for client .....");
		Socket s=s1.accept();
		
		System.out.println("Client accepted");
		BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String str=brr.readLine();
		System.out.println("Client's choice: "+str);
		int a=Integer.parseInt(str);
		int b=Integer.parseInt(brr.readLine());
		int c=Integer.parseInt(brr.readLine());
		int d=0;
		switch(a)
		{
		case 1:	
			d=b+c;
			break;
		case 2:	
			d=b-c;
			break;
		case 3:	
			d=b*c;
			break;
		case 4:	
			d=b/c;
			break;
		}
		bw.write(String.valueOf(d));
		bw.newLine();
		bw.flush();
		System.out.println("Server stop");		
	}
}